package model.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.DichVuBean;

public class DichVuDAO {
	Connection connection;
	ResultSet rs;
	Statement stms;

	public Connection getConnect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			connection = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=QuanLySanBong_SE04; username=sa; password=12345678");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	

	public ArrayList<DichVuBean> getListDichVu() {

		String sql = "select * from dichvu";
		ResultSet rs=null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<DichVuBean> list = new ArrayList<DichVuBean>();
		DichVuBean dichVuBean;
		try {
			while (rs.next()) {
				dichVuBean = new DichVuBean();
				dichVuBean.setMaDichVu(rs.getString("maDichVu"));
				dichVuBean.setTenDichVu(rs.getString("tenDichVu"));
				dichVuBean.setDonGia(rs.getFloat("donGia"));
				list.add(dichVuBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<DichVuBean> getListDichVuBeans(String maDichVu) {
		String sql = String.format("SELECT ct.masan, ct.madichvu, ct.dongia, ct.soluong, ct.ngayda, ct.makhunggioda"
				+ " FROM   chitietdatsan ct INNER JOIN dichvu as dv ON dv.masan=ct.madichvu" + " WHERE dv.madichvu = '%s'",
				maDichVu);
		ResultSet rs = null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<DichVuBean> list = new ArrayList<DichVuBean>();
		DichVuBean dichVuBean;
		try {
			while (rs.next()) {
				dichVuBean = new DichVuBean();
				dichVuBean.setMaDichVu(rs.getString("maDichVu"));
				dichVuBean.setTenDichVu(rs.getString("tenDichVu"));
				dichVuBean.setDonGia(rs.getInt("donGia"));				
				list.add(dichVuBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void themDichVu(String maDichVu, String tenDichVu, float donGia) {
		String sql = "insert into dichvu(madichvu,tendichvu,dongia) values('"+maDichVu+"',N'"+tenDichVu+"',"+donGia+")";

		try {
			Statement stmt = getConnect().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public DichVuBean getDichVu(String mdv) {
		getConnect();
		String sql="SELECT * from dichvu WHERE madichvu = '"+mdv+"'"; 
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DichVuBean dichVuBean = new DichVuBean();
		try {
			while(rs.next()){
				dichVuBean.setMaDichVu(mdv);
				dichVuBean.setTenDichVu(rs.getString("tendichvu"));
				dichVuBean.setDonGia(rs.getFloat("dongia"));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dichVuBean;
	}

	public void suaDichVu(String maDichVu, String tenDichVu,float donGia) {
		getConnect();
		String sql=	"UPDATE dichvu set tendichvu=N'"+tenDichVu+"', dongia="+donGia+" where madichvu='"+maDichVu+"'";
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void xoaDichVu(String madichvu){
		getConnect();
		String sql="delete from dichvu where madichvu='"+madichvu+"'";
		System.out.println(sql);
		try {
			Statement stmt=connection.createStatement();
			stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public DichVuBean getThongTinSinhVien(String maDichVu) {
		getConnect();
		String sql=	"select * from dichvu where madichvu = '"+maDichVu+"'";
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DichVuBean dichVuBean = new DichVuBean();
		try {
			while(rs.next()){
				dichVuBean.setMaDichVu(maDichVu);
				dichVuBean.setTenDichVu(rs.getString("tendichvu"));
				dichVuBean.setDonGia(rs.getFloat("dongia"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dichVuBean;
	}


	public ArrayList<DichVuBean> phanTrangDanhSach(int page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

