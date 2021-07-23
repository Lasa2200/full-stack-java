<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Task</title>
</head>
<body>
	<h2>Create a new Task</h2>

	<form:form action="/pac/crear" method="POST" modelAttribute="pac">
		<form:label path="nombrePac">Task </form:label>
		<br>
		<form:input path="nombrePac" />
		<br>
		<form:label path="costoPac">Assignee</form:label>
		<br>
		<form:input path="costoPac" />
		<br>
		<label for="priority"> Priority </label>
		<select name="priority" id="priority">
			<option value="h">Higth</option>
			<option value="m">Medium</option>
			<option value="l">Low</option>
			</select>
	</form:form>
		
	<br>
	<button type="submit">Create Task</button>
	
</body>
</html>