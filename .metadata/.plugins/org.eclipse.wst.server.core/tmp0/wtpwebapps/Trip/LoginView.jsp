<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Trip</title>

<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">

<!-- Custom styles for this template -->
<link href="css/login.min.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">

</head>
<body>
	<shiro:guest>

		<div class="sidenav">
			<div class="title-text">
				<h1>Trip</h1>
			</div>
		</div>

		<div class="main">
			<div class="col-10">
				<div class="login-main-text">
					<h2>Gestión de viajes</h2>
				</div>
				<div class="login-form">
					<form action="LoginServlet" method="post">
						<div class="form-group">
							<input name="email" type="text" class="form-control" placeholder="Email">
						</div>
						<div class="form-group">
							<input name="password" type="password" class="form-control"
								placeholder="Contraseña">
						</div>

						<button type="submit" class="col-12 btn btn-black">LOGIN</button>
						<span class="col-12"></span> 
					</form>
					<form action="RegisterServlet" method="get">
						<button type="submit" class="col-12 btn">Registrar</button>
					</form>
					
				</div>
			</div>
		</div>

	</shiro:guest>

	<shiro:user>

	</shiro:user>


</body>
</html>