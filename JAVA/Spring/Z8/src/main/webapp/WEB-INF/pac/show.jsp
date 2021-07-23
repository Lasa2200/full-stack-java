<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar</title>
</head>
<body>
<h1><c:out value="${pac.nombrePac}"/></h1>
<h2> <c:out value="${pac.costoPac}"></c:out></h2>
<br>
<a href="/pac/${pac.id}/edit">Edit Pack</a>

<br><br>
<form action="/pac/${pac.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
     <a href="/pac/show">Edit</a>
</form>
</body>
</html>