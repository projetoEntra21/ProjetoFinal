<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastro Nutricionista</title>

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
<body>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="script.js"></script>
	<form id="msform">
		</ul>


		<fieldset>
			<h2 class="fs-title">CRIE SUA CONTA</h2>
			<h3 class="fs-subtitle"></h3>

			<div>
				<div>
					<div>
						<c:if test="${nutricionista == null}">
							<form action="inserir" method="post">
						</c:if>
						<c:if test="${nutricionista != null}">
							<input type="hidden" name="id"
								value="<c:out value='${consulta.id}'/>" />
						</c:if>

						<label>Cnpj</label><input type="text" id="cnpj"
							placeholder="Cnpj" title="Siga o formato  XX. XXX. XXX/XXXX-XX."
							required value="<c:out value='${nutricionista.cnpj}'/>"
							name="cnpj" />
							
							 <label>Senha:</label> <input type="password"
							placeholder="Senha" id="password" required
							pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
							title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres"
							required value="<c:out value='${nutricionista.senha}'/>"
							name="senha" />
							
							 <label>Confirmar Senha:</label><input
							type="password" placeholder="Confirme Senha"
							id="confirm_password" required
							value="<c:out value='${nutricionista.confirmar}' />"name="confirmar" />
						
						<button type="button" id="botao" class="button"
							data-toggle="modal" data-target="#exampleModal">Cadastrar</button>
					</div>
				</div>
			</div>
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script><script  src="./script.js"></script>

</body>
</html>