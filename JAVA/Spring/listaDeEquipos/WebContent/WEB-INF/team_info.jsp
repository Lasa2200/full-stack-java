<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Team</title>
</head>
<body>
	<h2>
		<c:out value="${team_name}" />
	</h2>
	<a href="Players"> New Player</a>
	<table border=1 style="width: 100%;">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="player" items="${playersList}">
			<tr>
				<td><c:out value="${player.name}" /></td>
				<td><c:out value="${player.lastname}" /></td>
				<td><c:out value="${player.age}" /></td>
				<td><a
					href="DeletePlayers?id=${player.name}&team_name=${team_name}">
						Delete</a></td>


			</tr>
		</c:forEach>



	</table>
</body>
</html>