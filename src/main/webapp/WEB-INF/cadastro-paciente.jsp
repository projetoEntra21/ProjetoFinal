<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <link type="text/css" rel="stylesheet" href="css/style.css">
   <script type="text/javascript" src="js/script.js"></script>
   
<!DOCTYPE html>
<html lang ="pt-br">
<head>
<meta charset="UTF-8">
<title>Cadastro paciente</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

</head>
<body>
<form id="msform">

  
  </ul>
  <!-- fieldsets -->
  <fieldset>
    <h2 class="fs-title">CRIE SUA CONTA</h2>
    <h3 class="fs-subtitle"></h3>
    <input type="email" id="email" placeholder="Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email deve conter um @" required>
    <input type="password" placeholder="Senha" id="password" required  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter letras maiúsculas e minúsculas, um número e mais de 8 caracteres.">
        <input type="password" placeholder="Confirme Senha" id="confirm_password" required> 
  <button type="submit" class="button">Enviar <span class="send"><i class="far fa-paper-plane"></i></span></button>
  </fieldset>
  
</form>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script><script  src="./script.js"></script>

<header>
		<nav>
			<ul>
				<li><a href="<%=request.getContextPath()%>/listar">Pacientes</a>
				</li>
			</ul>
		</nav>
	</header>
	<br>
	<div>
		<div>
			<div>
				<c:if test="${paciente != null}">
					<form action="atualizar" method="post">
				</c:if>
				<c:if test="${paciente == null}">
					<form action="inserir" method="post">
				</c:if>
				<caption>
					<h2>
						<c:if test="${paciente != null}">Editar Paciente</c:if>
						<c:if test="${paciente == null}">Inserir Paciente</c:if>
					</h2>
				</caption>
				<c:if test="${paciente != null}">
					<input type="hidden" name="id"
						value="<c:out value='${paciente.id}' />" />
				</c:if>
					<label>Email:</label> <input type="email"
						value="<c:out value='${paciente.email}' />" name="email">
					<label>Senha:</label> <input type="password"
						value="<c:out value='${paciente.senha}'/>" name="senha">
				    <button type="submit">Enviar</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>