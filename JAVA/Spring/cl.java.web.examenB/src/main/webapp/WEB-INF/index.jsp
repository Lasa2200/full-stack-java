<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

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
	text-align: center;
	margin-left: 25px;
}
</style>
<title>Login and Register Page</title>
</head>
<body>
	<div class="container">
		<div class="regLog">
			<h1>Register</h1>

			<p>
				<form:errors path="user.*" />
			</p>

			<form:form method="POST" action="/registration" modelAttribute="user">
            <p>
					<form:label path="name">Name:</form:label>
					<input type="text" id="name"
						name="name" path="name" />
				</p>
				<p>
					<form:label path="email">Email:</form:label>
					<input type="text" id="email"
						name="email" path="email" />
				</p>
				<p>
					<form:label path="password">Password:</form:label>
					<input type="text" id="password"
						name="password">
				</p>
				<>
					<form:label path="passwordConfirmation">Password Conf:</form:label>
					<form:password path="passwordConfirmation" />
						<input type="text" id="passwordConfirmation"
						name="passwordConfirmation" path="passwordConfirmation" />
						
						</p><br><br>
				<input type="submit" value="Register" />
			</form:form>
		</div>
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