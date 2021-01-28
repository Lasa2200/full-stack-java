<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Probando 1,2,3</title>
</head>
<body>
<!-- Obtenemos el valor del parámetro name -->
    <% String req = request.getParameter("name"); %>
    <!-- Mostramos el valor que obtuvimos -->
    <h1><%= req %></h1>
</body>
</html>