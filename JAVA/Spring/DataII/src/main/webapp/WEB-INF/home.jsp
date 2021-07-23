<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome, <c:out value="${user.name}" /></h1>
	<a href="/logout">Logout</a>
	<title>Insert title here</title>
</head>
<body>

	<h1>All Books</h1>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>Language</th>
				<th>Number of Pages</th>
			</tr>
		<button type="submit"> Crear</button>
	
	 <h2>Lista Estudiantes</h2>
 
	 <ul>
	 	<li><a href="/estudiantes/crear">Crear estudiantes</a></li>
	 	<li><a href="/contactos/crear">Crear contacto</a></li>
	 	<li><a href="/estudiantes/listar">Lista de Estudiantes</a></li>
	 	<li><a href="/curso/crear">Crear Curso</a></li>
	 	<li><a href="/curso/listar">Listar Cursos</a></li>
	 </ul>
	
</body>
</html>