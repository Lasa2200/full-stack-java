<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
  


<p>Name: <c:out value="${person.firstname}"/></p>
<p>License Number: <c:out value="${license.number}"/></p>
<p>State: <c:out value="${license.state}"/></p>
<p>License ExpirationDate: <c:out value="${license.espirationDate}"/></p>
<a href="/license/${license.id}/edit">Edit License</a>
<form action="/license/${license.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
<a href="/mostrar" >volver a crear</a>