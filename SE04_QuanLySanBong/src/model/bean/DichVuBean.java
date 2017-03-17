package model.bean;

public class DichVuBean {
	private String maDichVu;
	private String tenDichVu;
	private float donGia;
	/**
	 * @return the maDichVu
	 */
	public String getMaDichVu() {
		return maDichVu;
	}
	/**
	 * @param maDichVu the maDichVu to set
	 */
	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}
	/**
	 * @return the tenDichVu
	 */
	public String getTenDichVu() {
		return tenDichVu;
	}
	/**
	 * @param tenDichVu the tenDichVu to set
	 */
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	/**
	 * @return the donGia
	 */
	public float getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	/**
	 * @param maDichVu
	 * @param tenDichVu
	 * @param donGia
	 */
	public DichVuBean(String maDichVu, String tenDichVu, float donGia) {
		super();
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.donGia = donGia;
	}
	public DichVuBean() {
		super();
	}
}
