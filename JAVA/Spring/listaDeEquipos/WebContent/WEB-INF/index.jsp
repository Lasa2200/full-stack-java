<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Prototype Roster</h2>
<a href ="Teams"> New Team</a>
<table border=1 style="width:100%; ">
  <tr>
    <th>Team</th>
    <th>Player</th>
    <th>Action</th>
  </tr>
  <c:forEach var="team" items="${teamList}">
    
     <tr>
	    <td><c:out value="${team.team_name}"/></td>
	    <td></td>
	    <td></td>
  	</tr>
</c:forEach>
  
 
  
</table>
</body>
</html>