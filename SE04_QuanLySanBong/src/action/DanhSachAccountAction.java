package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.AccountBean;
import model.bo.AccountBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.AccountForm;


public class DanhSachAccountAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		AccountForm accountForm = (AccountForm) form;
		
		//lay danh sach cac khoa
		AccountBO accountBO = new AccountBO();
		ArrayList<AccountBean> listAccount = accountBO.getListAccount();
		
		accountForm.setListAccount(listAccount);
		return null;
		
		

	}
}
