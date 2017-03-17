package model.dao;

import java.sql.*;
import java.util.ArrayList;


import model.bean.AccountBean;

import common.ConnectDB;

public class AccountDAO {

	ConnectDB db = new ConnectDB();
	
	public ArrayList<AccountBean> getListAccount(){
		//db.connect();
		String sql ="select * from account";
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ArrayList<AccountBean> listAccount = new ArrayList<AccountBean>();
		AccountBean account;
		try {
			while(rs.next())
			{
				account = new AccountBean();
				account.setTenDangNhap(rs.getString("tendangnhap"));
				account.setPassWord(rs.getString("password"));
				account.setHoTen(rs.getString("hoten"));
				account.setSdt(rs.getString("sdt"));
				account.setDiaChi(rs.getString("diachi"));
				account.setEmail(rs.getString("email"));
				account.setDiemTichLuy(rs.getInt("diemtichluy"));
				account.setRole(rs.getString("role"));
				listAccount.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return listAccount;
	}
	

	public void suaAccount(String tdp, String passWord, String hoTen,
			String sdt, String diaChi, String email) {
		// TODO Auto-generated method stub
		String sql=	String.format("UPDATE account "+
				" SET password = '%s', hoten = N'%s' ,sdt = '%s', diachi = N'%s', email = '%s' " +
				" WHERE tendangnhap = '%s'", passWord, hoTen, sdt , diaChi, email,tdp);
		
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public AccountBean getThongTinAccount(String tdp) {
		// TODO Auto-generated method stub
	//	db.connect();
	//	String sql = "Select * from account where tendangnhap='admin'";
		String sql=	String.format("SELECT * FROM account WHERE tendangnhap = '%s'", tdp);
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		AccountBean account = new AccountBean();
		
		try {
			while(rs.next()){
				account.setTenDangNhap(tdp);
				account.setPassWord(rs.getString("password"));
				account.setHoTen(rs.getString("hoten"));
				account.setSdt(rs.getString("sdt"));
				account.setDiaChi(rs.getString("diachi"));
				account.setEmail(rs.getString("email"));
				account.setDiemTichLuy(rs.getInt("diemtichluy"));
				account.setRole(rs.getString("role"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return account;
	}


	public void xoaAccount(String tdp) {
		// TODO Auto-generated method stub
		String sql = String.format("Delete account where tendangnhap = '%s'",tdp);
		System.out.print(sql);
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}


	public boolean checkAccount(String tenDangNhap) {
		// TODO Auto-generated method stub
		String sql=	String.format("SELECT tendangnhap FROM account WHERE tendangnhap = '%s' ", tenDangNhap);
		ResultSet rs = null;
		try {
			Statement stmt = db.getConnection().createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}


	public void themAccount(String tenDangNhap, String passWord, String hoTen,
			String sdt, String diaChi, String email, int diemTichLuy,
			String role) {
		String sql = String.format("insert into account values('%s','%s','%s','%s','%s','%s',%s,'%s')", tenDangNhap,passWord,hoTen,sdt,diaChi,email,diemTichLuy,role);
		try {
			Statement stmt = db.getConnection().createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}
	
	/*public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		AccountBean ac = dao.getThongTinAccount("admin");		
			System.out.println(ac.toString());
	}*/
}
