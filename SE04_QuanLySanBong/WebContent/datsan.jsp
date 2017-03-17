<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đặt Sân Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/jquery-1.11.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="quanLyAccount.jsp"></jsp:include>
	<div class="container">
	<h1>Sân bóng ABC</h1>
	<h4>Chọn ngày: </h2>	
	
	<table class="table-condensed" border="1">
	<thead class="success">
	<th>Sân bóng</th>
	<th>Khung giờ</th>
	<th>Giá tiền</th>
	<th>Tình trạng</th>
	<th>Chọn</th>
	</thead>
	<tbody>
	<tr class="success">
	<td>Sân A1</td>
	<td><select name="gio">
	<option>4h30-5h30</option>
	<option>5h30-6h30</option>
	<option>14h30-15h30</option>
	<option>15h30-16h30</option>
	</select></td>
	<td>120.000</td>
	<td>Sân trống</td>
	<td><a herf="">Đặt ngay</a></td>
	</tr>
	<tr class="success">
	<td>Sân A2</td>
	<td><select name="gio">
	<option>4h30-5h30</option>
	<option>5h30-6h30</option>
	<option>14h30-15h30</option>
	<option>15h30-16h30</option>
	</select></td>
	<td>120.000</td>
	<td>Sân trống</td>
	<td><a herf="">Đặt ngay</a></td>
	</tr>
	<tr class="success">
	<td>Sân B1</td>
	<td><select name="gio">
	<option>4h30-5h30</option>
	<option>5h30-6h30</option>
	<option>14h30-15h30</option>
	<option>15h30-16h30</option>
	</select></td>
	<td>120.000</td>
	<td>Sân trống</td>
	<td><a herf="">Đặt ngay</a></td>
	</tr>
	<tr class="success">
	<td>Sân B2</td>
	<td><select name="gio">
	<option>4h30-5h30</option>
	<option>5h30-6h30</option>
	<option>14h30-15h30</option>
	<option>15h30-16h30</option>
	</select></td>
	<td>120.000</td>
	<td>Sân trống</td>
	<td><a herf="">Đặt ngay</a></td>
	</tr>
	<tr class="success">
	<td>Sân B3</td>
	<td><select name="gio">
	<option>4h30-5h30</option>
	<option>5h30-6h30</option>
	<option>14h30-15h30</option>
	<option>15h30-16h30</option>
	</select></td>
	<td>120.000</td>
	<td>Sân trống</td>
	<td><a herf="">Đặt ngay</a></td>
	</tr>
	</tbody>
	</table>
	</div>
</body>
</html>