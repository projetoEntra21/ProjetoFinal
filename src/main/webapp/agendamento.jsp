<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>



   <link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/agendamento.css"/>
	<style><%@include file="resources/css/agendamento.css"%></style>
	<script><%@include file="/resources/js/agendamento.js"%></script>		

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" />

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">


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
		<fieldset>
			<h2 class="fs-title">CRIE SUA CONSULTA</h2>
			<h3 class="fs-subtitle"></h3>

			<div class="input-container">
				<span class="input-icon"> <i class="far fa-user"></i>
				</span> <label>Nome:</label><input type="text" required="required"
					class="form-input" placeholder="Entre com seu nome"
					pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$"
					title="Indique seu nome sem números"
					value="<c:out value='${paciente.nome}'/>" name="nome" />
			</div>

			<div class="input-container">
				<span class="input-icon"> <i class="far fa-user"></i>
				</span> <label>Sobrenome:</label><input type="text" required="required"
					class="form-input" placeholder="Entre com seu Sobrenome"
					title="Indique seu sobrenome completo sem números"
					value="<c:out value='${paciente.sobrenome}'/>" name="sobrenome" />
			</div>

			<div class="input-container">
				<span class="input-icon"> <i class="far fa-calendar-alt"></i>
				</span> <label>Data:</label><input type="date" required="required"
					id="txtDat" class="form-input" onchange="validardata(this)"
					title="Entre com uma data válida"
					value="<c:out value='${consulta.data}'/>" name="data" />
			</div>

			<div class="input-container">
				<span class="input-icon"> <i class="far fa-clock"></i>
				</span> <label>Hora:</label><input type="time"
					class="form-input" min="07:00" max="18:00" required
					pattern="([01][0-9]|2[0-3]):[0-5][0-9]"
					value="<c:out value='${consulta.hora}'/>" name="hora" />
			</div>

			<div class="form-section">
				<div class="form-label">
					<label for="">Nutricionista</label>
				</div>
				<div class="input-container">
					<span class="input-icon">
						<i class="fas fa-asterisk"></i>
					</span>
					<c:forEach var="nutricionista" items="${nutricionistas}">
					<select id="service" class="form-select" required>
						<option value="" selected disabled>Selecione um nutricionista de sua preferencia</option>
						<option value="Option 1">Nutricionista 1 </option>
						<option value="Option 2">Nutricionista 2</option>
						<option value="Option 3">Nutricionista 3</option>
					</c:forEach>
					</select>
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
		  <h5 class="modal-title" id="exampleModalLabel">Confirmação de agendamento</h5>
		  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			<span aria-hidden="true">&times;</span>
		  </button>
		</div>
		<div class="modal-body">
		 Seu agendamento está prestes a ser concluido. Suas informações estão certas?
		</div>
		<div class="modal-footer">
		  <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
		  <button type="submit" class="btn btn-primary">Salvar informações </button >
		</div>
	  </div>
	</div>
  </div>
		</fieldset>
	</form>



</body>
</html>