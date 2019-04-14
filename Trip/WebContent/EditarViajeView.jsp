<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar viaje</title>
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
			<form action="EditarViajeServlet" method="post">
				<div>
					<h1>Datos del solicitante</h1>
				</div>

				<div class="form-row">
					<div class="col-12">
						<label for="exampleFormControlInput1">Email</label> 
						<input
							type="email" class="form-control" name="email" id="exampleFormControlInput1" value="${viaje.viajero.email}"/>
					</div>
				</div>
				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlInput1">Nombre</label> <input value="${viaje.viajero.name}"
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
								max="3000-12-31" min="1000-01-01" class="form-control"/>
						</div>
					</div>

					<div class="col-sm-6">
						<div class="form-group">
							<label>Fecha fin</label> <input type="date" name="ffin"
								min="1000-01-01" max="3000-12-31" class="form-control"/>

						</div>
					</div>
				</div>
				
				<div class="form-row">
					<div class="col-sm-6">
						<div class="form-group">
							<label>Destino</label> <input type="text" name="destino"
								 class="form-control"/>
						</div>
					</div>

	
				</div>
				<div class="form-row">
					<div class="col-sm-12">
						<label for="exampleFormControlTextarea1">Objeto del viaje</label>
						<textarea class="form-control" name="descripcion" id="exampleFormControlTextarea1"
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
						<label for="inputEmail3" class="col-form-label">Gastos previstos</label>
					</div>
					<div class="col-sm-8">
						<input type="number" name="presupuesto" value="1000" min="0" step="0.01"
							data-number-to-fixed="2" data-number-stepfactor="100"
							class="form-control currency" id="c2" />
					</div>
				</div>

				<div class="form-row">
					<span class="col-6"></span>
					<a type="button" class="col-3 btn" href="HomeServlet?email=${empleado.email}">Cancelar</a>		
					<button type="submit" class="col-3 btn btn-aceptar">Guardar cambios</button>
				</div>
				
			</form>
			
			
		</div>

</body>
</html>