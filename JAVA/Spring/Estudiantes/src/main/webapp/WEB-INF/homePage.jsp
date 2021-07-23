<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Monitor de Productos</title>
</head>
<body>
 <h2>Monitor de Productos</h2>
 
<table>
	<thead>
		<tr>
			
			<th>Nombre</th>
			<th>Edad</th>
			<th>Direccion</th>
			<th>Ciudad</th>
			<th>Region</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaAlmacen}" var="almacen">
		<tr>
			<td>${almacen.id}</td>
			<td>${ almacen.mombre }</td>
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
		<c:forEach i
