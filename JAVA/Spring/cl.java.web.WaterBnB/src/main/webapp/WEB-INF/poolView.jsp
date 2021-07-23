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
	<a href="/host/dashboard">Home</a>
	<a href="/logout">Logout</a>

	<form action="" method="post">
		<label><c:out value="${pool.address }"/></label>
		<br>
		<input type="text" value="${pool.description }" name="description"/>
		<br>
		<label><c:out value="${user.email}"/></label>
		<br>
		<label><c:out value="${user.firstName}"/> <c:out value="${user.lastName }"/></label>
		<br>
		<label>Size</label>
		<select name="size">
			<option value="SMALL">Small</option>
			<option value="MEDIUM">Medium</option>
			<option value="LARGE">Large</option>
		</select>
		<label>Cost</label>
		<input type="number" value="${pool.cost}" name="cost"/>
		<input type="submit" value="Save Changes">
	</form>
	
	<h3><c:out value="${pool.ranking() }"/></h3>
	
	<div>
		<c:forEach var="review" items="${pool.review}">
			<div>
				<c:out value="${review.user.firstName}"/>
				<br>
				Rating:<c:out value="${review.ranking}"></c:out>
				<br>
				<c:out value="${review.comentario }"></c:out>
			</div>
			<hr>
		</c:forEach>
	</div>
</body>
</html>