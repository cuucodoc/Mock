package form;

import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.ChiTietDatSanBean;
import model.bean.DichVuBean;

public class ChiTietDatSanForm extends ActionForm{
	private ArrayList<ChiTietDatSanBean> listChiTietDatSan;
	private int page;
	private int totalPage;
	private String maSan;
	private String maThoiGian;
	private Date ngayDa;
	
	
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
	 * @return the ngayDa
	 */
	public Date getNgayDa() {
		return ngayDa;
	}
	/**
	 * @param ngayDa the ngayDa to set
	 */
	public void setNgayDa(Date ngayDa) {
		this.ngayDa = ngayDa;
	}
	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
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
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}
	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
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
