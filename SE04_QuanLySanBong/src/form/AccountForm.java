package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.AccountBean;

public class AccountForm extends ActionForm{
	private String tenDangNhap;
	private String passWord;
	private String thongBao;
	private ArrayList<AccountBean> listAccount;
	private AccountBean account;
	
	
	/**
	 * 
	 * @param tenDangNhap
	 * @param passWord
	 * @param thongBao
	 * @param listAccount
	 * @param account
	 */
	public AccountForm(String tenDangNhap, String passWord, String thongBao,
			ArrayList<AccountBean> listAccount, AccountBean account) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.passWord = passWord;
		this.thongBao = thongBao;
		this.listAccount = listAccount;
		this.account = account;
	}

	/**
	 * 
	 * @return
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	
	/**
	 * 
	 * @param tenDangNhap
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPassWord() {
		return passWord;
	}
	
	/**
	 * 
	 * @param passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getThongBao() {
		return thongBao;
	}
	
	/**
	 * 
	 * @param thongBao
	 */
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<AccountBean> getListAccount() {
		return listAccount;
	}
	
	/**
	 * 
	 * @param listAccount
	 */
	public void setListAccount(ArrayList<AccountBean> listAccount) {
		this.listAccount = listAccount;
	}
	
	/**
	 * 
	 * @return
	 */
	public AccountBean getAccount() {
		return account;
	}
	
	/**
	 * 
	 * @param account
	 */
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "AccountForm [account=" + account + ", listAccount="
				+ listAccount + ", passWord=" + passWord + ", tenDangNhap="
				+ tenDangNhap + ", thongBao=" + thongBao + "]";
	}
	
	
	
	
	
}
