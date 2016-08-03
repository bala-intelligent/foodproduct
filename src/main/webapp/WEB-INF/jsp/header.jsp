<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>BK FoodProducts</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="resources/bootstrap/css/custom.css"/>" rel="stylesheet">
	<script src="<c:url value="resources/bootstrapjs/respond.js"/>"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>


<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

<!-- Website CSS style-->
<link rel="stylesheet" type="text/css" href="assets/css/main.css">

<!--<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

Google Fonts
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>-->

</head>
<body>
 <!-- navigation bar -->
   <div class="navbar navbar-default row">
   <div class="navbar-header">
       <ul class="nav nav-pills nav-justified">
	    <a class="navbar-brand" href="#">FoodCart</a>
	          <li class="active"><a href="">Home</a></li>
			  <li class="active"><a href="about">About</a></li>
			  <li class="active"><a href="">Categories</a></li>
			  <li class="active"><a href="http://balakannansachin5@gmail.com">Contact</a></li>
              <li class="active"><a href="">Products</a></li>
	          <li class="active"><a href="login">Login</a></li>
	          <li class="active"><a href="register">Register here</a></li>
       <li> <a href="#" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-shopping-cart"></span> View Cart
        </a></li>
       </div>
	</div> 
	   </ul>
	  <style>
	  #the-slider img{
width : 100%;
}

.navbar{
	background-color:#282828 !important;
}
.navbar li a{
	
	color:white !important;
}
.navbar li a:hover{
	
	color:red !important;
}
.navbar-default .navbar-nav>.active>a{
	background-color: blue !important;
}
	  .navbar{
	  padding : 10px;
	  }
	  </style>
	  <!-- end of navigation bar -->
