<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>
<h2>Clientes</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Asociar</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaEstudiantes}" var="estudiante">
		<tr>
			<td>${estudiante.id}</td>
			<td>${ estudiante.nombre }</td>
			<td>${ estudiante.edad }</td>
			<td><a href="/estudiante/${estudiante.id}">asociar</a></td>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
<br><br>
</body>
</html>