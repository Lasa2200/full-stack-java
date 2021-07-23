<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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