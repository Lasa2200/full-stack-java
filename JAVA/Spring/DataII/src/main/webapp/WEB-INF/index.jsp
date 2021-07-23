<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina de Registro</title>

<style type="text/css">

.container {
	width: 1025px;
	height: 900px;
	background: rgb(235, 223, 203);
	margin: 10px;
}

.regLog {
	display: inline-block;
	vertical-align: top;
	text-align: right;
	margin-left: 25px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="regLog">
			<h1>Registrate</h1>

			<p>
				<form:errors path="user.*" />
			</p>

			<form:form method="POST" action="/registration" modelAttribute="user">
				<p>
					<form:label path="name">Name:</form:label>
					<form:input type="text" path="name" />
				</p>
				<p>
					<form:label path="email">Email:</form:label>
					<form:input type="email" path="email" />
				</p>
				<p>
					<form:label path="password">Password:</form:label>
					<form:password path="password" />
				</p>
				<p>
					<form:label path="passwordConfirmation">Confirmación Password:</form:label>
					<form:password path="passwordConfirmation" />
				</p>
				<input type="submit" value="Registrate" />
			</form:form>
		</div>
		<div class="regLog">
			<h1>Login</h1>
			<p>
				<c:out value="${error}" />
			</p>
			<form method="post" action="/login">
				<p>
					<label for="email">Email</label> <input type="text" id="email"
						name="email" />
				</p>
				<p>
					<label for="password">Password</label> <input type="password"
						id="password" name="password" />
				</p>
				<input type="submit" value="Login" />
			</form>
		</div>
	</div>
</body>
</html>