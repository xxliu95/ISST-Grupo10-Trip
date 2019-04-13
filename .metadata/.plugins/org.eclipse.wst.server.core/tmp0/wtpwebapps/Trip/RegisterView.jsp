<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Trip</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
<link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

<link href="css/login.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">

</head>
<body>

		<div class="sidenav">
			<div class="title-text">
				<h1>Trip</h1>
			</div>
		</div>
		<div class="main">
			<div class="col-10">
				<div class="login-main-text">
					<h2>Registro</h2>
				</div>
				<div class="login-form">
					<form action="CreateEmpleadoServlet" method="post">
						<div class="form-group">
							<input name="email" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" class="form-control" title="a@a.domain" placeholder="Email"
								required>
						</div>
						<div class="form-group">
							<input name="password" type="password" pattern=".{6,}" title="6 o más caracteres" class="form-control"
								placeholder="Contraseña" required>
						</div>
						<div class="form-group">
							<input name="name" type="text" class="form-control" pattern=".{2,}" title="2 o más caracteres"
								placeholder="Nombres y apellidos" required>
						</div>
						<div class="form-group">
							<input name="id" type="text" class="form-control" pattern=".{4,}" title="4 o más caracteres"
								placeholder="ID empleado" required>
						</div>
						<div class="form-group">
							<select class="selectpicker form-control " name="superior">
			  					<option value="null" selected disabled hidden>Responsable</option>
  									<c:forEach items="${responsable_list}" var="responsablei">
    									<option value="${ responsablei.email}">
      										${responsablei.name} - ${responsable.email}
    								</option>
  							</c:forEach>
						</select>
						</div>
						<div class="form-group">
							<button type="submit" class="col-12 btn btn-black">ENVIAR</button>
						</div>
						
	
					</form>
					<form action="LoginServlet" method="get">
						<button type="submit" class="col-12 btn">Cancelar</button>
					</form>	
				</div>
			</div>
		</div>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>