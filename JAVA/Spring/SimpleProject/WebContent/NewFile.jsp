<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import= "java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mi primer JSP</title>
</head>
<body>

	<h1>Mi Primer JSP</h1>
	
	<!-- <p>un Metodo</p> -->
	<%!
		public int add(int a, int b) {
			return a + b;
	}%>

<!-- <p>Variables</p> -->	
	<%
		int i = 2;
		int j = 4;
	%>
	<h3> <%=add(i,j) %></h3> 
	

	<!--<p>Bucles</p> -->
	
	<%for (int index=0; index<5; index++){ %>
			<h1><%=index %></h1>
	<%} %>


<!--<p>Importar paquetes y Clases</p>  -->

	<p>The time is :<%=new Date()%> </p>

	</body>
</html>