<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Current Listings</h3>
	<a href="/logout">Logout</a>
	
	<table>
		<thead>
			<tr>
				<th>Address</th>
				<th>Pool Size</th>
				<th>Cost Per night</th>
				<th>Details</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pool" items="user.pools">
				<tr>
					<td><c:out value="${pool.address}"/></td>
					<td><c:out value="${pool.size}"/></td>
					<td><c:out value="${pool.cost}"/></td>
					<td><a href="/host/pools/${pool.id}"><c:out value="pool.ranking"/>/5</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<form:form action="/poolRegistrer" method="post" modelAttribute="pool">
		<p>
			<form:label path="address">Address</form:label>
			<form:errors path="address"/>
			<form:input path="address"/>
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description"/>
			<form:input path="description"/>
		</p>
		<p>
			<form:label path="cost">Cost Per Night</form:label>
			<form:errors path="cost"/>
			<form:input type="number" path="cost"/>
		</p>
		<p>
			<form:label path="size">Pool Size</form:label>
			<form:errors path="size"/>
			<form:select path="size">
				<form:option value="SMALL">Small</form:option>
				<form:option value="MEDIUM">Medium</form:option>
				<form:option value="LARGE">Large</form:option>
			</form:select>
		</p>
		<input type="submit" value="Add Listing">
	</form:form>
</body>
</html>