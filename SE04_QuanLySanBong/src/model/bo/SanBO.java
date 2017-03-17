package model.bo;

import java.util.ArrayList;

import model.bean.SanBean;
import model.dao.SanDAO;




public class SanBO {
	SanDAO sanDAO = new SanDAO();
	public ArrayList<SanBean> getListSan(){
		return sanDAO.getListSan();
	}
	public void addSan(String maSan, String tenSan, String loaiSan, float giaCoBan, int trangThai) {
		sanDAO.addSan(maSan,tenSan,loaiSan,giaCoBan,trangThai);
	}
	public SanBean getThongTinSan(String maSan) {
		return sanDAO.getThongTinSan(maSan);
	}
	public void editSan(String maSan, String tenSan, String loaiSan, float giaCoBan, int trangThai) {
		sanDAO.editSan(maSan,tenSan,loaiSan,giaCoBan,trangThai);
	}
	public void deleteSan(String maSan) {
		sanDAO.deleteSan(maSan);
	}
}
