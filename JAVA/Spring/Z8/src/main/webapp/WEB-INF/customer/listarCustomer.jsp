<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Assignee</title>
</head>
<body>
	<h2>Assignee Task</h2>

	
	<table>
		<thead>
			<tr>
				<th></th>
				<th>Task</th>
				<th>Creator</th>
				<th>Assignee</th>
				<th>Priority</th>
			</tr>
		</thead>
			<tbody>
			<c:forEach items="${listaCustomer}" var="customer">
				<tr>
					<td> tarea  </td>
					<td>  usuario  </td>
					<td>  ${customer.nombre}${ customer.apellido}  </td>
					<td> prioridad  </td>

				 	<td><a href="/customer/${customer.id}">asignar Task</a></td>
				</tr> 
			</c:forEach>

		</tbody>
	</table>
	<br>
	<br>

</body>
</html>