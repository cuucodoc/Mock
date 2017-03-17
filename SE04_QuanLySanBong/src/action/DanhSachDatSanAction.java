package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachDatSanForm;
import model.bean.DatSanBean;
import model.bo.DonDatSanBO;

public class DanhSachDatSanAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DanhSachDatSanForm danhSachDatSanForm = (DanhSachDatSanForm) form;
		// lay danh sach dat san
		ArrayList<DatSanBean> listDatSan;
		DonDatSanBO donDatSanBO = new DonDatSanBO();

//		int page = 0;
//		try {
//			int x = danhSachDatSanForm.getPage();
//			if (x >= 1)
//				page = x - 1;
//		} catch (Exception e) {
//		}
		
		listDatSan = donDatSanBO.getListDatSan();
		danhSachDatSanForm.setListDatSan(listDatSan);
		return mapping.findForward("dsDatSan");

	}

}
