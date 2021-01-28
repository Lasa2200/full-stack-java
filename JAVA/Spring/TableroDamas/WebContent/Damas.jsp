<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
td {
border:1px solid black;
width: 200px;
height:200px;
}
.negro{
background-color:black;
}
.red{
background-color:red;
}

</style>
<title>Tablero de Damas</title>
</head>
<body>
	<%
		int filas=0, columnas=0;
		//cuando es por url es GET
		filas = Integer.parseInt(request.getParameter("filas"));
		columnas = Integer.parseInt(request.getParameter("columnas"));
	%>
	<h1> Tablero de Damas</h1>
	<!-- Java no es lo mismo que Javascript -->
	<table class="tama"> 
	<% for (int i=0; i<filas; i++){%>
		<tr> 
		
		<% if (i%2==0){ 
			 for (int j=0; j<columnas; j++){
				 if (j%2==0){ %>
					<td class="negro"></td> <!--  = recibe el valor -->
				<%} else{%>
					<td class="red"></td>
				<%}
		 	}
	 	}else{%>
	 		<% for (int j=0; j<columnas; j++){%>
				<% if (j%2==0){ %>
					<td class="red"></td> <!--  = recibe el valor -->
				<%} else{%>
					<td class="negro"></td>
				<%}%>
		 	<%}%>
	 	<%} %>
		</tr>
	<% }%>
	</table>
</body>
</html>