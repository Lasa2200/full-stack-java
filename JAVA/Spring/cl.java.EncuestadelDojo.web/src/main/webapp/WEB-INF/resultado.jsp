<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete la Informacion</title>
</head>
<body>
<c:out value="${username}"></c:out>
<c:out value="${location}"></c:out>
<c:out value="${lenguaje}"></c:out>
<c:out value="${descripcion}"></c:out>
<form action="/">  <input type ="submit" value= "Go Back"/></form>

</body>
</html>