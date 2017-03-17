package model.bo;

import java.sql.Date;
import java.util.ArrayList;
import model.bean.ChiTietDatSanBean;
import model.bean.DatSanBean;
import model.dao.DonDatSanDAO;

public class DonDatSanBO {
	DonDatSanDAO datSanDAO = new DonDatSanDAO();
	
	public ArrayList<DatSanBean> getListDatSan() {
		return datSanDAO.getListDatSan();
	}
	
	public ArrayList<ChiTietDatSanBean> geChiTietDatSanBeans(String maSan, String ngayDa, String maKhungGioDa) {
		return datSanDAO.getListChiTietDatSan(maSan, ngayDa, maKhungGioDa);
	}
	public ArrayList<DatSanBean> getListDanhSachPhanTran(int page){
		return datSanDAO.phanTrangDanhSach(page);
	}
	public void themDatSanBean(String maSan, String nguoiDatSan,
			String ngayDa, String maKhungGioDa) {
		datSanDAO.themDatSan(maSan, nguoiDatSan, ngayDa, maKhungGioDa);
	}
	
	public DatSanBean getThongTinDatSan(String maSan, String ngayDa, String maKhungGioDa) {
		return datSanDAO.getThongTinDatSan(maSan, ngayDa, maKhungGioDa);
	}
	
	public void suaDatSanBean(String maSan, String nguoiDatSan, String ngayDatSan,
			String ngayDa, String maKhungGioDa) {
		datSanDAO.suaDatSan(maSan, nguoiDatSan,ngayDatSan, ngayDa, maKhungGioDa);
	}

	public void xoaDatSan(String maSan, String ngayDa, String maKhungGioDa) {
		datSanDAO.xoaDatSan(maSan, ngayDa, maKhungGioDa);
	}


}
