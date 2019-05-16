<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Person</title>
 <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.7.6/css/mdb.min.css" rel="stylesheet">
 
  </head>
  <body>
    <!--Navbar-->
<nav class="navbar navbar-expand-lg navbar-dark primary-color">

  <!-- Navbar brand -->
  <a class="navbar-brand" href="home">Spring MVC</a>

  <!-- Collapse button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
    aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Collapsible content -->
  <div class="collapse navbar-collapse" id="basicExampleNav">

    <!-- Links -->
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home
          <span class="sr-only">(current)</span>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="AddPerson">Add</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="View">View</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Edit">Edit</a>
      </li>

      <!-- Dropdown -->

    </ul>
    <!-- Links -->

    <form class="form-inline">
      <div class="md-form my-0">
        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
      </div>
    </form>
  </div>
  <!-- Collapsible content -->

</nav>
<!--/.Navbar-->
<div class="row">
  <div class="container">
    <div class="col-md-12 center">
      <br>
      <h2>Add Person</h2>
      <hr>
    </div>

  </div>
</div>

<div class="row">
  <div class="container">
    <div class="col-md-6 center">
    
      <form:form action="saveCustomer" modelAttribute="customer" method="POST">
		        
          <label for="exampleInputEmail1">First Name</label>
          <form:input path="FirstName" class="form-control" id="exampleInputEmail1"/>
         	 
			<br>
          <label for="exampleInputEmail1">Last Name</label>
          <form:input path="LastName" class="form-control" id="exampleInputEmail1"/>
          
           
		
		
		<br>
		<label for="exampleInputEmail1">Age</label>
          <form:input path="age" class="form-control" id="exampleInputEmail1"/>
         
			
	
		
			<br>
          <label for="exampleInputEmail1">Address</label>
          <form:select path="Address" class="form-control" id="exampleInputEmail1">
          
           	<form:option value="cairo" label="Cairo"/>  
        	<form:option value="giza" label="Giza"/>  
        	<form:option value="alex" label="Alexendria"/>  
        	<form:option value="sharam" label="Sharam el Sheiek"/> 
        	<form:option value="gouna" label="El Gouna"/> 
          </form:select>
          
			<br>
          <label for="exampleInputEmail1">Phone</label>
          <form:input path="phone" class="form-control" id="exampleInputEmail1"/>
         
			
			

        <input type="submit"  value="Save" class="btn btn-primary"/>
      </form:form>
    </div>
  </div>
</div>

  </body>
</html>
