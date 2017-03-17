package model.bo;

import java.util.ArrayList;

import model.bean.KhungGioBean;
import model.dao.KhungThoiGianDAO;

public class KhungThoiGianBO {
	KhungThoiGianDAO khungThoiGianDAO = new KhungThoiGianDAO();
	public ArrayList<KhungGioBean> getListThoiGian() {
		return khungThoiGianDAO.getListThoiGian();
	}

}
