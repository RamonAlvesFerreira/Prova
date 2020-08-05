<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page import="com.treinamento.moduloweb.modulo.Modulo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Lista de Modulos</title>
</head>
<body>
	<br>
	<h3 style="text-align:center">LISTA DE MODULOS</h3>
	<br>
	<table class="table" width="50%">
		<tr>
			<th>
				Nome
			</th>
			<th>
				Instrutor Titular
			</th>
			<th>
				Instrutor Auxiliar
			</th>
			<th>
				Data Inicio
			</th>
		</tr>
		
		<c:forEach var="modulo" items="${modulo}">
				<tr>
					<td><c:out value="${ modulo.getNm_modulo()}"></c:out>  </td>
					<td><c:out value="${ modulo.getNm_instrutor1()}"></c:out>  </td>
					<td><c:out value="${ modulo.getNm_instrutor2()}"></c:out>  </td>
					<td><c:out value="${ modulo.getDt_inicio()}"></c:out>  </td>

				</tr>
		</c:forEach>
	</table>
	
	<div>

	</div>
</body>
</html>