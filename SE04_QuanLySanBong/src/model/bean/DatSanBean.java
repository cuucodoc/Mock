package model.bean;

import java.sql.Date;

public class DatSanBean {
	private String maSan;
	private String nguoiDatSan;
	private String ngayDatSan;
	private String ngayDa;
	private String maKhungGioDa;
	
	
	/**
	 * 
	 * @param maSan
	 * @param nguoiDatSan
	 * @param ngayDatSan
	 * @param ngayDa
	 * @param maKhungGioDa
	 */
	public DatSanBean(String maSan, String nguoiDatSan, String ngayDatSan,
			String ngayDa, String maKhungGioDa) {
		super();
		this.maSan = maSan;
		this.nguoiDatSan = nguoiDatSan;
		this.ngayDatSan = ngayDatSan;
		this.ngayDa = ngayDa;
		this.maKhungGioDa = maKhungGioDa;
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
	 */
	public DatSanBean() {
		super();
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
	public String getNguoiDatSan() {
		return nguoiDatSan;
	}
	
	/**
	 * 
	 * @param nguoiDatSan
	 */
	public void setNguoiDatSan(String nguoiDatSan) {
		this.nguoiDatSan = nguoiDatSan;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNgayDatSan() {
		return ngayDatSan;
	}
	
	/**
	 * 
	 * @param ngayDatSan
	 */
	public void setNgayDatSan(String ngayDatSan) {
		this.ngayDatSan = ngayDatSan;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNgayDa() {
		return ngayDa;
	}
	
	/**
	 * 
	 * @param ngayDa
	 */
	public void setNgayDa(String ngayDa) {
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
	 */
	@Override
	public String toString() {
		return "DatSanBean [maKhungGioDa=" + maKhungGioDa + ", maSan=" + maSan
				+ ", ngayDa=" + ngayDa + ", ngayDatSan=" + ngayDatSan
				+ ", nguoiDatSan=" + nguoiDatSan + "]";
	}
	
	
	
}
