<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
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
        <a class="nav-link" href="Person/AddPerson">Add</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="EditPerson">View</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="ViewPerson">Edit</a>
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
      <h2>Project</h2>
      <hr>
    </div>

  </div>
</div>

<div class="row">
  <div class="container">
    <div class="col-md-12 center">
      <div class="alert alert-success" role="alert">
  <h4 class="alert-heading">Well done!</h4>
  <p>Aww yeah, you successfully read this important alert message. This example text is going to run a bit longer so that you can see how spacing within an alert works with this kind of content.</p>
  <div class="row">
    <div class="col-md-4">
      <div class="alert alert-dark" role="alert">
        <a href="Customer/List" class="alert-link">Add Person Here..list</a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="alert alert-dark" role="alert">
        <a href="ViewPerson" class="alert-link">View Person Here..</a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="alert alert-dark" role="alert">
        <a href="EditPerson" class="alert-link">Edit Person Here..</a>
      </div>
    </div>
  </div>
  <hr>
  <p class="mb-0">Whenever you need to, be sure to use margin utilities to keep things nice and tidy.</p>
</div>
    </div>

  </div>
</div>


  </body>
</html>

