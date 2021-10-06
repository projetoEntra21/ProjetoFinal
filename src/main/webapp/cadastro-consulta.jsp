<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>

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


<link href="<%=request.getContextPath()%>resources/css/agendamento.css" />
<style><%@include file="resources/css/agendamento.css"%></style>
<script><%@include file="resources/js/agendamento.js"%></script>

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" />

</head>
<body>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

	<form method="post" action="inserirConsulta">

		<form id="form-login">
			<div class="container">
				<div class="header">Agende sua consulta</div>
				<div class="form-container">
					<div class="subtitle">Informe sua informação de reserva.</div>
					<form action="" onsubmit="return validadata(d)" method="post">
						<div class="form-section">
							<div class="form-label">

								<label class="fieldlabels">ID paciente:</label> <input
									type="text" placeholder="ID paciente: "
									value="<c:out value='${paciente.id}'/>" name="idpaciente" />


								<form action="" onsubmit="return validardata(d)" method="post">
									<div class="form-section">
										<div class="form-label">
											<label for="">Data</label>
										</div>
										<div class="input-container">
											<span class="input-icon"> <i
												class="far fa-calendar-alt"></i>
											</span> 
											<input type="date" required="required"
												value="<c:out value='${consulta.data}'/>" name="data"
												id="txtDat" class="form-input" onchange="validardata(this)"
												required pattern="[0-9]{2}-[0-9]{2}-[0-9]{4}"
												title="Entre com uma data válida"> />

										</div>
									</div>

									<br>

									<div class="form-section">
										<div class="form-label">
											<label for="">Hora</label>
										</div>
										<div class="input-container">
											<span class="input-icon"> <i class="far fa-clock"></i>
											</span> <input type="time" required="required" class="form-input"
												min="07:00" max="18:00" required
												pattern="([01][0-9]|2[0-3]):[0-5][0-9]"
												value="<c:out value='${consulta.hora}'/>" name="hora" />

										</div>
									</div>

									<br>
									<div class="form-section">
										<div class="form-label">
											<label for="">Nutricionista</label>
										</div>
										<div class="input-container">
											<span class="input-icon"> <i class="fas fa-asterisk"></i>
											</span> <select class="form-control" required="required"
												id="idnutri" name="idnutri">
												<c:forEach var="nutricionista" items="${nutricionistas}">
													<option value="${nutricionista.id}">
														<c:out value="${nutricionista.nome}" />
													</option>
												</c:forEach>
											</select> <br>




											<!-- Button trigger modal -->
											<button type="button" id="botao" class="button"
												data-toggle="modal" data-target="#exampleModal">Agendar</button>

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
														<div class="modal-body">Seu agendamento está prestes
															a ser concluido. Suas informações estão certas?</div>
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

								<script
									src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
								<script><%@include file="resources/js/agendamento.js"%></script>
</body>
</html>