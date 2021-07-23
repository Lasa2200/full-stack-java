<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Contacto</title>
</head>
<body>
	<h2>Crear Contacto</h2>
	
	<form:form action="/contactos/crear" method="POST" modelAttribute="contacto">
		<form:select path="estudiante.id">
			<form:option value="0">Seleccione Estudiante</form:option>
			<!--forEach listaEstudiantes  -->
			
				<c:forEach items="${listaEstudiantes}" var="estudiante">
					<form:option value="${estudiante.id}">	
						<c:out value="${ estudiante.nombre } ${ estudiante.apellido }"/>
					</form:option>
				</c:forEach>
		</form:select>
		<br>
		<form:label path="direccion">Direccion: </form:label>
		<form:input path="direccion"/><br>
		<form:label path="ciudad">Ciudad: </form:label>
		<form:input path="ciudad"/><br>
		<form:label path="region">Region: </form:label>
		<form:input path="region"/><br>
		
		<button type="submit"> Crear Contacto</button>
	</form:form>
</body>
</html>