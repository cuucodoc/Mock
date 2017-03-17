package model.bo;

import java.sql.Date;
import java.util.ArrayList;

import model.bean.ChiTietDatSanBean;
import model.dao.ChiTietDatSanDAO;

public class ChiTietDatSanBO {
	ChiTietDatSanDAO chiTietDatSanDAO = new ChiTietDatSanDAO();
	public ArrayList<ChiTietDatSanBean> getChiTietDatSan(String maSan, String ngayDa, String maKhungGioDa){
		return chiTietDatSanDAO.getListChiTietDatSan(maSan, ngayDa, maKhungGioDa);
		
	}

}
