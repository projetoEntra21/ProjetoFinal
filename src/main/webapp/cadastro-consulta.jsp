<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>

   <link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/agendamento.css"/>
	<style><%@include file="resources/css/agendamento.css"%></style>
	<script><%@include file="resources/js/agendamento.js"%></script>		

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">


</head>
<body>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

	<script src="script.js"></script>
	<form method="post" action="inserirConsulta">
		<form id="form-login">
<div class="container">
	<div class="header">
		Agende sua consulta
	</div>
	<div class="form-container">
		<div class="subtitle">
			Informe sua informa��o de reserva.
		</div>
		<form action="inserirConsulta" onsubmit="return validadata(d)" method="post">
			<div class="form-section">
				<div class="form-label">
					<label for="">Nome</label>
				</div>
				<div class="input-container">
					<span class="input-icon">
						<i class="far fa-user"></i>
					</span>
					<input id="Nome" type="text" class="form-input"  placeholder="Entre com seu nome" pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$" title="Indique seu nome sem n�meros" required>
				</div>
			</div>
			
				<div class="form-section">
					<div class="form-label">
						<label for="">Sobrenome</label>
					</div>
					<div class="input-container">
						<span class="input-icon">
							<i class="far fa-user"></i>
						</span>
						<input id="Sobrenome" type="text" class="form-input"  placeholder="Entre com seu Sobrenome" pattern="^([AZ] {1} [az] {1,30} [-] {0,1} | [AZ] {1} [- \ '] { 1} [AZ] {0,1} [az] {1,30} [-] {0,1} | [az] {1,2} [- \ '] {1} [AZ] {1} [ az] {1,30}) {2,5} {3,20}$  "title="Indique seu sobrenome completo sem n�meros" required>
					</div>
				</div>
				<form action="" onsubmit="return validardata(d)" method="post">
			<div class="form-section" >
				<div class="form-label">
					<label for="">Data</label>
				</div>
				<div class="input-container">
					<span class="input-icon">
						<i class="far fa-calendar-alt"></i>
					</span>
					
					<input type="date" id="txtDat" class="form-input" onchange="validardata(this)" required pattern="[0-9]{2}-[0-9]{2}-[0-9]{4}" title="Entre com uma data v�lida">
				
				</div>
			</div>
		
			<div class="form-section">
				<div class="form-label">
					<label for="">Hora</label>
				</div>
				<div class="input-container">
					<span class="input-icon">
						<i class="far fa-clock"></i>
					</span>
					<input id="time" type="time" class="form-input"  min="07:00" max="18:00" required  pattern="([01][0-9]|2[0-3]):[0-5][0-9]">
				</div>
			</div>


				<div class="form-label">
					<label for="">Nome nutricionista</label>
				</div>
				<div class="input-container">
					<span class="input-icon">
						<i class="far fa-user"></i>
					</span>
					<input id="Nome" type="text" class="form-input"  placeholder="Entre com seu nome" pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$" title="Indique seu nome sem n�meros" required>
				</div>
			</div>
		
			<!-- Button trigger modal -->
<button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
Agendar
  </button>
  
  <!-- Modal -->
  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
	  <div class="modal-content">
		<div class="modal-header">
		  <h5 class="modal-title" id="exampleModalLabel">Confirma��o de agendamento</h5>
		  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		  </button>
		</div>
		<div class="modal-body">
		 Seu agendamento est� prestes a ser concluido. Suas informa��es est�o certas?
		</div>
		<div class="modal-footer">
		  <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
		  <button type="submit" class="btn btn-primary">Salvar informa��es </button >
		</div>
	  </div>
	</div>
  </div>

</body>
</html>