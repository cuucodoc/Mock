<%@page import="model.bean.Pagination"%>
<%@page import="common.StringProcess"%>
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

				<div class="col-lg-3 pull-right">
					<html:link action="/themDatSan" style="margin-left: 30px; "
						styleClass="btn btn-default">Thêm mới</html:link>
				</div>

				<h1>Danh sách đặt sân</h1>
				<table class="table">
					<thead>
						<tr>
							<th>Mã sân</th>
							<th>Người đặt sân</th>
							<th>Ngày đặt sân</th>
							<th>Ngày đá</th>
							<th>Mã khung giờ đá</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<logic:iterate name="danhSachDatSanForm" property="listDatSan"
							id="dt">
							<tr>
								<td scope="row"><bean:write name="dt" property="maSan" /></td>
								<td><bean:write name="dt" property="nguoiDatSan" /></td>
								<td><bean:write name="dt" property="ngayDatSan" /></td>
								<td><bean:write name="dt" property="ngayDa" /></td>
								<td><bean:write name="dt" property="maKhungGioDa" /></td>
								<td><bean:define id="maSan" name="dt" property="maSan"/>
									<bean:define id="ngayDa" name="dt" property="ngayDa"/>
									<bean:define id="maKhungGioDa" name="dt" property="maKhungGioDa"/>
										 <html:link
										action="/chiTietDatSan?maSan=${maSan}&ngayDa=${ngayDa}&maThoiGian=${maKhungGioDa}"
										style="margin-right: 30px;">
										<span class="glyphicon glyphicon-list"></span>
									
									</html:link> <html:link
										action="/suaDS?maSan=${maSan}&ngayDa=${ngayDa}&maThoiGian=${maKhungGioDa}">
										<span class="glyphicon glyphicon-edit"></span>
									</html:link>
									<div class="container">
									<button type="button" class="glyphicon glyphicon-trash myBtn"
										style="margin-left: 30px"></button>
									
										<div class="modal fade myModal" id="" role="dialog">
											<div class="modal-dialog">

												<!-- Modal content-->
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">&times;</button>
														<h4 class="modal-title">Xóa đặt sân  </h4>
													</div>
													<div class="modal-body">
														<p>Bạn có chắc chắn xóa đơn đặt sân này không?</p>
													</div>
													<div class="modal-footer">
													<bean:define id="maSan" name="dt" property="maSan"/>
									<bean:define id="ngayDa" name="dt" property="ngayDa"/>
									<bean:define id="maKhungGioDa" name="dt" property="maKhungGioDa"/>
														<html:link
															action="/xoaDS?maSan=${maSan}&ngayDa=${ngayDa}&maThoiGian=${maKhungGioDa}">
															<button type="button" class="btn btn-default">Xóa</button>
														</html:link>
														<button type="button" class="btn btn-default"
															data-dismiss="modal">Hủy</button>
													</div>
												</div>
											</div>
										</div>
									</div>
								</td>
							</tr>
						</logic:iterate>
					</tbody>
				</table>
				<script>
					$(document).ready(function() {
						$(".myBtn").click(function() {
							
							$(".myModal").modal();
						});
					});
				</script>

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