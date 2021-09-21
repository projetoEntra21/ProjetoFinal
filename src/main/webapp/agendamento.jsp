<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
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
<link rel="stylesheet" href="./style.css">
</head>
<body>
	<div class="header">Agende sua consulta</div>
	<div class="form-container">
		<div class="subtitle">Informe sua informa��o de reserva.</div>
	</div>
	<div>
		<div>
			<div>
				<c:if test="${consulta == null}">
					<form action="inserir" method="post">
				</c:if>
				<c:if test="${consulta != null}">
					<input type="hidden" name="id"
						value="<c:out value='${consulta.id}'/>" />
				</c:if>
				<form action="" onsubmit="return validadata(d)" method="post">
					<div class="form-section">
						<div class="form-label">
							<label>Nome:</label><input type="text" tclass="form-input"
								placeholder="Entre com seu nome"
								patern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$"
								title="Indique seu nome sem n�meros" required
								value="<c:out value='${consulta.nome}'/>" name="nome"> <br>
						</div>
					</div>
					<div class="form-section">
						<div class="form-label"></div>
						<div class="input-container">
							<span class="input-icon"> <i class="far fa-user"></i>
							</span> <label>Sobrenome:</label><input type="text" class="form-input"
								placeholder="Entre com seu Sobrenome"
								pattern="^([AZ] {1} [az] {1,30} [-] {0,1} | [AZ] {1} [- \ '] { 1} [AZ] {0,1} [az] {1,30} [-] {0,1} | [az] {1,2} [- \ '] {1} [AZ] {1} [ az] {1,30}) {2,5} {3,20}$  "
								title="Indique seu sobrenome completo sem n�meros" required
								value="<c:out value='${consulta.sobrenome}' />" name="sobrenome">
						</div>
					</div>

					<form action="" onsubmit="return validardata(d)" method="post">
						<div class="form-section">
							<div class="form-label"></div>
							<div class="input-container">
								<span class="input-icon"> <i class="far fa-calendar-alt"></i>
								</span> <label>Data:</label><input type="date" id="txtDat"
									class="form-input" onchange="validardata(this)" required
									pattern="[0-9]{2}-[0-9]{2}-[0-9]{4}"
									title="Entre com uma data v�lida"
									value="<c:out value='${consulta.date}' />" name="date">
							</div>
						</div>
						<div class="form-section">
							<div class="form-label"></div>
							<div class="input-container">
								<span class="input-icon"> <i class="far fa-clock"></i>
								</span> <br> <label>Hora:</label><input type="time"
									class="form-input" min="07:00" max="18:00" required
									pattern="([01][0-9]|2[0-3]):[0-5][0-9]"
									value="<c:out value='${consulta.hora}' />" name="hora">
							</div>
						</div>
						<button type="button" id="botao" class="button"
						data-toggle="modal" data-target="#exampleModal">Agendar</button>
			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
</body>
</html>