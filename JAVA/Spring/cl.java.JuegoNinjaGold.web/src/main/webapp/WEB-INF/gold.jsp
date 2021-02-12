<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="ninja_gold.css">
</head>
<body>
 <div id="container">
        <h3 id="gold">Your Gold </h3>
     <div id="goldbox"><c:out value="${gold}" /></div>        
        <div class="lugares">
			<div class="farm lugar">
				<form method="POST" action="/gold">
					<p>Farm</p>
					<p>(earns 10-20 gold)</p>
					<button name="opcion" value="farm">Find Gold</button>
				</form>
			</div>
			<div class="cave lugar">
				<form method="POST" action="/gold">
					<p>Cave</p>
					<p>(earns 5 - 10 gold)</p>
					<button name="opcion" value="cave">Find Gold</button>
				</form>
			</div>
			<div class="house lugar">
				<form method="POST" action="/gold">
					<p>House</p>
					<p>(earns 2 - 5 gold)</p>
					<button name="opcion" value="house">Find Gold</button>
				</form>
			</div>
			<div class="casino lugar ">
				<form method="POST" action="/gold">
					<p>Casino</p>
					<p>(earns 0-50 gold)</p>
					<button name="opcion" value="casino">Find Gold</button>
				</form>
			</div>


		</div>
        <h2>Activities:</h2>
        <textarea id="consola" ><c:forEach var="mensaje" items="${activities}">
         <c:out value = "${mensaje}"/>
     </c:forEach>
        </textarea>
    </div>
</body>
</html>