package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.ChiTietDatSanBean;

public class ChiTietDatSanDAO {
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
	
	public ArrayList<ChiTietDatSanBean> getListChiTietDatSan(String maSan, String ngayDa, String maKhungGioDa) {
		
		String sql = "select madichvu,dongia, soluong from chitietdatsan where masan='"+maSan+"' and ngayda='"+ngayDa+"' and makhunggioda='"+maKhungGioDa+"'";
		ResultSet rs=null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<ChiTietDatSanBean> list = new ArrayList<ChiTietDatSanBean>();
		ChiTietDatSanBean chiTietDatSanBean;
		try {
			while (rs.next()) {
				chiTietDatSanBean = new ChiTietDatSanBean();
				chiTietDatSanBean.setMaDichVu(rs.getString("madichvu"));
				chiTietDatSanBean.setDonGia(rs.getFloat("dongia"));
				chiTietDatSanBean.setSoLuong(rs.getInt("soluong"));
				list.add(chiTietDatSanBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
