<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
    
<h1>Edit Package</h1>
<form:form action="/pac/${pac.id}" method="post" modelAttribute="pac">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="nombrePac">Nombre Package</form:label>
        <form:errors path="nombrePac"/>
        <form:input path="nombrePac"/>
    </p>
    <p>
        <form:label path="costoPac">Costo</form:label>
        <form:errors path="costoPac"/>
        <form:textarea path="costoPac"/>
    </p>
       
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>