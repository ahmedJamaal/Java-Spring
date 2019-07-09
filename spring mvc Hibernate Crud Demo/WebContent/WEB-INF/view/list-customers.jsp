<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/mdb.min.css" />
	 <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/fontAwsome/css/all.css" />
	<link href="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js" />
	  

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
<div class="row">
  <div class="container">
    <div class="col-md-12 center">
      <br>
      <h2>View Person </h2>
      <hr>
    </div>

  </div>
</div>

<div class="row">
  <div class="container">
    <div class="col-md-12">

			<!--  add our html table here -->
		
			<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>address</th>
					<th>phone</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>	
				<!-- loop over and print our customers -->
			
				<c:forEach var="tempCustomer" items="${customers}">
					
					<c:url var="updateLink" value="/Customer/formForUpdate">
		  				<c:param name="customerId" value="${tempCustomer.id}"></c:param>
		  			</c:url>
		  			
		  			
		  			<c:url var="DeleteLink" value="/Customer/Delete">
		  				<c:param name="customerId" value="${tempCustomer.id}"></c:param>
		  			</c:url>
					<tr>
						<td> ${tempCustomer.id} </td>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.age} </td>
						 <td> ${tempCustomer.address} </td>
		      			<td> ${tempCustomer.phone} </td>
		      			<td><a href="${ updateLink }"><i class="far fa-edit"></i></a></td>
		    			<td><a href="${DeleteLink }"><i class="far fa-trash-alt"></i></a></td>
					</tr>
				
				</c:forEach>
			</table>
				
		</div>
		</div>	
	</div>	

</body>

</html>









