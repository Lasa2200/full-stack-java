<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<style type="text/css">
.container {
	width: 60%;
	height: 300px;
	margin: auto;
	padding: 30px;
}
.regLog {
    display: inline-block;
	text-align: right;
	
}

.pie {
	text-align: left;
}
</style>
</head>

<body>
	<div class=container>
		<div class="regLog">
			<h1>
				Welcome,
				<c:out value="${customer.name}" />
			</h1>
			
			<br>
			<a href="/Priority High ">Priority High-Low</a> 
			<a href="/Priority Low ">Priority Low- High</a>
			<a href="/logout">Logout</a> 
</div>
		<table>
			<thead>
				<tr>
					<th></th>
					<th>Task</th>
					<th>creator</th>
					<th>assignee</th>
					<th>Priotity</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaCustomer}" var="customer">
					<tr>
						<td>${ customer.nombre }</td>
						<td>${ customer.apellido}</td>
						
					</tr>
				</c:forEach>
			</tbody>

			
		</table>
	</div>
	<div class=pie>
		<a href="/pac/crear">Create Task</a>
		<br>
		<a href="/customer/crear">Create Assignee</a>


	</div>
</body>
</html>