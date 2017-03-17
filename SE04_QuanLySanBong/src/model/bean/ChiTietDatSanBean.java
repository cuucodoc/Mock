package model.bean;

import java.sql.Date;

public class ChiTietDatSanBean {
	private String maSan;
	private Date ngayDa;
	private String maKhungGioDa;
	private String maDichVu;
	private float donGia;
	private int soLuong;
	
	
	/**
	 * 
	 * @param maSan
	 * @param ngayDa
	 * @param maKhungGioDa
	 * @param maDichVu
	 * @param donGia
	 * @param soLuong
	 */
	public ChiTietDatSanBean(String maSan, Date ngayDa, String maKhungGioDa,
			String maDichVu, float donGia, int soLuong) {
		super();
		this.maSan = maSan;
		this.ngayDa = ngayDa;
		this.maKhungGioDa = maKhungGioDa;
		this.maDichVu = maDichVu;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	
	/**
	 * 
	 */
	public ChiTietDatSanBean() {
		super();
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
	public Date getNgayDa() {
		return ngayDa;
	}
	
	/**
	 * 
	 * @param ngayDa
	 */
	public void setNgayDa(Date ngayDa) {
		this.ngayDa = ngayDa;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMaKhungGioDa() {
		return maKhungGioDa;
	}
	
	/**
	 * 
	 * @param maKhungGioDa
	 */
	public void setMaKhungGioDa(String maKhungGioDa) {
		this.maKhungGioDa = maKhungGioDa;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMaDichVu() {
		return maDichVu;
	}
	
	/**
	 * 
	 * @param maDichVu
	 */
	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}
	
	/**
	 * 
	 * @return
	 */
	public float getDonGia() {
		return donGia;
	}
	
	/**
	 * 
	 * @param donGia
	 */
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSoLuong() {
		return soLuong;
	}
	
	/**
	 * 
	 * @param soLuong
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "ChiTietDatSanBean [donGia=" + donGia + ", maDichVu=" + maDichVu
				+ ", maKhungGioDa=" + maKhungGioDa + ", maSan=" + maSan
				+ ", ngayDa=" + ngayDa + ", soLuong=" + soLuong + "]";
	}
	
	
	
}
