<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Login Form</title>
<link href="<c:url value='/resources/css/font-awesome.css'/>"
	rel="stylesheet">
<!-- Bootstrap -->
<link href="<c:url value='/resources/css/bootstrap.css'/>"
	rel="stylesheet">
<!-- SmartMenus jQuery Bootstrap Addon CSS -->
<link
	href="<c:url value='/resources/css/jquery.smartmenus.bootstrap.css'/>"
	rel="stylesheet">
<!-- Product view slider -->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/jquery.simpleLens.css'/>">
<!-- slick slider -->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/slick.css'/>">
<!-- price picker slider -->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/nouislider.css'/>">
<!-- Theme color -->
<link id="switcher"
	href="<c:url value='/resources/css/theme-color/default-theme.css'/>"
	rel="stylesheet">
<!-- <link id="switcher" href="css/theme-color/bridge-theme.css" rel="stylesheet"> -->
<!-- Top Slider CSS -->
<link
	href="<c:url value='/resources/css/sequence-theme.modern-slide-in.css'/>"
	rel="stylesheet" media="all">

<!-- Main style sheet -->
<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">

<!-- Google Font -->
<link href='https://fonts.googleapis.com/css?family=Lato'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Raleway'
	rel='stylesheet' type='text/css'>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body>
	<div class="col-md-6">
		<div class="aa-myaccount-register">
			<h1>Login-www.BooKCorneR.com</h1>
			<form method="POST"
				action="<c:url value='j_spring_security_check' />">
				Username:
				<p>
					<input type="text" name="user_firstname" value=""
						placeholder="Username">
				</p>
				<hr>
				Password:
				<p>
					<input type="password" name="password" value=""
						placeholder="Password">
				</p>
				<hr>
				<p class="remember_me">
					<label> <input type="checkbox" name="remember_me"
						id="remember_me"> Remember me on this computer
					</label>
				</p>
				<p class="submit">
					<input type="submit" name="login" value="Login">
				</p>
			</form>
		</div>
</div>

		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="<c:url value='/resources/js/bootstrap.js'/>"></script>
		<!-- SmartMenus jQuery plugin -->
		<script type="text/javascript"
			src="<c:url value='/resources/js/jquery.smartmenus.js'/>"></script>
		<!-- SmartMenus jQuery Bootstrap Addon -->
		<script type="text/javascript"
			src="<c:url value='/resources/js/jquery.smartmenus.bootstrap.js'/>"></script>
		<!-- To Slider JS -->
		<script src="<c:url value='/resources/js/sequence.js'/>"></script>
		<script
			src="<c:url value='/resources/js/sequence-theme.modern-slide-in.js'/>"></script>
		<!-- Product view slider -->
		<script type="text/javascript"
			src="<c:url value='/resources/js/jquery.simpleGallery.js'/>"></script>
		<script type="text/javascript"
			src="<c:url value='/resources/js/jquery.simpleLens.js'/>"></script>
		<!-- slick slider -->
		<script type="text/javascript"
			src="<c:url value='/resources/js/slick.js'/>"></script>
		<!-- Price picker slider -->
		<script type="text/javascript"
			src="<c:url value='/resources/js/nouislider.js'/>"></script>
		<!-- Custom js -->
		<script src="<c:url value='/resources/js/custom.js'/>"></script>
</body>
</html>
<%@ include file="footer.jsp"%>