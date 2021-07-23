<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Estudiantes</title>
</head>
<body>
 <h2>Todos los Contactos</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Direccion</th>
			<th>Ciudad</th>
			<th>Region</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaContactos}" var="contacto">
		<tr>
			<td>${contacto.id}</td>
			<td>${ contacto.estudiante.nombre }</td>
			<td>${ contacto.estudiante.edad }</td>
			<td>${ contacto.direccion}</td>
			<td>${ contacto.ciudad}</td>
			<td>${ contacto.region}</td>
		</tr>
		</c:forEach>
	
	</tbody>
</table>

<h2>Asociar Estudiantes curso</h2>
 
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