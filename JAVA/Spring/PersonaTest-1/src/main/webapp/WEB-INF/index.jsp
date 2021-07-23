<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de Personas</title>
<c:forEach items="${persona}" var="persona">
</head>
<body>
	<table>
	<h1>Inicio</h1>
		<tr>
			<th>id</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Email</th>
			<th>Fono</th>
			<th>Editar</th>
			<th>Borrar</th>
		</tr>
		<tr>
				<td>${persona.id}</td>
				<td>${ persona.nombre }>Mostrar Nombre</td>
				<td>${ persona.apellido }>Mostrar Apellido</td>
				<td>${ persona.email}> Mostrar Email</td>
				<td>${ persona.fono}> Mostrar Telefono</td>
				<td><a href="/editar/${persona.id}">Editar</a></td>
				<br>
				<td><a href="/borrar/${persona.id}">Borrar</a></td>
			</tr>
		</c:forEach>
</table>
	</tbody>

	<a href="/crear">Crear Persona</a>
</body>
</html>