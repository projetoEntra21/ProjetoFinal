<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>

<link rel="stylesheet"
	href="<%=request.getContextPath()%>../css/agendamento.css" />
<style><%@includefile="../css/agendamento.css"%>
</style>


<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" />

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="./cadastronutricionista.css">

</head>
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
				<div class="header">Agende sua consulta</div>
				<div class="form-container">
					<div class="subtitle">Informe sua informação de reserva.</div>
					<form action="" onsubmit="return validadata(d)" method="post">
						<div class="form-section">
							<div class="form-label">
								<label for="">Nome</label>
							</div>
							<div class="input-container">
								<span class="input-icon"> <i class="far fa-user"></i>
								</span> <input id="Nome" type="text"
									value="<c:out value='${paciente.nome}'/>" name="nome"
									class="form-input" placeholder="Entre com seu nome"
									title="Indique seu nome sem números" required>
							</div>
						</div>

						<div class="form-section">
							<div class="form-label">
								<label for="">Sobrenome</label>
							</div>
							<div class="input-container">
								<span class="input-icon"> <i class="far fa-user"></i>
								</span> <input id="Sobrenome" type="text"
									value="<c:out value='${paciente.sobrenome}'/>" name="sobrenome"
									class="form-input" placeholder="Entre com seu Sobrenome"
									
									title="Indique seu sobrenome completo sem números" required>
							</div>
						</div>
						<form action="" onsubmit="return validardata(d)" method="post">
							<div class="form-section">
								<div class="form-label">
									<label for="">Data</label>
								</div>
								<div class="input-container">
									<span class="input-icon"> <i class="far fa-calendar-alt"></i>
									</span> <input type="date" value="<c:out value='${consulta.data}'/>"
										name="data" id="txtDat" class="form-input"
										onchange="validardata(this)" required
										title="Entre com uma data válida">

								</div>
							</div>

							<div class="form-section">
								<div class="form-label">
									<label for="">Hora</label>
								</div>
								<div class="input-container">
									<span class="input-icon"> <i class="far fa-clock"></i>
									</span> <input id="time" type="time"
										value="<c:out value='${consulta.hora}'/>" name="hora"
										class="form-input" min="07:00" max="18:00" required>
								</div>
							</div>


			
	        <c:forEach var="consulta" items="${consultas}">
	        	<p><a href="listarNutricionistas?idNutricionista=<c:out value='${nutricionista.id}'/>"><c:out value="${nutriconista.nome}"/></a></p>	        	        	
			</c:forEach>		
	       							 	
								<div class="input-container">
									<span class="input-icon"> <i class="fas fa-asterisk"></i>
									</span> <select id="service" class="form-select" required>
										<option value="" selected disabled <a href="<%=request.getContextPath()%>/listarNutricionistas">
										</a>>Selecione um
											nutricionista de sua preferencia</option>
										<option value="">Nutricionista 1</option>
										<option value="">Nutricionista 2</option>
										<option value="">Nutricionista 3</option>

									</select>
								</div>
							</div>

							<!-- Button trigger modal -->
							<button type="button" id="botao" class="button"
								data-toggle="modal" data-target="#exampleModal">
								Agendar</button>

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
										<div class="modal-body">Seu agendamento está prestes a
											ser concluido. Suas informações estão certas?</div>
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
					</form>
				


</body>
</html>