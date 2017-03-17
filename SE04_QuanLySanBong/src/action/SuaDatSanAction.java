package action;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.StringProcess;
import form.DatSanForm;
import model.bean.AccountBean;
import model.bean.DatSanBean;
import model.bean.KhungGioBean;
import model.bean.SanBean;
import model.bo.AccountBO;
import model.bo.DonDatSanBO;
import model.bo.KhungThoiGianBO;
import model.bo.SanBO;

public class SuaDatSanAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		DatSanForm datSanForm = (DatSanForm) form;

		// lay danh sach cac moc thoi gian
		KhungThoiGianBO khungThoiGianBO = new KhungThoiGianBO();
		ArrayList<KhungGioBean> listThoiGian = khungThoiGianBO.getListThoiGian();
		datSanForm.setListThoiGian(listThoiGian);

		// lay danh sach cac san
		SanBO sanBO = new SanBO();
		ArrayList<SanBean> listSan = sanBO.getListSan();
		datSanForm.setListSan(listSan);

		// lay danh sach cac account
		AccountBO accountBO = new AccountBO();
		ArrayList<AccountBean> listAccount = accountBO.getListAccount();
		datSanForm.setListAccount(listAccount);

		DonDatSanBO donDatSanBO = new DonDatSanBO();
		// sua dat san

		String maSan = datSanForm.getMaSan();
		String ngayDa = datSanForm.getNgayDa();
		String maKhungGioDa = datSanForm.getMaThoiGian();
		String ngayDatSan = datSanForm.getNgayDatSan();
		if ("submit".equals(datSanForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();
			if (StringProcess.getVaildString(ngayDa)) {
				actionErrors.add("ngayDaError", new ActionMessage("error.ngayda.trong"));
			}
			if (StringProcess.isValidDateStr(ngayDa)) {
				actionErrors.add("ngayDaError", new ActionMessage("error.ngayda.dinhdang"));
			}
			saveErrors(request, actionErrors);
			if (actionErrors.size() > 0) {
				return mapping.findForward("suaDSerror");
			}
		}
		if ("submit".equals(datSanForm.getSubmit())) {
			String nguoiDatSan = datSanForm.getNguoiDatSan();
			donDatSanBO.suaDatSanBean(maSan, nguoiDatSan, ngayDatSan, ngayDa, maKhungGioDa);
			return mapping.findForward("suaDatSanxong");
		} else {
			DatSanBean datSanBean = donDatSanBO.getThongTinDatSan(maSan, ngayDa, maKhungGioDa);
			// datSanForm.setMaThoiGian(datSanBean.getMaKhungGioDa());
			datSanForm.setNguoiDatSan(datSanBean.getNguoiDatSan());

			return mapping.findForward("suaDatSan");
		}
	}
}
