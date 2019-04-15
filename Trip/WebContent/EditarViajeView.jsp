<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Editar Viaje</title>

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
<link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	
<link href="css/login.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">

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
						<li class="nav-item"><a class="nav-link" href="LogoutServlet">Cerrar sesión</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div class="requestForm">
			<form action="GuardarCambiosServlet" method="post">
				<div>
					<h1>Datos del solicitante</h1>
				</div>

				<div class="form-row">
					<div class="col-12">
						<label for="exampleFormControlInput1">Email</label> 
						<input
							type="email" class="form-control" name="email" id="exampleFormControlInput1" value="${viaje.viajero.email}" disabled/>
					</div>
				</div>
				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlInput1">Nombre</label> <input value="${viaje.viajero.name}" disabled
							type="text" class="form-control"/>
					</div>
				</div>


				<div class="form-row">
					<div class="col-sm-4">
						<label for="exampleFormControlInput1">DNI/NIF</label> <input
							type="text" class="form-control" placeholder="DNI/NIF" value=""/>
					</div>
					<div class="col-sm-4">
						<label for="exampleFormControlInput1">Cargo</label> <input
							type="text" class="form-control"
							placeholder="Puesto de trabajo dentro de la empresa"/>
					</div>
					<div class="col-sm-4">
						<label for="exampleFormControlInput1">Telefono</label> <input
							type="text" class="form-control"
							placeholder="Telefono fijo o móvil  "/>
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlInput1">IBAN</label> <input
							type="text" class="form-control IBAN" placeholder="IBAN"/>
					</div>
				</div>

				<div>
					<h1>Datos del viaje</h1>
				</div>

				<div class="form-row">
					<div class="col-sm-4">
						<label for="exampleFormControlSelect1">Tipo de viaje</label> <select
							class="form-control" id="exampleFormControlSelect1">
							<option>Conferencia</option>
							<option>Proyecto</option>
							<option>Formativo</option>
						</select>

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
							<input type="text" class="form-control" placeholder="Matrícula"/>
						</p>
						<p>
							<input type="text" class="form-control"
								placeholder="Marca y modelo"/>
						</p>
						<p>
							<input type="text" class="form-control" placeholder="Titular"/>
						</p>
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-6">
						<div class="form-group">
							<label>Fecha inicio</label> <input type="date" name="finicio"
								max="3000-12-31" min="1000-01-01" class="form-control" value="${viaje.finicio}" disabled/>
						</div>
					</div>

					<div class="col-sm-6">
						<div class="form-group">
							<label>Fecha fin</label> <input type="date" name="ffin"
								min="1000-01-01" max="3000-12-31" class="form-control" value="${viaje.ffin}" disabled/>

						</div>
					</div>
				</div>
				
				<div class="form-row">
					<div class="col-sm-6">
						<div class="form-group">
							<label>Destino</label> <input type="text" name="destino"
								 class="form-control" value="${viaje.destino}"/>
						</div>
					</div>

	
				</div>
				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlTextarea1">Objeto del viaje</label>
						<textarea class="form-control" name="descripcion" id="exampleFormControlTextarea1" rows="3" >
						${viaje.descripcion}
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
						<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" value="">
						</textarea>
					</div>
				</div>

				<div class="form-row">
					<div class="col-sm-4">
						<label for="inputEmail3" class="col-form-label">Gastos previstos</label>
					</div>
					<div class="col-sm-8">
						<input type="number" name="presupuesto" value="${viaje.presupuesto}" min="0" step="0.01"
							data-number-to-fixed="2" data-number-stepfactor="100"
							class="form-control currency" id="c2" />
					</div>
				</div>

				<div class="form-row">
					<span class="col-6"></span>
					<a type="button" class="col-3 btn" href="HomeServlet?email=${viaje.viajero.email}">Cancelar</a>	
					<input type="hidden" name="nViaje" value="${viaje.nViaje}">	
					<button type="submit" class="col-3 btn btn-aceptar">Guardar cambios</button>
				</div>
				
			</form>
			
			
		</div>

</body>
</html>