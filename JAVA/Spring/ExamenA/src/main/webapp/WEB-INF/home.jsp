<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
</head>
<body>
	<h1>ADMIN DASHBOARD</h1>

	<!--  <c:out value="${user.name} " /> to  Necflit.TV> -->

	<a href="/logout">Logout</a>

<!-- CLIENTES -->

	<h2>Customers</h2>

	<table>
	<thead>
		<tr>
			<th>Package Name</th>
			<th>Package Cost</th>
			<th>Abailable</th>
			<th>Users</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaCursos}" var="curso">
		<tr>
			<td>${curso.id}</td>
			<td>${ curso.nombre }</td>
			<td>${ curso.instructor }</td>
			<td>${ curso.capacidad }</td>
			<td><a href="/curso/${curso.id}"> Agregar Estudiantes</a></td>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
	<br>
	<br>
	<!-- TABLA DE PACKAGES -->
	
<h2>Lista de Cursos</h2>
 
<table>
	<thead>
		<tr>
			<th>Package Name</th>
			<th>Pacage Cost</th>
			<th>Available</th>
			<th>Users</th>
			<th>Accion</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaCursos}" var="curso">
		<tr>
			<td>${curso.id}</td>
			<td>${ curso.nombre }</td>
			<td>${ curso.instructor }</td>
			<td>${ curso.capacidad }</td>
			<td><a href="/curso/${curso.id}"> Agregar Estudiantes</a></td>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
<!-- LISTA DE PACKAGES -->
	
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
					<td>${ curso.instructor }</td>
					<td>${ curso.capacidad }</td>

					<td><a href="/curso/${curso.id}"> Agregar Estudiantes</a></td>
				</tr>

			</c:forEach>

		</tbody>
	</table>
<!-- CREAR PACKAGE -->
	<h2>Crear Package</h2>

	<form:form action="/curso/crear" method="POST" modelAttribute="curso">
		<form:label path="nombre">Nombre: </form:label>
		<br>
		<form:input path="nombre" />
		<br>
		<form:label path="instructor">Instructor </form:label>
		<br>
		<form:input path="instructor" />
		<br>
		<form:label path="capacidad">Capacidad </form:label>
		<br>
		<form:input path="capacidad" />
		<br>
		<button type="submit">Crear curso</button>
	</form:form>
</body>
</html>
