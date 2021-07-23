<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dormitorio - Estudiantes</title>
</head>
<body>

<h2>${dormitorio.nombre}</h2>

<form:form action="/estudiante/asociarDormitorio" method="POST" modelAttribute="estudiante">
		<form:input path="dormitorio.id" type="hidden" value="${dormitorio.id}"/>
		<form:label path="id">Estudiante: </form:label>
		<form:select path="id">
			<form:option value="0">Seleccione Estudiante</form:option>
			<!--forEach listaEstudiantes  -->
			
				<c:forEach items="${listaEstudiantes}" var="estudiante">
					<form:option value="${estudiante.id}">	
						<c:out value="${ estudiante.nombre } ${ estudiante.apellido }"/>
					</form:option>
				</c:forEach>
		</form:select><br>
		<button type="submit"> Agregar Estudiante</button>
	</form:form>		
 <h2>Estudiantes en dormitorio ${dormitorio.nombre}</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ListaEstudiantesDormitorio}" var="estudiante">
		<tr>
			<td>${estudiante.id}</td>
			<td>${ estudiante.nombre }</td>
			<td> <a href="/estudiante/removerDormitorio/${estudiante.id}">Eliminar</a>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
<br><br>
</body>
</html>