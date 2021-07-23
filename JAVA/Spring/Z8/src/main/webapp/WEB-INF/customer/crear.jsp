<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Assignee</title>
</head>
<body>
	<h2>Create Assignee</h2>
	
	<form:form action="/customer/crear" method="POST" modelAttribute="customer">
		<form:label path="nombre">Nombre: </form:label>
		<form:input path="nombre"/><br>
		<form:label path="apellido">Apellido: </form:label>
		<form:input path="apellido"/><br>		
		
		
		<button type="submit"> Create</button>
		
	</form:form>
	
	
	
	
</body>
</html>