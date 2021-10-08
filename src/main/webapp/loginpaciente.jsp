
<!DOCTYPE html>
<html lang="pt-br" >
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <meta name="viewport" content="width=device-width, initial-scale=1"><link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css'>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/login.css"/>
	<style><%@include file="resources/css/loginpaciente.css"%></style>
	<script><%@include file="resources/js/agendamento.js"%></script>
  
  
</head>
<body>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="script.js"></script>
<!-- partial:index.partial.html -->
	<form id="form-login" method = "post" action = "loginPaciente">
	<div class="container">
			<div class="header">
				Faça login
			</div>
	<div class="form-container">
		<div class="subtitle">
			Informe sua informação de login.
		</div>
			<div class="form-section">
				<div class="form-label">
					<label for=""></label>
				</div>
				<div class="input-container">
					<span class="input-icon">
						<i class="far fa-user"></i>
					</span>
					<input id="email" type="email" class="form-input"  placeholder="Entre com seu email" required>
				</div>
			</div>
			
				<div class="form-section">
					<div class="form-label">
						<label for=""></label>
					</div>
					<div class="input-container">
						<span class="input-icon">
							<i class="far fa-user"></i>
						</span>
						<input id="senha" type="text" class="form-input"  placeholder="Entre com sua senha"  required>
					</div>
				</div>
                <button type="submit" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
                    Agendar
                      </button>
                      </form>
</body>
</html>