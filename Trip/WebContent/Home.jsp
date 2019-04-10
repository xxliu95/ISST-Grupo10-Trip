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

<title>Home Trip</title>

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
<link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	
<style><%@include file="css/login.min.css"%></style>
<style><%@include file="css/login.css"%></style>
<style><%@include file="css/style.min.css"%></style>
<style><%@include file="css/style.css"%></style>

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
		

    <!-- Navigation -->
    <nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="#" style="color: #00adb5; letter-spacing: 3px">Gestión de viajes</a>
            <button
            class="navbar-toggler"
            type="bottom"
            data-toggle="collapse"
            data-target="#navbarResponsive"
            >
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Cerrar sesión</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!--- Card Profile -->
<div class="contenedor" style="margin-top: 4%">
    <div class="row border">
        <div class="col-auto img">
            <img src="img/fotocarnet.jpg"  alt="" class="img-rounded" height="200rem" width="auto" style="padding: 8%">
        </div>
        <div class="col-auto details">
            <blockquote>
                <h5>${empleado.name}</h5>
                <small><cite title="Source Title">Empleado  <i class="icon-map-marker"></i></cite></small>
            </blockquote>
            <p>
                ${empleado.email} <br>
                ID Empleado: ${empleado.id} <br>
            
            </p>
        </div>
    </div>


			<!-- Solicitar viaje  -->
			<div class="solicitar" style="margin-top: 1%">
				<div class="row border">
					<div class="col-md-10 col-md-offset-1">
						<div class="panel panel-default panel-table">
							<div class="panel-heading">
								<div class="row">
									<div class="col col-auto">
										<h3 class="panel-title">Solicitar un viaje</h3>
									</div>
									<div class="col col-auto text-right">
										<form action="SolicitarViajeServlet" method="get">									
											<button type="submit"
												class="btn btn-sm btn-primary btn-create"
												style="margin-top: 8%">Solicitar</button>
										</form>
									</div>
								</div>
							</div>
						</div>



						<!-- List table -->

						<div class="panel-body">
							<table class="table table-striped table-bordered table-list">
								<thead>
									<tr>
										<th class="hidden-xs">ID</th>
										<th>Viaje</th>
										<th>Información</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="hidden-xs">1</td>
										<td>Los Ángeles</td>
										<td>Fecha de salida: 31/06/2019<br> Fecha de
											regreso: 31/06/2019<br> Objeto del viaje: Postureo y
											tomar solecito <br>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<!-- pagination -->
    <nav aria-label="Page navigation example">
        <ul class="pagination ">
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Previous">
                    <span aria-hidden="true">«</span>
                    <span class="sr-only">Previous</span>
                </a>
            </li>
            <li class="page-item active"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Next">
                    <span aria-hidden="true">»</span>
                    <span class="sr-only">Next</span>
                </a>
            </li>
        </ul>
    </nav>


</div>
	</shiro:user>


</body>
</html>