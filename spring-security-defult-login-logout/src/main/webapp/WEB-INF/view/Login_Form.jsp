<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h3>Custom Login Page</h3>
<form:form action="${pageContext.request.contextPath }/authenticateTheUser" method="POST">
	
	<c:if test="${param.error !=null }">
	<i>Sorry Wrong Username Or Password</i>
	</c:if>
	
	
	<p>
		UserName: <input type="text" name="username" />
	</p>
	<p>
		Password: <input type="password" name="password" />
	</p>
	<input type="submit" value="Login"/>
</form:form>

 <c:if test="${param.logout !=null }"> 
   		<i>You have been logged out.</i> 
  	</c:if>
</body>
</html>