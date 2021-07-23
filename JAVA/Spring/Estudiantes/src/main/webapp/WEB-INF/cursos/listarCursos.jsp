<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Cursos</title>
</head>
<body>
 <h2>Lista de Cursos</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
			<th>Accion</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaCursos}" var="curso">
		<tr>
			<td>${curso.id}</td>
			<td>${ curso.nombre }</td>
			<td><a href="/curso/${curso.id}"> Agregar Estudiantes</a></td>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
</body>
</html>