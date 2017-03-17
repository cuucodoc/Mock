package model.bean;

public class AccountBean {
	private String tenDangNhap;
	private String passWord;
	private String hoTen;
	private String sdt;
	private String diaChi;
	private String email;
	private int diemTichLuy;
	private String role;
	
	
	/**
	 * 
	 * @param tendangnhap
	 * @param passWord
	 * @param hoten
	 * @param sdt
	 * @param diachi
	 * @param email
	 * @param diemtichluy
	 * @param role
	 */
	
	public AccountBean(String tenDangNhap, String passWord, String hoten,
			String sdt, String diachi, String email, int diemtichluy,
			String role) {
		super();
		this.tenDangNhap = tenDangNhap;
		this.passWord = passWord;
		this.hoTen = hoten;
		this.sdt = sdt;
		this.diaChi = diachi;
		this.email = email;
		this.diemTichLuy = diemtichluy;
		this.role = role;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "AccountBean [diachi=" + diaChi + ", diemtichluy=" + diemTichLuy
				+ ", email=" + email + ", hoten=" + hoTen + ", passWord="
				+ passWord + ", role=" + role + ", sdt=" + sdt
				+ ", tenDangNhap=" + tenDangNhap + "]";
	}

	
	/**
	 * @return the tenDangNhap
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}

	/**
	 * @param tenDangNhap the tenDangNhap to set
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the sdt
	 */
	public String getSdt() {
		return sdt;
	}

	/**
	 * @param sdt the sdt to set
	 */
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}

	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the diemTichLuy
	 */
	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	/**
	 * @param diemTichLuy the diemTichLuy to set
	 */
	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	public AccountBean() {
		super();
	}
	
	
}
