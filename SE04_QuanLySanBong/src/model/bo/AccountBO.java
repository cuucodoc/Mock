package model.bo;

import java.util.ArrayList;

import model.bean.AccountBean;
import model.dao.AccountDAO;

public class AccountBO {

	AccountDAO accountDAO = new AccountDAO();
	
	public  ArrayList<AccountBean> getListAccount() {
		
		return accountDAO.getListAccount();
	}

	public void suaAccount(String tdp, String passWord, String hoTen,
			String sdt, String diaChi, String email) {
		
		accountDAO.suaAccount(tdp,passWord,hoTen,sdt,diaChi,email);
		
	}

	public AccountBean getThongTinAccount(String tdp) {
		// TODO Auto-generated method stub
		return accountDAO.getThongTinAccount(tdp);
	}

	public void xoaAccount(String tdp) {
		// TODO Auto-generated method stub
		accountDAO.xoaAccount(tdp);
	}

	public boolean checkAccount(String tenDangNhap) {
		// TODO Auto-generated method stub
		return accountDAO.checkAccount(tenDangNhap);
	}

	public void themAccount(String tenDangNhap, String passWord, String hoTen,
			String sdt, String diaChi, String email, int diemTichLuy,
			String role) {
		
		accountDAO.themAccount(tenDangNhap,passWord,hoTen,sdt,diaChi,email,diemTichLuy,role);
		// TODO Auto-generated method stub
		
	}
	
	
	
}
