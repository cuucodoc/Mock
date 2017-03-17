package action;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DatSanForm;
import model.bean.ChiTietDatSanBean;

import model.bo.ChiTietDatSanBO;


public class ChiTietDatSanAction  extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DatSanForm datSanForm = (DatSanForm) form;
		// lay danh sach dat san
		ArrayList<ChiTietDatSanBean> listChiTietDatSan;
		ChiTietDatSanBO chiTietDatSanBO = new ChiTietDatSanBO();
		
		String maSan = datSanForm.getMaSan();
		String ngayDa = datSanForm.getNgayDa();
		String maKhungGioDa = datSanForm.getMaThoiGian();
		
		listChiTietDatSan = chiTietDatSanBO.getChiTietDatSan(maSan, ngayDa, maKhungGioDa);
		datSanForm.setListChiTietDatSan(listChiTietDatSan);
		return mapping.findForward("dsChiTietDatSan");
	}

}
