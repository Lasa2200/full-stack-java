<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/guest/signin">Signin/Signup</a>
	<form action="/search" method="get">
	<label>Find places to swim and sleep on water bnb</label>
		<input type="text" name="location">
		<input type="submit" value="Search">
	</form>
</body>
</html>