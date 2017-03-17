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
				<h1>Chi tiết đặt sân</h1>
				<table class="table">
					<thead>
						<tr>
							
							<th>Mã dịch vụ</th>
							<th>Số lượng</th>
							<th>Đơn giá</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<logic:iterate name="datSanForm" property="listChiTietDatSan"
							id="ctds">
							<tr>
								
								<td scope="row"><bean:write name="ctds" property="maDichVu" /></td>
								<td><bean:write name="ctds" property="soLuong" /></td>
								<td><bean:write name="ctds" property="donGia" /></td>
								<td><bean:define id="maDichVu" name="ctds" property="maDichVu"></bean:define>
									<html:link action="/suaDV?maDichVu=${maDichVu}" >
										<span class="glyphicon glyphicon-edit"></span>
									</html:link> <html:link action="/xoaDV?maDichVu=${maDichVu}"
										style="margin-left: 30px;">
										<span class="glyphicon glyphicon-trash"></span>
									</html:link></td>
							</tr>
						</logic:iterate>
					</tbody>
				</table>
				<input type="hidden" name="page">
				<script type="text/javascript">
					$(document)
							.ready(
									function() {
										var pageStatic = parseInt(
				<%out.print(Pagination.page + 1);%>
					);
										if ($("[name='page']").val() == "") {
											$("[name='page']").val(1);
											console.log("Roongx");
										}
										$("#" + pageStatic).addClass("active");
									});
					function handleClickAction(page) {
						$("[name='page']").val(page);
						document.forms[0].submit();
					}
				</script>
				<div class="container" style="display: flex; align-items: center;">
					<ul class="pagination" style="margin: 0 auto;">
						<li class="1"><a href="#" onclick='handleClickAction("1")'>&laquo;</a></li>
						<%
							if (Pagination.totalPage < 8) {
								for (int i = 0; i < Pagination.totalPage; i++) {
									out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1) + ");'>"
											+ (i + 1) + "</a></li>");
								}
							} else {
								if (Pagination.page < 2) {
									for (int i = 0; i < 4; i++) {
										out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1)
												+ ");'>" + (i + 1) + "</a></li>");
									}

									int mid = (Pagination.totalPage - 4 - 4) / 2 + 4;
									out.println("<li><a href='#' onclick='handleClickAction(" + mid + ")'> ... </a></li>");

									for (int i = Pagination.totalPage - 4; i < Pagination.totalPage; i++) {
										out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1)
												+ ");'>" + (i + 1) + "</a></li>");
									}
								} else {
									int midFirst = (Pagination.page - 2) / 2;
									out.println("<li><a href='#' onclick='handleClickAction(" + midFirst + ")'> ... </a></li>");

									int n = Pagination.page + 3 > Pagination.totalPage ? Pagination.totalPage : Pagination.page + 3;
									for (int i = Pagination.page - 2; i < n; i++) {
										out.println("<li id='" + (i + 1) + "'><a href='#' onclick='handleClickAction(" + (i + 1)
												+ ");'>" + (i + 1) + "</a></li>");
									}

									if (Pagination.page < Pagination.totalPage - 4) {
										int midLast = (Pagination.totalPage - (Pagination.page + 2)) / 2 + Pagination.page + 2;
										if (midLast > Pagination.totalPage)
											midLast = Pagination.totalPage;
										out.println("<li><a href='#' onclick='handleClickAction(" + midLast + ")'> ... </a></li>");
									}
								}
							}
						%>
						<li class="<%=Pagination.totalPage%>"><a href="#"
							onclick='handleClickAction("<%=Pagination.totalPage%>")'>&raquo;</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

</body>
</html>