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
	<form:form action="/registrer" method="post" modelAttribute="user">
		<h3>Registrer</h3>
		<p>
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName"/>
			<form:input path="firstName"/>
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName"/>
			<form:input path="lastName"/>
		</p>
		<p>
			<form:label path="email">E-mail</form:label>
			<form:errors path="email"/>
			<form:input path="email"/>
		</p>
		<p>
			<form:label path="password">Password</form:label>
			<form:errors path="password"/>
			<form:input path="password"/>
		</p>
		<p>
			<form:label path="confirmPass">Confirm Password</form:label>
			<form:errors path="confirmPass"/>
			<form:input path="confirmPass"/>
		</p>
		<p>
			<form:label path="rol"></form:label>
			<form:errors path="rol"/>
			<form:select path="rol">
				<form:option value="HOST">Host</form:option>
				<form:option value="GUEST">Guest</form:option>
			</form:select>
		</p>
		<input type="submit" value="Registrer">
	</form:form>
	
	<form action="/login" method="post">
		<h3>Login</h3>
		<label>E-mail</label>
		<br>
		<input type="email" name="email">
		<br>
		<label>Password</label>
		<br>
		<input type="password" name="pass">
		<br>
		<input type="submit" value="Login">
	</form>
</body>
</html>