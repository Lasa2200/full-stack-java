<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
   <style>
    .error{
    color:red
    }

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p class = "error">
<c:out value="${error}"></c:out>
</p>
<form method="POST" action="/validacion">
 <input type="text" id="codigo" name="codigo" value=""><br><br>
 <input type="submit" value="Enviar">  
</form>
 
</body>
</html>