<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>crear licencia</title>
</head>
<body>


	<h1>New License</h1>

	<form:form action="/license/new" method="POST" modelAttribute="license">
		
		<br>
		<form:label path="state">State: </form:label>
		<form:input path="state" />
		<br>
		<form:label path="date">Expiration Date: </form:label>
		<form:input path="date" />

		<button type="submit">Create</button>
	</form:form>


</body>
</html>