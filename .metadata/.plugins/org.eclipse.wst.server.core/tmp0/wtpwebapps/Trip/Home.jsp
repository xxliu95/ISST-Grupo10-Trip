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

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


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
				<div class="login-main-text row">
					<h2 class="col-8">Gestión de viajes</h2>
					<div class="col-2" style="
					  z-index: -1;
					  position: fixed;
					" id="spinner"></div>
				</div>
				
				<div class="login-form">
					<form id="myForm" action="LoginServlet" method="post">
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
<script>
	document.getElementById("myForm").addEventListener("submit", myFunction);

	function myFunction() {
		document.getElementById("spinner").innerHTML='<span class="col-12"></span><i class="fa fa-spinner fa-pulse fa-3x fa-fw"></i><span class="sr-only">Loading...</span>';
	}
</script>
		

	</shiro:guest>

	<shiro:user>
		
	<!-- Navigation -->
		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"
					style="color: #00adb5; letter-spacing: 3px">Gestión de viajes</a>
					<div class="dropdown navbar-left">
         		 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fas fa-bell"></i>

         		 </a>
          			<ul class="dropdown-menu notify-drop">
           				 <div class="notify-drop-title">
            				<div class="row">
            					<span class="col-1"></span>
            					<div class="col-6">Notificaciones</div>
            				</div>
            			</div>
		            <div class="drop-content">
		            <c:if test="${fn:length(notificaciones) == 0}">
		            <li>
		            		<p class="col-12">No hay notificaciones</p>
		            	</li>
		            </c:if>
		            <c:forEach items="${notificaciones}" var="notificacioni">
		            	<li>
								<div class="col-12">
								<div class="row">
								<div class="col-9">
									<i class="fa fa-dot-circle-o"></i><p><b>${notificacioni.subject}</b></p>
								</div>
								<div class="col-3">
										<form action="NotificacionVistoServlet" method="post" class="col-3"'>
										<input type="hidden" name="nNotificacion" value="${notificacioni.nNotificacion}" />
										<button type="submit" class="btn"><i class="fas fa-times"></i></button>
									</form>								
								</div>	
								</div>	            		
		            		<hr>
		            		<p class="col-12">${notificacioni.msg}</p>
		            		</div>
		            		
		            	</li>
		            </c:forEach>
		            </div>
		          </ul>
		        </div>
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
						<c:when test="${empleado.foto == null }">
							<form action="SubirFotoServlet" method="post"
								enctype="multipart/form-data">
								<input type="hidden" name="email" value="${empleado.email}" />
								<input type="file" name="file">
								<button type="submit" class="btn btn-sm btn-primary btn-create"
									style="margin-top: 8%">Poner una imagen</button>
							</form>
						</c:when>
						<c:otherwise>
							<img
								src="${pageContext.request.contextPath}/ServeFileServlet?email=${empleado.email}"
								alt="" class="img-rounded" height="200rem" width="auto"
								style="padding: 8%">
						</c:otherwise>
					</c:choose>
				</div>
				<div class="col-auto details">
					<br>
					<blockquote>
						<h5>${empleado.name}</h5>
						<small><cite title="Source Title"> Empleado<i
								class="icon-map-marker"></i></cite></small>
					</blockquote>
					<p>
						${empleado.email} <br> ID Empleado: ${empleado.id} <br>

					</p>
			<!-- Solicitar viaje  -->
				<p>
				<form action="SolicitarViajeServlet" method="get">
					<input type="hidden" name="email" value="${empleado.email}" />
					<button type="submit" class="btn btn-sm btn-primary btn-create">Solicitar un viaje</button>
				</form>
				</p>

				</div>

			</div>

			<!-- List table -->

			<div class="panel-body" style="padding-top:10px;">
				<table class="table table-striped table-bordered table-list">
					<thead>
						<tr>
							<th class="hidden-xs">ID</th>
							<th>Viaje</th>
							<th>Información</th>
							<th>Estado</th>
							<th>Acción</th>
						</tr>
					</thead>
					<c:forEach items="${empleado.viajes}" var="viajei">
						<tbody>
							<tr>
								<td class="hidden-xs">${viajei.nViaje}</td>
								<td>${viajei.destino }</td>
								<td>Fecha inicio: ${viajei.finicio } <br>Fecha fin:
									${viajei.ffin } <br>Descripción: ${viajei.descripcion } <br>
								</td>
								<td><c:choose>
										<c:when test="${viajei.status == 1 }">Viaje solicitado</c:when>
										<c:when test="${viajei.status == 2 }">Viaje aceptado</c:when>
										<c:when test="${viajei.status == 3 }">Solicitando reintegro</c:when>
										<c:when test="${viajei.status == 4 }">Reintegro aceptado por responsable</c:when>
										<c:when test="${viajei.status == 5 }">Reintegro aceptado por OCG</c:when>
										<c:when test="${viajei.status == 6 }">Solicitando reembolso</c:when>
										<c:when test="${viajei.status == 7 }">Reembolso aceptado</c:when>
									</c:choose></td>
								<td style="text-align: center;">
									<form action="ViajeServlet" class="align-middle" method="get">
										<input type="hidden" name="nViaje" value="${viajei.nViaje}" />
										<button class="btn " type="submit">
											<i class="fas fa-angle-right fa-3x" style="width: 100px;"></i>
										</button>
									</form>
								</td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
		</div>
	</shiro:user>

</body>
</html>