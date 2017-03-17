package model.bo;

import java.util.ArrayList;

import model.bean.DichVuBean;
import model.dao.DichVuDAO;

public class DichVuBO {
	DichVuDAO dichVuDAO =new DichVuDAO();
	
	public ArrayList<DichVuBean> getListDichVu(){
		return dichVuDAO.getListDichVu();
	}
	
	public DichVuBean getDichVuBean(String maDichVu) {
		return dichVuDAO.getDichVu(maDichVu);
	}
	public ArrayList<DichVuBean> getListDanhSachPhanTran(int page){
		return dichVuDAO.phanTrangDanhSach(page);
}
	public void themDichVu(String maDichVu, String tenDichVu, float donGia) {
		dichVuDAO.themDichVu(maDichVu, tenDichVu, donGia);
	}
	
//	public DichVuBean getThongTinDatSan(String maSan) {
//		return datSanDAO.getThongTinDatSan(maSan);
//	}
//	
	public void suaDichVu(String maDichVu, String tenDichVu, float donGia) {
			dichVuDAO.suaDichVu(maDichVu, tenDichVu, donGia);
	}

	public void xoaDichVu(String madichvu){
		dichVuDAO.xoaDichVu(madichvu);
	}
}
