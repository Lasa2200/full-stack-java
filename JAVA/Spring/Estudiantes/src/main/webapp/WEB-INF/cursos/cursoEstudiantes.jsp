<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Curso - Estudiantes</title>
</head>
<body>

<h2>${curso.nombre}</h2>

<form:form action="/cursoestudiante/asociarCursoEstudiante" method="POST" modelAttribute="cursoestudiante">
		<form:input path="curso.id" type="hidden" value="${curso.id}"/>
		<form:label path="estudiante.id">Estudiante: </form:label>
		<form:select path="estudiante.id">
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
	
			
 <h2>Estudiantes en Curso ${curso.nombre}</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ListaCursoEstudiantes}" var="cursoEstudiante">
		<tr>
			<td>${cursoEstudiante.estudiante.id}</td>
			<td>${cursoEstudiante.estudiante.nombre }</td>
			<td> <a href="/remover/CursoEstudiante/${cursoEstudiante.id}">Eliminar</a>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
<br><br>
</body>
</html>