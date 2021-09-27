<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/cadastronutricionista.css"/>
	<style><%@include file="resources/css/cadastronutricionista.css"%></style>
	<script><%@include file="resources/js/cadastronutricionista.js"%></script>		
<title>Cadastro Nutricionista</title>
  		
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

</head>
<body>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="script.js"></script>

	<form  id="msform" method="post" action="inserirNutricionista">
		<fieldset>
			<h2 class="fs-title">CRIE SUA CONTA</h2>
			<h3 class="fs-subtitle"></h3>	
					 <input type="text" name="nome"
					id="nome" placeholder="Insira seu nome "
					pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$"
					title="Indique seu nome sem números" required="required"
					value="<c:out value='${nutricionista.nome}'/>" name="nome" />
					
				<input type="text"
					name="sobrenome" id="sobrenome" placeholder="Insira seu sobrenome"
					required="required"
					value="<c:out value='${nutricionista.sobrenome}'/>" name="sobrenome" />
		
			<input type="text" id="cnpj"
					placeholder="Cnpj" title="Siga o formato  XX. XXX. XXX/XXXX-XX."
					required="required" value="<c:out value='${nutricionista.cnpj}'/>" name="cnpj" />
		
				<input type="password"
					placeholder="Senha" id="password" required
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres"
					required>

				<input type="password"
					placeholder="senha" id="confirm_password" required="required"
					value="<c:out value='${nutricionista.senha}'/>" name="senha" />
	
			<button type="button" id="botao" class="button" data-toggle="modal"
				data-target="#exampleModal">Cadastrar</button>

			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Confirmação
								de cadastro</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">Seu cadastro está prestes a ser
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
		</fieldset>
	</form>
</body>
</html>