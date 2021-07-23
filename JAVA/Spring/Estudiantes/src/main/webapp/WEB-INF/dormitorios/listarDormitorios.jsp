<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Dormitorios</title>
</head>
<body>
 <h2>Todos los Dormitorios</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Accion</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaDormitorios}" var="dormitorio">
		<tr>
			<td>${dormitorio.id}</td>
			<td>${ dormitorio.nombre }</td>
			<td><a href="/dormitorio/${dormitorio.id}"> Agregar Estudiantes</a></td>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
</body>
</html>