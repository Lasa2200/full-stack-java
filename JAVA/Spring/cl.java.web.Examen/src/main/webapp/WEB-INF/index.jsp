<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>

	<form action="index" method="post">
	<p> REGISTER</p>
	<label for="nombre">Name:</label>
	<input type="text" id="nombre" name="nombre">  <br>
	<label for="email">Email:</label>
	<input type="text" id="email" name="email"><br>
	<br>
	<label for="password">Password:</label>
	<input type="password" id="password" name="password"><br>
	<br>
	<label for="passwordConf">Password Conf:</label>
	<input type="password" id="passwordConf" name="passwordConf"><br>
	<br>
	<input type="submit" value="register">
	</form>
	
	<form method="POST" action="/courses">
	<p>LOGIN</p>
	<label for="password">Password:</label>
	<input type="password" id="password" name="password"><br>
	
	<input type="submit" value="Login">
	
	</form>

 
</body>
</html>