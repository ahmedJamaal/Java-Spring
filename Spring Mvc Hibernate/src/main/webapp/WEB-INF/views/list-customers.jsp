<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Customer</title>
</head>
<body>
<div class="container">
<div class="content">
<table>
<tr>
<td>First Name</td>
<td>Last Name</td>
<td>Age</td>
<td>Address</td>
<td>Phone</td>
</tr>

<c:forEach var="tempCustomer" items="${customers }">
<tr>
<td>${tempCustomer.FirstName }</td>
<td>${tempCustomer.LastName }</td>
<td>${tempCustomer.Age }</td>
<td>${tempCustomer.Address }</td>
<td>${tempCustomer.Phone }</td>

</tr>

</c:forEach>
</table>
</div>

</div>
</body>
</html>