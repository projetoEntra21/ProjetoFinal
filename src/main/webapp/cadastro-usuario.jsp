<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html lang="pt-br" >
<head>
<meta charset="UTF-8">
<title>Cadastro Usuario</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="./style.css">
<script src="./script.js"></script>

</head>
<body>
<form id="msform">
    <h2 class="fs-title">CRIE SUA CONTA</h2>
    <h3 class="fs-subtitle"></h3>
</form>
<body>
	<header>
		<nav>
			<ul>
				<li><a href="<%=request.getContextPath()%>/listar">Usuarios</a>
				</li>
			</ul>
		</nav>
	</header>
	<br>
	<div>
		<div>
			<div>
					<c:if test="${usuario == null}">
					<form action="inserir" method="post">
				</c:if>
					<label>Email:</label><input type="email" id="email" placeholder="Email" 
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email deve conter um @" required
						value="<c:out value='${usuario.email}' />" name="email">
					<label>Senha:</label><input type="password" placeholder="Senha" id="password" 
					required  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter letras maiúsculas e minúsculas, um número e mais de 8 caracteres."
						value="<c:out value='${Usuario.senha}'/>" name="senha">
					<label>Confirmar Senha:</label><input type="password" placeholder="Confirme Senha" id="confirm_password" required
					value="<c:out value='${Usuario.confimar}'/>" name= "confirmar">					
 					<button type="button" id=botao class="modal-btn" data-bs-toggle="modal" data-bs-target="#exampleModal">Enviar</button>
					</form>
			</div>
		</div>
	</div>
	
	              <input type="checkbox" id="modal" />
<label for="modal" class="modal-btn">
    <i class="fa fa-fire" aria-hidden="true"></i>
</label>
<label for="modal" class="modal-bg"></label>
<div class="modal-content">
    <label for="modal" class="close">
        <i class="fa fa-times" aria-hidden="true"></i>
    </label>
    <header>
        <h2>Confirmação de cadastro</h2>
    </header>
    <article class="content">
        <p>Seu cadastro foi concluido com sucesso :).</p>
    </article>
    <footer>
        <label for="modal" class="button ">Fechar</label>
    </footer>
</div>  
	
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script><script  src="./script.js"></script>

</body>
</html>