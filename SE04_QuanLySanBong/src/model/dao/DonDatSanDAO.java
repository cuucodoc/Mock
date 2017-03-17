package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.ChiTietDatSanBean;
import model.bean.DatSanBean;
import model.bean.Pagination;

public class DonDatSanDAO {

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

	public ArrayList<DatSanBean> getListDatSan() {

		String sql = "select * from datsan";
		ResultSet rs = null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<DatSanBean> list = new ArrayList<DatSanBean>();
		DatSanBean datSanBean;
		try {
			while (rs.next()) {
				datSanBean = new DatSanBean();
				datSanBean.setMaSan(rs.getString("masan"));
				datSanBean.setNguoiDatSan(rs.getString("nguoidatsan"));
				datSanBean.setNgayDatSan(rs.getString("ngaydatsan"));
				datSanBean.setNgayDa(rs.getString("ngayda"));
				datSanBean.setMaKhungGioDa(rs.getString("makhunggioda"));
				list.add(datSanBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<ChiTietDatSanBean> getListChiTietDatSan(String maSan, String ngayDa, String maKhungGioDa) {
		String sql = "SELECT madichvu, dongia, soluong FROM chitietdatsan WHERE masan = '" + maSan + "' and ngayda='"
				+ ngayDa + "' and makhunggioda='" + maKhungGioDa + "'";
		ResultSet rs = null;
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
				chiTietDatSanBean.setMaSan(rs.getString("masan"));
				chiTietDatSanBean.setMaDichVu(rs.getString("madichvu"));
				chiTietDatSanBean.setSoLuong(rs.getInt("soluong"));
				chiTietDatSanBean.setDonGia(rs.getFloat("dongia"));
				chiTietDatSanBean.setNgayDa(rs.getDate("ngayda"));
				chiTietDatSanBean.setMaKhungGioDa(rs.getString("ngayda"));
				list.add(chiTietDatSanBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// public ArrayList<DatSanBean> getListDatSanBeanName(String key) {
	// con.connect();
	// String sql= "SELECT sv.msv, sv.HoTen, sv.GioiTinh, k.TenKhoa "+
	// " FROM DatSanBean sv INNER JOIN Khoa AS k ON k.MaKhoa = sv.MaKhoa"+
	// " WHERE sv.HoTen like N'%"+key+"%'";
	// ResultSet rs = null;
	// try {
	// Statement stmt = conn.createStatement();
	// rs = stmt.executeQuery(sql);
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	//
	// ArrayList<DatSanBean> list = new ArrayList<DatSanBean>();
	// DatSanBean datSanBean;
	// try {
	// while(rs.next()){
	// datSanBean = new DatSanBean();
	// datSanBean.setMsv(rs.getString("msv"));
	// datSanBean.setHoTen(rs.getString("HoTen"));
	// datSanBean.setGioiTinh(rs.getString("GioiTinh"));
	// datSanBean.setTenKhoa(rs.getString("TenKhoa"));
	// list.add(datSanBean);
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return list;
	// }

	public void themDatSan(String maSan, String nguoiDatSan, String ngayDa, String maKhungGioDa) {
		String sql = "INSERT INTO datsan(masan,nguoidatsan,ngaydatsan,ngayda,makhunggioda) VALUES ('" + maSan + "','"
				+ nguoiDatSan + "', GETDATE() ,'" + ngayDa + "','" + maKhungGioDa + "')";
		try {
			Statement stmt = getConnect().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public DatSanBean getThongTinDatSan(String maSan, String ngayDa, String maKhungGioDa) {
		String sql = "SELECT * FROM datsan WHERE masan = '" + maSan + "'and ngayda = '" + ngayDa
				+ "'and makhunggioda = '" + maKhungGioDa + "'";
		ResultSet rs = null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		DatSanBean datSanBean = new DatSanBean();
		try {
			while (rs.next()) {
				datSanBean.setMaSan(maSan);
				datSanBean.setNguoiDatSan(rs.getString("nguoidatsan"));
				datSanBean.setNgayDatSan(rs.getString("ngaydatsan"));
				datSanBean.setNgayDa(rs.getString("ngayda"));
				datSanBean.setMaKhungGioDa(rs.getString("makhunggioda"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return datSanBean;
	}

	public void suaDatSan(String maSan, String nguoiDatSan, String ngayDatSan, String ngayDa, String maKhungGioDa) {
		String sql = "UPDATE datsan SET nguoidatsan = N'" + nguoiDatSan + "', ngaydatsan = '" + ngayDatSan
				+ "', makhunggioda='" + maKhungGioDa + "',  masan = '" + maSan + "',ngayda = '" + ngayDa
				+ "'  WHERE masan = '" + maSan + "' and ngayda = '" + ngayDa + "'and makhunggioda = '" + maKhungGioDa
				+ "'";
		try {
			Statement stmt = getConnect().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void xoaDatSan(String maSan, String ngayDa, String maKhungGioDa) {

		String sql = "DELETE FROM datsan WHERE masan = '" + maSan + "' and ngayDa='" + ngayDa + "' and makhunggioda='"
				+ maKhungGioDa + "'";
		System.out.println(sql);
		try {
			Statement stmt = getConnect().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<DatSanBean> phanTrangDanhSach(int page) {

		int totalItem = 0;
		int itemPerPage = 5;
		int totalPage = 0;
		int offset = page * itemPerPage;
		int feetchnext = page * itemPerPage + itemPerPage;

		String sql0 = "SELECT count(sv.msv) as TotalItem" + " FROM   DatSan ds";
		ResultSet rs0 = null;
		try {
			Statement stmt0 = getConnect().createStatement();
			rs0 = stmt0.executeQuery(sql0);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs0.next()) {
				totalItem = rs0.getInt("TotalItem");
				totalPage = (int) Math.ceil(totalItem * 1.0 / itemPerPage);
				Pagination.page = page;
				Pagination.totalPage = totalPage;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "" + "SELECT * FROM" + " ("
				+ " SELECT ROW_NUMBER() OVER ( ORDER BY masan )  AS RowNum, masan, nguoidatsan, ngaydatsan, ngayda, makhunggioda"
				+ " ) AS RowConstrainedResult" + " WHERE   RowNum > " + offset + " AND RowNum <= " + feetchnext
				+ " ORDER BY RowNum";
		ResultSet rs = null;
		try {
			Statement stmt = getConnect().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<DatSanBean> list = new ArrayList<DatSanBean>();
		DatSanBean datSanBean;
		try {
			while (rs.next()) {
				datSanBean = new DatSanBean();
				datSanBean.setMaSan(rs.getString("masan"));
				datSanBean.setNguoiDatSan(rs.getString("nguoidatsan"));
				datSanBean.setNgayDatSan(rs.getString("ngaydatsan"));
				datSanBean.setNgayDa(rs.getString("ngayda"));
				datSanBean.setMaKhungGioDa(rs.getString("makhunggioda"));
				list.add(datSanBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		page = 10;
		return list;
	}
}
