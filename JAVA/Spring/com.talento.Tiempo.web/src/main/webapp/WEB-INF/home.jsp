<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"
	integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
	crossorigin="anonymous"></script>
<script>
$(document).ready(function(){
	$('a').click(function() {
		alert("¡Esta es la plantilla de fechas!");
	});
});
</script>


<style>
#a {
	color: blue;
}
</style>
</head>
<body>
	<a href="/ruta/date">Date Template</a>
	<br>
	<a href="/ruta/time">Time Templates</a>

</body>
</html>