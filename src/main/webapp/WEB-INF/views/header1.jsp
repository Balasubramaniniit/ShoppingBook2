<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>www.BooKCorneR.com</title>
<meta name="viewport" content="width= device-width,initial-scale= 1.0">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<style>

#the-slider img{
width: 100%;
}
hr{
border-top: 1px solid #695b5b;
}



.navbar-brand {
    
    padding: 1px 10px;
    
}
 
a {
    color: #080808;
	}
	
	body{
	line-height: 2;
	}
	
	.navbar-brand{
		height: 5px;
		padding: 05px 10px;
	}
			
	
	
	.top-buffer {
		margin-top:100px; 
		}
		
		


</style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
 
 
   <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
	  <p></p>
	  <p></p>
      <a class="navbar-brand" href="#">BooKCorneR.com</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-left">
         <li><a href="home">Home</a></li>
        <li><a href="#AS">Adcance Search</a></li>
        <li><a href="#bestdeals">Best Deals</a></li>
        <li><a href="#About">About</a></li>
        <li><a href="#service">Service</a></li>
     </ul>
    <ul class="nav navbar-nav navbar-right">
			<li><a href="products"><span
					class="glyphicon glyphicon-log-in"></span> Product</a></li>
			<li><a href="upload"><span
					class="glyphicon glyphicon-log-in"></span>Photos</a></li>
	
		</ul>
     </div>
 

  </nav>

<div class="container">
<div class="row top-buffer">

			<div class="col-xs-12">
				<a><img
					src="<c:url value="/resources/photos/7.png"/>"
					style="width:1200px"></a>
			</div>
		</div>
		</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>