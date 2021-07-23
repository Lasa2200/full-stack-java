<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monitor de Productos</title>
</head>
<body>
	<h1>Monitor de Productos</h1>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Number of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${almacen}" var="almacen">
				<tr>
					<td><c:out value="${almacen.id}" /></td>
					<td><c:out value="${almacen.name}" /></td>
					<td><c:out value="${almacen.location}" /></td>
					<td><c:out value="${almacen.ver}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>