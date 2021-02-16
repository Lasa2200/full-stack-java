<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Player</title>
</head>
<body>
<h2>Add a player to team Ninjas</h2>
<form action="Players" method= "post"> 

  <label for="firstname">First Name:</label><br>
  <input type="text" id="firstname" name="firstname" value=""><br>
  <label for="lastname">Last Name:</label><br>
  <input type="text" id="lastname" name="lastname" value=""><br>
  <label for="age">Age:</label><br>
  <input type="number" id="age" name="age" min="1" max="100"><br>
  <input type="submit" value="add">
</form>
</body>
</html>