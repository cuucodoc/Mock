package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.bean.KhungGioBean;

public class KhungThoiGianDAO {
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

	public ArrayList<KhungGioBean> getListThoiGian() {

		String sql = "select * from khungthoigian";
		ResultSet rs = null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<KhungGioBean> list = new ArrayList<KhungGioBean>();
		KhungGioBean khungGioBean;
		try {
			while (rs.next()) {
				khungGioBean = new KhungGioBean();
				khungGioBean.setMaThoiGian(rs.getString("mathoigian"));
				khungGioBean.setThoiGian(rs.getString("thoigian"));
				khungGioBean.setGiaTriTinh(rs.getFloat("giatritinh"));
				list.add(khungGioBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
