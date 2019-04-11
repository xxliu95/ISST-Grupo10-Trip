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

<title>Administrador</title>

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
<shiro:lacksRole name="admin">
		<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"
					style="color: #00adb5; letter-spacing: 3px">Gestión de viajes</a>
				<button class="navbar-toggler" type="bottom" data-toggle="collapse"
					data-target="#navbarResponsive" action="LoginServlet">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsive">
					
				</div>
			</div>
		</nav>
		
		<h2 style="text-align:center; padding-top:100px;">No tienes permisos de administrador</h2>
</shiro:lacksRole>

<shiro:hasRole name="admin">
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

		<div  style="padding-top:5em; padding-left:10%; padding-right:10%;">
				<div class="row"">
			<div class="col-12">
				<h3 style="text-align:centered;">Listado de Empleados</h3>
			</div>
		</div>

		<div class="row">
			<div class="col-12">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Nombre</th>
							<th scope="col">Email</th>
							<th scope="col">Responsable</th>
							<th scope="col">Acción</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${empleado_list}" var="empl">
							<tr>
								<td scope="row">${empl.name }</td>
								<td scope="row">${empl.email }</td>
								<td scope="row">
								<c:choose>
   									<c:when test="${empl.responsable=='true'}">
										SI
    								</c:when>    
    								<c:otherwise>
        								NO
    								</c:otherwise>
								</c:choose>
								<td scope="row"><c:if test="${empl.responsable == false}">
										<form action="SetResponsableServlet" method="post">
											<input type="hidden" name="email" value="${empl.email}" />
											<button class="btn btn-light" type="submit">Fijar Responsable</button>
										</form>
									</c:if></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>



	</shiro:hasRole>


</body>
</html>