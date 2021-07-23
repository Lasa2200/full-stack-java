<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso-Estudiantes</title>
</head>
<body>
<h2>${curso.nombre}</h2>

<form:form action="/cursoestudiante/asociarEstudianteCurso" method="POST" modelAttribute="cursoestudiante">
		<form:input path="estudiante.id" type="hidden" value="${estudiante.id}"/>
		<form:label path="curso.id">Curso: </form:label>
		<form:select path="curso.id">
			<form:option value="0">Seleccione Curso</form:option>
			
			
				<c:forEach items="${listaCursos}" var="curso">
					<form:option value="${curso.id}">	
						<c:out value="${curso.nombre }"/>
					</form:option>
				</c:forEach>
		</form:select><br>
		<button type="submit"> Agregar Curso</button>
	</form:form>
	
			
 <h2>Cursos del Estudiante ${estudiante.nombre}</h2>
 
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
			<td>${cursoEstudiante.curso.id}</td>
			<td>${cursoEstudiante.curso.nombre }</td>
			<td> <a href="/remover/EstudianteCurso/${cursoEstudiante.id}">Eliminar</a>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
<br><br>
</body>
</html>