<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Estudiantes</title>
</head>
<body>
	<h2>Crear Estudiante</h2>
	
	<form:form action="/estudiantes/crear" method="POST" modelAttribute="estudiante">
		<form:label path="nombre">Nombre: </form:label>
		<form:input path="nombre"/><br>
		<form:label path="apellido">Apellido: </form:label>
		<form:input path="apellido"/><br>
		<form:label path="edad">Edad: </form:label>
		<form:input path="edad"/><br>
		
		<button type="submit"> Crear</button>
	</form:form>
</body>
</html>