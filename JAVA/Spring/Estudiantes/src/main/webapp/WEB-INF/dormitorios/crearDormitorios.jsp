<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Dormitorio</title>
</head>
<body>
		<h2>Crear Dormitorio</h2>
	
	<form:form action="/dormitorio/crear" method="POST" modelAttribute="dormitorio">
		<form:label path="nombre">Nombre: </form:label> <br>
		<form:input path="nombre"/><br>
		
		<button type="submit"> Crear Dormitorio</button>
	</form:form>
</body>
</html>