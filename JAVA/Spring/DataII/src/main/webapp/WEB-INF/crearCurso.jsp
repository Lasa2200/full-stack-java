<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Curso</title>
</head>
<body>
<h2>Crear Curso</h2>
	
	<form:form action="/curso/crear" method="POST" modelAttribute="curso">
		<form:label path="nombre">Nombre: </form:label> <br>
		<form:input path="nombre"/><br>
		<form:label path="instructor">Instructor: </form:label> <br>
		<form:input path="instructor"/><br>
		<form:label path="capacidad">Capacidad: </form:label> <br>
		<form:input path="capacidad"/><br>
		
		<button type="submit"> Crear curso</button>
	</form:form>
</body>
</html>