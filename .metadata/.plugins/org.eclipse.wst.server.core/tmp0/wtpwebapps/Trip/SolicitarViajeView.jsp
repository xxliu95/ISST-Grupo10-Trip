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

<title>Trip-Solicitar</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
<link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

<style><%@include file="css/login.min.css"%></style>
<style><%@include file="css/login.css"%></style>
<style><%@include file="css/style.min.css"%></style>
<style><%@include file="css/style.css"%></style>

</head>
<body>

		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"
					style="color: #00adb5; letter-spacing: 3px">Gestión de viajes</a>
				<button class="navbar-toggler" type="bottom" data-toggle="collapse"
					data-target="#navbarResponsive">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item"><a class="nav-link" href="#">Cerrar sesión</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="requestForm">
			<form>
				<div>
					<h1>Datos del solicitante</h1>
				</div>

				<div class="form-row">
					<div class="col-12">
						<label for="exampleFormControlInput1">Email</label> <input
							type="email" class="form-control" id="exampleFormControlInput1"
							placeholder="name@example.com">
					</div>
				</div>
				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlInput1">Nombre</label> <input
							type="text" class="form-control" placeholder="Nombre">
					</div>
				</div>


				<div class="form-row">
					<div class="col-sm-4">
						<label for="exampleFormControlInput1">DNI/NIF</label> <input
							type="text" class="form-control" placeholder="DNI/NIF">
					</div>
					<div class="col-sm-4">
						<label for="exampleFormControlInput1">Cargo</label> <input
							type="text" class="form-control"
							placeholder="Puesto de trabajo dentro de la empresa">
					</div>
					<div class="col-sm-4">
						<label for="exampleFormControlInput1">Telefono</label> <input
							type="text" class="form-control"
							placeholder="Telefono fijo o móvil  ">
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlInput1">IBAN</label> <input
							type="text" class="form-control IBAN" placeholder="IBAN">
					</div>
				</div>

				<div>
					<h1>Datos del viaje</h1>
				</div>

				<div class="form-row">
					<div class="col-sm-4">
						<label for="exampleFormControlSelect1">Tipo de viaje</label> <select
							class="form-control" id="exampleFormControlSelect1">
							<option>1</option>
							<option>2</option>
							<option>3</option>
							<option>4</option>
						</select>

					</div>
					<div class="col-sm-8">
						<label for="exampleFormControlTextarea1">Objeto del viaje</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3">
                </textarea>
					</div>
				</div>

				<div class="form-row">
					<div class="col-4">
						<label for="exampleFormControlSelect1">Medio de transporte</label>

						<select class="form-control" id="exampleFormControlSelect1">
							<option>Taxi</option>
							<option>Avión</option>
							<option>Tren</option>
							<option>Metro</option>
							<option>Barco</option>
							<option>Bus</option>
						</select> <select class="form-control" id="exampleFormControlSelect1">
							<option>Taxi</option>
							<option>Avión</option>
							<option>Tren</option>
							<option>Metro</option>
							<option>Barco</option>
							<option>Bus</option>
						</select> <select class="form-control" id="exampleFormControlSelect1">
							<option>Taxi</option>
							<option>Avión</option>
							<option>Tren</option>
							<option>Metro</option>
							<option>Barco</option>
							<option>Bus</option>
						</select>
					</div>

					<div class="col-8">
						<label for="exampleFormControlInput1">Datos vehículo
							personal</label>
						<p>
							<input type="text" class="form-control" placeholder="Matrícula">
						</p>
						<p>
							<input type="text" class="form-control"
								placeholder="Marca y modelo">
						</p>
						<p>
							<input type="text" class="form-control" placeholder="Titular">
						</p>
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-6">
						<div class="form-group">
							<label>Periodo inicio</label> <input type="date" name="bday"
								max="3000-12-31" min="1000-01-01" class="form-control">
						</div>
					</div>

					<div class="col-sm-6">
						<div class="form-group">
							<label>Periodo fin</label> <input type="date" name="bday"
								min="1000-01-01" max="3000-12-31" class="form-control">

						</div>
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlTextarea1">Objeto del viaje</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3">
                </textarea>
					</div>
				</div>
				<div>
					<h1>Gastos previstos</h1>
				</div>

				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlTextarea1">Exponga aquí los
							gastos previstos del viaje</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3">
                </textarea>
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-4">
						<label for="inputEmail3" class="col-form-label">Gastos
							previstos</label>
					</div>
					<div class="col-sm-8">
						<input type="number" value="1000" min="0" step="0.01"
							data-number-to-fixed="2" data-number-stepfactor="100"
							class="form-control currency" id="c2" />
					</div>
				</div>

				<div class="form-row">
					<label for="exampleFormControlFile1">Adjuntar factura</label> <input
						type="file" class="form-control-file" id="exampleFormControlFile1">
				</div>

				<div class="form-row">
					<span class="col-6"></span>

					<button type="button" class="col-3 btn" href="registrar.html">Cancelar</button>
					<button type="button" class="col-3 btn btn-aceptar"
						href="registrar.html">Guardar cambios</button>
				</div>
			</form>
		</div>

</body>
</html>