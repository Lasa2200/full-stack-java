<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="ninja.css">
</head>
<body>
 <div id="container">
        <h3 id="gold">Your Gold
            <div id="goldbox"></div>
        </h3>
        <div class="lugares">
			<div class="farm lugar">
				<form method="POST" action="/">
					<p>Farm</p>
					<p>(earns 10-20 gold)</p>
					<input type="submit" id="farm" name="farm" value="Find Gold"/>
				</form>
			</div>
			<div class="cave lugar">
				<form method="POST" action="/">
					<p>Cave</p>
					<p>(earns 5 - 10 gold)</p>
					<input type="submit" id="cave" name="cave" value="Find Gold"/>
				</form>
			</div>
			<div class="house lugar">
				<form method="POST" action="/">
					<p>House</p>
					<p>(earns 2 - 5 gold)</p>
					<input type="submit" id="house" name="house" value="Find Gold"/>
				</form>
			</div>
			<div class="casino lugar ">
				<form method="POST" action="/">
					<p>Casino</p>
					<p>(earns 0-50 gold)</p>
					<input type="submit" id="casino"name="casino" value="Find Gold"/>
				</form>
			</div>


		</div>
        <h2>Activities:</h2>
        <div id="consola"></div>
    </div>
</body>
</html>