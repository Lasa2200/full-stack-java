<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>New Person</h1>

	<form:form action="/persons/new" method="POST" modelAttribute="person">
		<form:label path="firstName">First Name: </form:label>
		<form:input path="firstName" />
		<br>
		<form:label path="lastName">lastName: </form:label>
		<form:input path="lastName" />
		<br>

		<button type="submit">Create</button>
	</form:form>

<a href = "/license">New License</a>
</body>
</html>
