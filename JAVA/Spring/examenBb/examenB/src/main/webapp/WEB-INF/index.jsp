<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
.container {
	width: 1025px;
	height: 900px;
	background: withe;
	margin: 10px;
}

.regLog {
	display: inline-block;
	vertical-align: top;
	text-align: center;
	margin-left: 25px;
}
</style>

<title>Registro y login de Usuarios</title>

</head>
<body>

	<!--***Register***-->
	<div class="container">

		<div class="regLog">
			<h1>Register!</h1>

			<p>
				<form:errors path="user.*" />
			</p>

			<form:form method="POST" action="/registro" modelAttribute="user">
				<p>
					<form:label path="name">Nombre:</form:label>
					<form:input type="text" path="name" />
				</p>
		<!--		<p>
		  			<form:label path="email">Email:</form:label>
					<form:input type="email" path="email" />
				</p>-->
				<p>
					<form:label path="password">Password:</form:label>
					<form:password path="password" />
				</p>
				<p>
					<form:label path="passwordConfirmation">Password Confirmation:</form:label>
					<form:password path="passwordConfirmation" />
				</p>
				<input type="submit" value="Register!" />
			</form:form>
		</div>


		<!--***Login***-->
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
				<input type="submit" value="Login!" />
			</form>
		</div>
	</div>
</body>
</html>