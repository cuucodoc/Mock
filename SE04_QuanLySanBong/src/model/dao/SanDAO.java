package model.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.ConnectDB;

import model.bean.SanBean;




public class SanDAO {
	
	ConnectDB db = new ConnectDB();
	
	public ArrayList<SanBean> getListSan() {
		db.connect();
		String sql=	"select masan, tensan, loaisan, giacoban, trangthai from san";
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		
		ArrayList<SanBean> list = new ArrayList<SanBean>();
		SanBean sanBean;
		try {
			while(rs.next()){
				sanBean = new SanBean();
				sanBean.setMaSan(rs.getString("masan"));
				sanBean.setTenSan(rs.getString("tensan"));
				sanBean.setLoaiSan(rs.getString("loaisan"));
				sanBean.setGiaCoBan(rs.getFloat("giacoban"));
				sanBean.setTrangThai(rs.getInt("trangthai"));
				list.add(sanBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void addSan(String maSan, String tenSan, String loaiSan, float giaCoBan, int trangThai) {
		db.connect();
		String sql=	String.format("insert into san (masan, tensan, loaisan,giacoban,trangthai) "+
					" VALUES ('%s',N'%s',N'%s' , %s ,%s )", maSan,tenSan,loaiSan,giaCoBan,trangThai);
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public SanBean getThongTinSan(String maSan) {
		db.connect();
		String sql=	String.format("select masan, tensan, loaisan, giacoban, trangthai "+
					" FROM san WHERE masan = '%s'", maSan);
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		SanBean sanBean = new SanBean();
		try {
			while(rs.next()){
				sanBean.setMaSan(maSan);
				sanBean.setTenSan(rs.getString("tensan"));
				sanBean.setLoaiSan(rs.getString("loaisan"));
				sanBean.setGiaCoBan(rs.getFloat("giacoban"));
				sanBean.setTrangThai(rs.getInt("trangthai"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sanBean;
	}
	public void editSan(String maSan, String tenSan, String loaiSan, float giaCoBan, int trangThai) {
		db.connect();
		String sql=	String.format("UPDATE san "+
					" SET  tensan = N'%s', loaisan = N'%s',giacoban = %s,trangthai = %s " +
					" WHERE masan = '%s'", tenSan,loaiSan,giaCoBan,trangThai,maSan);
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteSan(String maSan) {
		db.connect();
		String sql=	String.format("DELETE FROM san WHERE masan = '%s'", maSan);
		System.out.println(sql);
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
