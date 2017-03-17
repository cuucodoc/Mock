package action;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import common.ConnectDB;
import form.DatSanForm;
import model.bo.DonDatSanBO;

public class XoaDatSanAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		DonDatSanBO donDatSanBO = new DonDatSanBO();
		DatSanForm datSanForm = (DatSanForm) form;
		String maSan = datSanForm.getMaSan();
		String ngayDa = datSanForm.getNgayDa();
		String maKhungGioDa = datSanForm.getMaThoiGian();
		ConnectDB conn = new ConnectDB();
		String sql="select * from chitietdatsan where masan='"+maSan+"' and ngayda='"+ngayDa+"' and makhunggioda='"+maKhungGioDa+"'";
		Statement stmt =  conn.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		if(rs.next()){					
			return mapping.findForward("xoaDatSanError");
		} else {				
			donDatSanBO.xoaDatSan(maSan, ngayDa, maKhungGioDa);
			return mapping.findForward("xoaDatSanxong");
		}
	}

}
