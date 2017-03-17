package model.bean;

public class SanBean {
	private String maSan;
	private String tenSan;
	private String loaiSan;
	private float giaCoBan;
	private int trangThai;
	
	/**
	 * 
	 * @param maSan
	 * @param tenSan
	 * @param loaiSan
	 * @param giaCoBan
	 * @param trangThai
	 */
	public SanBean(String maSan, String tenSan, String loaiSan, float giaCoBan,
			int trangThai) {
		super();
		this.maSan = maSan;
		this.tenSan = tenSan;
		this.loaiSan = loaiSan;
		this.giaCoBan = giaCoBan;
		this.trangThai = trangThai;
	}

	/**
	 * 
	 * @return
	 */
	public String getMaSan() {
		return maSan;
	}
	
	/**
	 * 
	 * @param maSan
	 */
	public void setMaSan(String maSan) {
		this.maSan = maSan;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTenSan() {
		return tenSan;
	}
	
	/**
	 * 
	 * @param tenSan
	 */
	public void setTenSan(String tenSan) {
		this.tenSan = tenSan;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLoaiSan() {
		return loaiSan;
	}
	
	/**
	 * 
	 * @param loaiSan
	 */
	public void setLoaiSan(String loaiSan) {
		this.loaiSan = loaiSan;
	}
	
	/**
	 * 
	 * @return
	 */
	public float getGiaCoBan() {
		return giaCoBan;
	}
	
	/**
	 * 
	 * @param giaCoBan
	 */
	public void setGiaCoBan(float giaCoBan) {
		this.giaCoBan = giaCoBan;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTrangThai() {
		return trangThai;
	}
	
	/**
	 * 
	 * @param trangThai
	 */
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "SanBean [giaCoBan=" + giaCoBan + ", loaiSan=" + loaiSan
				+ ", maSan=" + maSan + ", tenSan=" + tenSan + ", trangThai="
				+ trangThai + "]";
	}

	/**
	 * 
	 */
	public SanBean() {
		super();
	}
	
	
	
}
