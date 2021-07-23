<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pac - Customer</title>
</head>
<body>

<h2>${pac.nombrePac}</h2>

<form:form action="/pacCustomer/asociarCustomerPac" method="POST" modelAttribute="customerPac">
		<form:input path="customer.id" type="hidden" value="${customer.id}"/>
		<form:label path="pac.id">Pac: </form:label>
		<form:select path="Pac.id">
			<form:option value="0">Seleccione Pac</form:option>
			<!--forEach Lista Cursos  -->
			
				<c:forEach items="${listaCustomer}" var="pac">
					<form:option value="${pac.id}">	
						<c:out value="${ pac.nombre }"/>
					</form:option>
				</c:forEach>
		</form:select><br>
		<button type="submit"> Agregar pac</button>
	</form:form>
	
			
 <h2>Pac del Cliente ${customer.nombre}</h2>
 
<table>
	<thead>
		<tr>
			<th>#</th>
			<th>Nombre</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ListaPacCustomer}" var="pacCustomer">
		<tr>
			<td>${pacCustomer.pac.id}</td>
			<td>${pacCustomer.pac.nombre }</td>
			<td> <a href="/remover/customerPac/${pacCustomer.id}">Eliminar</a>
		</tr>
		</c:forEach>
	
	</tbody>
</table>
<br><br>
</body>
</html>