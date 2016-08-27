<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp"%>
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>Sign Up</title>
    
    <!-- Font awesome -->
    <link href="<c:url value='/resources/css/font-awesome.css'/>" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="<c:url value='/resources/css/bootstrap.css'/>" rel="stylesheet">   
    <!-- SmartMenus jQuery Bootstrap Addon CSS -->
    <link href="<c:url value='/resources/css/jquery.smartmenus.bootstrap.css'/>" rel="stylesheet">
    <!-- Product view slider -->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/jquery.simpleLens.css'/>">    
    <!-- slick slider -->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/slick.css'/>">
    <!-- price picker slider -->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/nouislider.css'/>">
    <!-- Theme color -->
    <link id="switcher" href="<c:url value='/resources/css/theme-color/default-theme.css'/>" rel="stylesheet">
    <!-- <link id="switcher" href="css/theme-color/bridge-theme.css" rel="stylesheet"> -->
    <!-- Top Slider CSS -->
    <link href="<c:url value='/resources/css/sequence-theme.modern-slide-in.css'/>" rel="stylesheet" media="all">

    <!-- Main style sheet -->
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">    

    <!-- Google Font -->
    <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    

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
			<h1>SignUp-www.BooKCorneR.com</h1>
			<form:form modelAttribute="userDetails" accept-charset="utf-8"
				class="form" role="form">
				<form:errors path="*" cssClass="errorblock" element="div" />
				<p></p>
							FirstName:
							<form:input path="user_firstname" pattern="[a-zA-Z]{3,30}"
					required="true" class="form-control input-lg"
					placeholder="First Name" />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('user_firstname')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
							LastName:
							<form:input path="user_lastname" pattern="[a-zA-Z]{3,30}"
					required="true" class="form-control input-lg"
					placeholder="Last Name" />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('user_lastname')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
						E-mail:
						<form:input path="mail_id"
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required="true"
					class="form-control input-lg" placeholder="Your Email" />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('mail_id')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>

				<br />

						Moblie-Number:
						<form:input path="mobile_number" pattern="[9|7|8][0-9]{9}"
					required="true" class="form-control input-lg"
					placeholder="Your Mobile Number" />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('mobile_number')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />

						Password:
						<form:password path="password" required="true"
					class="form-control input-lg" placeholder="Password" />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('password')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
						Confirm Password:
						<form:password path="confirm_password" required="true"
					class="form-control input-lg" placeholder="Confirm Password" />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('confirm_password')}"
					var="err">
					<div>
						<span>${err.text}</span>
				</c:forEach>
				<br />
				<button class="btn btn-lg btn-primary btn-block signup-btn"
					name="_eventId_submit" type="submit" value="submit">Create
					my account</button>
			</form:form>
			<input type="button" value="back" onclick="javascript:history.back()" />
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