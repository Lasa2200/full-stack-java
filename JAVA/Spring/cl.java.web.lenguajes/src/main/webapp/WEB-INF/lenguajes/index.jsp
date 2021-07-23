<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lenguajes}" var="Lenguaje">
				<tr>
					<td><c:out value="${languaje.name}" /></td>
					<td><c:out value="${languaje.creator}" /></td>
					<td><c:out value="${languaje.currentVersion}" /></td>
					<td>xxxxxxx</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- FORMULARIO -->
	<br>
	<br>
	<br>
	<br>
	<form:form action="/lenguaje" method="post" modelAttribute="lenguaje">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input path="currentVersion" />
		</p>

		<input type="submit" value="submit" />
	</form:form>
</body>
</html>n 
