<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create a new Team</h2>
<form action="Teams" method= "post"> 
  <label for="teamname">Team name:</label><br>
  <input type="text" id="teamname" name="teamname" value=""><br>
  
  <input type="submit" value="Submit">
</form>
</body>
</html>