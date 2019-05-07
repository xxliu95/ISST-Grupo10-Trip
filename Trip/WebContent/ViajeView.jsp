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

<title>Viaje Trip</title>

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
<link href="vendor/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
	integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<link href="css/login.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">

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
							<input name="email" type="text" class="form-control"
								placeholder="Email">
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
				<a class="navbar-brand" href="#"
					style="color: #00adb5; letter-spacing: 3px">Gestión de viajes</a>
				<button class="navbar-toggler" type="bottom" data-toggle="collapse"
					data-target="#navbarResponsive">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item"><a class="nav-link" href="LogoutServlet">Cerrar
								sesión</a></li>
					</ul>
				</div>
			</div>
		</nav>

		<!--- Card Profile -->
		<div class="container" style="margin-top: 65px">
			<div class="row border">
				<div class="col-auto img">

					<c:choose>
						<c:when test="${viaje.viajero.foto == null }">
							<form action="SubirFotoServlet" method="post"
								enctype="multipart/form-data">
								<input type="hidden" name="email" value="${viaje.viajero.email}" />
								<input type="file" name="file">
								<button type="submit" class="btn btn-sm btn-primary btn-create"
									style="margin-top: 8%">Poner una imagen</button>
							</form>
						</c:when>
						<c:otherwise>
							<img
								src="${pageContext.request.contextPath}/ServeFileServlet?email=${viaje.viajero.email}"
								alt="" class="img-rounded" height="200rem" width="auto"
								style="padding: 8%">
						</c:otherwise>
					</c:choose>
				</div>
				<div class="col-auto details">
					<br>
					<blockquote>
						<h5>${viaje.viajero.name}</h5>
						<small><cite title="Source Title">Empleado <i
								class="icon-map-marker"></i></cite></small>
					</blockquote>
					<p>
						${viaje.viajero.email} <br> ID Empleado: ${viaje.viajero.id}
						<br>

					</p>
				</div>
			</div>


			<!-- Viaje -->
			<div style="padding-top: 10px;"></div>
			<div class="row border">
				<div class="col-3">
					<br>
					<h2 style="width: 10rem;">Viaje ${viaje.nViaje}</h2>
					<br>
					<form action="EditarViajeServlet" method="get">
						<input type="hidden" name="nviaje" value="${viaje.nViaje }" /> <input
							type="hidden" name="email" value="${viaje.viajero.email}" />
						<button type="submit" class="btn btn-sm btn-primary btn-create"
							style="width: 10rem;">Editar solicitud</button>
					</form>
					<form action="FacturasServlet" method="post">
						<input type="hidden" name="nViaje" value="${viaje.nViaje}" />
						<button type="submit" class="btn btn-sm btn-primary btn-create"
							style="width: 10rem;">Ver facturas</button>
					</form>
					<form>
						<a class="btn btn-sm btn-primary btn-create" style="width: 10rem;"
							href="HomeServlet?email=${viaje.viajero.email}">Volver</a>
					</form>
				</div>


				<!-- List table -->
				<div class="col-9">
					<div class="panel-body">
						<br>
						<h3>Datos del viaje</h3>
						<p>Fecha de inicio: ${viaje.finicio}</p>
						<p>Fecha fin: ${viaje.ffin}</p>
						<p>Destino: ${viaje.destino}</p>
						<p>Descripción: ${viaje.descripcion}</p>
						<h3>Presupuesto:</h3>${viaje.presupuesto}
						€
					</div>
					<br>
				</div>
			</div>
		</div>

		<!-- Button group -->
		<div class="container" style="margin-top: 4%; padding-botton: 10%;">
			<div class="row">
				<span class="col-1"></span>
				<div class="col-3">
					<form>
						<button type="button" class="btn btn-sm btn-primary btn-create"
							data-toggle="modal" style="margin-top: 8%"
							data-target="#adjuntar">Adjuntar Factura</button>
					</form>


					<!-- Modal -->
					<div class="modal fade" id="adjuntar" tabindex="-1" role="dialog"
						aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
						<div class="modal-dialog modal-dialog-centered" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5>Subir factura</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<form action="SubirFacturaServlet" method="post"
									enctype="multipart/form-data">

									<div class="modal-body">
										<div class="input-group">
											<div class="custom-file">
												<input type="hidden" name="nViaje" value="${viaje.nViaje}" />
												<input type="file" class="form-control-file" name="file"
													id="exampleFormControlFile1">
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="submit" class="btn btn-aceptar">Subir</button>
										<button type="button" class="btn btn-secondary"
											data-dismiss="modal">Cancelar</button>
									</div>
								</form>

							</div>

						</div>
					</div>
				</div>
				<span class="col-1"></span>
				<div class="col-3">

					<c:choose>
						<c:when test="${viaje.status == 2}">
							<form action="Form5ReembolsoServlet" method="post">
								<input type="hidden" name="nViaje" value="${viaje.nViaje}" />
								<button type="submit" class="btn btn-sm btn-primary btn-create"
									style="margin-top: 8%">Solicitar Reembolso</button>
							</form>
						</c:when>
						<c:otherwise>
							<form>
								<button disabled class="btn btn-sm btn-secondary btn-create"
									style="margin-top: 8%">Solicitar Reembolso</button>
							</form>
						</c:otherwise>
					</c:choose>

				</div>
				<span class="col-1"></span>

				<div class="col-3">
					<c:choose>
						<c:when test="${viaje.status == 2 || viaje.status == 7}">
							<form action="Form2ReintegroServlet" method="post">
								<input type="hidden" name="nViaje" value="${viaje.nViaje}" />
								<button type="submit" class="btn btn-sm btn-primary btn-create"
									style="margin-top: 8%">Solicitar Reintegro</button>
							</form>
						</c:when>
						<c:otherwise>
							<form>
								<button disabled class="btn btn-sm btn-secondary btn-create"
									style="margin-top: 8%">Solicitar Reintegro</button>
							</form>

						</c:otherwise>
					</c:choose>



				</div>
			</div>
		</div>

	</shiro:user>

</body>
</html>