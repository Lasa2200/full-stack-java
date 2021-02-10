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
	<br>
	<br>
	<form method="POST" action="/resultado">
		<label>Your Name: <input type="text" name="username"
			id="username"></label><br>
	  	<br> <label for="Dojo Location"> Dojo Location: </label>
	  	 <select name="location" id="location">
			<option value="San Jose">San Jose</option>
			<option value="California">California</option>
			<option value="Temuco">Temuco</option>
			<option value="Mi Casa">Mi Casa</option>
		</select> <br>
		<br> <label for="lenguaje"> Favorite Lenguage: </label> <select
			name="lenguaje" id="lenguaje">
			<option value="Java">Java</option>
			<option value="JavaScript">JavaScript</option>
			<option value="Phyton">Phyton</option>
			<option value="HTML">Html</option>
		</select>

	<br>
	<p>Comment: (optional)</p>
	<textarea name="descripcion" id ="descripcion"></textarea>
	<br><br>
	<input type ="submit" value= "Button"/>
	</form>
</body>
</html>