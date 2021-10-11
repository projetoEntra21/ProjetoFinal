<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Agendamento de consulta</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css'>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">

<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/agendamento.css"/>
	<style><%@include file="resources/css/agendamento.css"%></style>
	<script><%@include file="resources/js/agendamento.js"%></script>

</head>
<body>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	<!-- partial:index.partial.html -->
	<form id="form-login" method ="post" action ="inserirConsulta">
		<div class="container">
		
			<div class="header">Agende sua consulta</div>
			<div class="form-container">
				<div class="subtitle">Informe sua informação de reserva.</div>
				<form action="" onsubmit="return validadata(d)" method="post">
					<div class="form-section">
						<div class="form-label">
						</div>
						<div class="input-container">
							</span> <input id="idpaciente" type="hidden" class="form-input"
								placeholder="Entre com seu ID"
								title="Indique seu sobrenome completo sem números" required value="<c:out value='${sessionScope.usuario.id}'/>" name="idpaciente" />
						</div>
					</div>
					<div class="form-section">
						<div class="form-label">
							<label for="">Data</label>
						</div>
						<div class="input-container">
							<span class="input-icon"> <i class="far fa-calendar-alt"></i>
							</span> <input type="date" id="txtDat" class="form-input"
								onchange="validardata(this)" required
								title="Entre com uma data válida" value="<c:out value='${consulta.data}'/>" name="data"/> 

						</div>
					</div>

					<div class="form-section">
						<div class="form-label">
							<label for="">Hora</label>
						</div>
						<div class="input-container">
							<span class="input-icon"> <i class="far fa-clock"></i>
							</span> <input id="time" type="time" class="form-input" min="07:00"
								max="18:00" required pattern="([01][0-9]|2[0-3]):[0-5][0-9]" value="<c:out value='${consulta.hora}'/>" name="hora" />
						</div>
					</div>


					<div class="form-section">
						<div class="form-label">
							<label for="">Nutricionista</label>
						</div>
						<div class="input-container">
							<span class="input-icon"> <i class="fas fa-asterisk"></i>
							</span> <select id="service" class="form-select" required = "required" name = "idnutri">
								  <c:forEach var="nutricionista" items="${nutricionistas}">
								<option value="" selected disabled>Selecione um
									nutricionista de sua preferencia</option>
								<option value="${nutricionista.id}">
							    <c:out value="${nutricionista.nome}"/>
    							 </option>
                           	 </c:forEach>
							</select>
						</div>
					</div>

					<!-- Button trigger modal -->
					<button type="button" id="botao" class="button" data-toggle="modal"
						data-target="#exampleModal">Agendar</button>

					<!-- Modal -->
					<div class="modal fade" id="exampleModal" tabindex="-1"
						role="dialog" aria-labelledby="exampleModalLabel"
						aria-hidden="true">
						<div class="modal-dialog" role="document">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">Confirmação
										de agendamento</h5>
									<button type="button" class="close" data-dismiss="modal"
										aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
								</div>
								<div class="modal-body">Seu agendamento está prestes a ser
									concluido. Suas informações estão certas?</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-dismiss="modal">Fechar</button>
									<button type="submit" class="btn btn-primary">Salvar
										informações</button>
								</div>
							</div>
						</div>
					</div>
				</form>
</body>
</html>