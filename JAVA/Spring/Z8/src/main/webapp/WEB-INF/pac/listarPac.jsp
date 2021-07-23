<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Packages</title>
</head>
<body>
	<h2>Lista de Packages</h2>

	<table>
		<thead>
			<tr>
				<th>Pack ID</th>
				<th>Nombre package</th>
				<th>Costo Packages</th>
				<th>Availability</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaPac}" var="pac">
				<tr>

					<td>${ pac.id }</td>
					<td>${ pac.nombrePac }</td>
					<td>${ pac.costoPac }</td>
					<td>displible</td>
					<td>desactivado <a href="/pac/show">Edit</a>
					</td>



					<!-- 	<td><a href="/pac/${pac.id}"> Agregar Customer</a></td>
		</tr>
		-->
			</c:forEach>

		</tbody>

	</table>
</body>
</html>