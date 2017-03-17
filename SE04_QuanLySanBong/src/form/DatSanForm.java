package form;



import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.AccountBean;
import model.bean.ChiTietDatSanBean;
import model.bean.DatSanBean;
import model.bean.DichVuBean;
import model.bean.KhungGioBean;
import model.bean.SanBean;

public class DatSanForm extends ActionForm {
	private String maSan;
	private String nguoiDatSan;
	private String ngayDatSan;
	private String ngayDa;
	private String maThoiGian;
	private String thoiGian;
	private String tenDangNhap;
	private String tenSan;
	private ArrayList<KhungGioBean> listThoiGian;
	private ArrayList<AccountBean> listAccount;
	private ArrayList<SanBean> listSan;	
	private ArrayList<ChiTietDatSanBean> listChiTietDatSan;
	private String submit;
	
	/**
	 * @return the listChiTietDatSan
	 */
	public ArrayList<ChiTietDatSanBean> getListChiTietDatSan() {
		return listChiTietDatSan;
	}
	/**
	 * @param listChiTietDatSan the listChiTietDatSan to set
	 */
	public void setListChiTietDatSan(ArrayList<ChiTietDatSanBean> listChiTietDatSan) {
		this.listChiTietDatSan = listChiTietDatSan;
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
	 * @return the tenSan
	 */
	public String getTenSan() {
		return tenSan;
	}
	/**
	 * @param tenSan the tenSan to set
	 */
	public void setTenSan(String tenSan) {
		this.tenSan = tenSan;
	}
	
	
	/**
	 * @return the listAccount
	 */
	public ArrayList<AccountBean> getListAccount() {
		return listAccount;
	}
	/**
	 * @param listAccount the listAccount to set
	 */
	public void setListAccount(ArrayList<AccountBean> listAccount) {
		this.listAccount = listAccount;
	}
	/**
	 * @return the listSan
	 */
	public ArrayList<SanBean> getListSan() {
		return listSan;
	}
	/**
	 * @param listSan the listSan to set
	 */
	public void setListSan(ArrayList<SanBean> listSan) {
		this.listSan = listSan;
	}
	/**
	 * @return the listThoiGian
	 */
	public ArrayList<KhungGioBean> getListThoiGian() {
		return listThoiGian;
	}
	/**
	 * @param listThoiGian the listThoiGian to set
	 */
	public void setListThoiGian(ArrayList<KhungGioBean> listThoiGian) {
		this.listThoiGian = listThoiGian;
	}
	/**
	 * @return the maThoiGian
	 */
	public String getMaThoiGian() {
		return maThoiGian;
	}
	/**
	 * @param maThoiGian the maThoiGian to set
	 */
	public void setMaThoiGian(String maThoiGian) {
		this.maThoiGian = maThoiGian;
	}
	/**
	 * @return the thoiGian
	 */
	public String getThoiGian() {
		return thoiGian;
	}
	/**
	 * @param thoiGian the thoiGian to set
	 */
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}
	private ArrayList<KhungGioBean> khungGioBeans;
	
	/**
	 * @return the submit
	 */
	public String getSubmit() {
		return submit;
	}
	/**
	 * @param submit the submit to set
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	private DatSanBean datSanBean;
	/**
	 * @return the maSan
	 */
	public String getMaSan() {
		return maSan;
	}
	/**
	 * @param maSan the maSan to set
	 */
	public void setMaSan(String maSan) {
		this.maSan = maSan;
	}
	/**
	 * @return the nguoiDanSan
	 */
	public String getNguoiDatSan() {
		return nguoiDatSan;
	}
	/**
	 * @param nguoiDanSan the nguoiDanSan to set
	 */
	public void setNguoiDatSan(String nguoiDatSan) {
		this.nguoiDatSan = nguoiDatSan;
	}
	/**
	 * @return the ngayDatSan
	 */
	public String getNgayDatSan() {
		return ngayDatSan;
	}
	/**
	 * @param ngayDatSan the ngayDatSan to set
	 */
	public void setNgayDatSan(String ngayDatSan) {
		this.ngayDatSan = ngayDatSan;
	}
	/**
	 * @return the ngayDa
	 */
	public String getNgayDa() {
		return ngayDa;
	}
	/**
	 * @param ngayDa the ngayDa to set
	 */
	public void setNgayDa(String ngayDa) {
		this.ngayDa = ngayDa;
	}
	/**
	 * @return the khungGioBeans
	 */
	public ArrayList<KhungGioBean> getKhungGioBeans() {
		return khungGioBeans;
	}
	/**
	 * @param khungGioBeans the khungGioBeans to set
	 */
	public void setKhungGioBeans(ArrayList<KhungGioBean> khungGioBeans) {
		this.khungGioBeans = khungGioBeans;
	}
	/**
	 * @return the datSanBean
	 */
	public DatSanBean getDatSanBean() {
		return datSanBean;
	}
	/**
	 * @param datSanBean the datSanBean to set
	 */
	public void setDatSanBean(DatSanBean datSanBean) {
		this.datSanBean = datSanBean;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
