<%@page import="model.bean.Pagination"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý đặt sân</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}

th {
	background-color: #73879C;
	color: white;
}

.btn-default {
	background: #000;
	color: #fff;
}

.btn-default:hover {
	background: #fff;
	color: #000;
}
</style>
<body style="background-color: white;">
	<jsp:include page="menuAdmin.jsp"></jsp:include>
	<div class="right_col" role="main">
		<div class="jumbotron"
			style="margin-left: 250px; margin-right: 20px; margin-top: 20px;">
			<div class="x_content well">
				<h1>Sửa đặt sân</h1>
				<div class="container">
					<br>
					<html:form action="/suaDS" method="post">
						<div class="row form-group">
							<label class="col-lg-2">Mã sân:<label style="color: red">*</label></label>
							<div class="col-lg-3">
								<html:select property="maSan" styleClass="form-control">
									<html:optionsCollection name="datSanForm" property="listSan"
										label="maSan" value="maSan" />
								</html:select>
							</div>
						</div>
						<div class="row form-group">
							<label class="col-lg-2">Người đặt sân:<label
								style="color: red">*</label></label>
							<div class="col-lg-3">
								<html:select property="nguoiDatSan" styleClass="form-control">
									<html:optionsCollection name="datSanForm"
										property="listAccount" label="tenDangNhap" value="tenDangNhap" />
								</html:select>
							</div>
						</div>
						<div class="row form-group">
							<label class="col-lg-2">Ngày đá:<label style="color: red">*</label></label>
							<div class="col-lg-3">
								<%
									//	<input  type="Date" class="form-control" property="ngayDa">
								%>
								<html:text property="ngayDa" styleClass="form-control"></html:text>
								<html:errors property="ngayDaError"/>
							</div>
						</div>
						<div class="row form-group">
							<label class="col-lg-2">Mã khung giờ:<label
								style="color: red">*</label></label>
							<div class="col-lg-3">
								<html:select property="maThoiGian" styleClass="form-control">
									<html:optionsCollection name="datSanForm"
										property="listThoiGian" label="thoiGian" value="maThoiGian" />
								</html:select>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-lg-3 col-lg-offset-2">
								<html:submit styleClass="btn btn-default" property="submit"
									value="submit">Thêm mới</html:submit>
								<button class="btn btn-default" onclick="history.go(-1);">Quay
									lại</button>
							</div>
						</div>
					</html:form>
					<br>
				</div>
			</div>
		</div>
	</div>

</body>
</html>