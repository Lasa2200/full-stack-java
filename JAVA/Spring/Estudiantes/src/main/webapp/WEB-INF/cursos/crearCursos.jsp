<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Curso</title>
</head>
<body>
		<h2>Crear Curso</h2>
	
	<form:form action="/curso/crear" method="POST" modelAttribute="curso">
		<form:label path="nombre">Nombre: </form:label> <br>
		<form:input path="nombre"/><br>
		
		<button type="submit"> Crear curso</button>
	</form:form>
</body>
</html>