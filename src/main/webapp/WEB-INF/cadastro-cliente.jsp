<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
+<head>
<meta charset="ISO-8859-1">
<title>Cadastro Paciente</title>

    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="./style.css">
    
</head>
<body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="script.js"></script>
<form id="msform">
  </ul>

<fieldset>
    <h2 class="fs-title">CRIE SUA CONTA</h2>
    <h3 class="fs-subtitle"></h3>
    <input type="text" id="email" placeholder="email" pattern="/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/" title="Siga o formato  XX. XXX. XXX/XXXX-XX." required>
    <input type="password" placeholder="Senha" id="password" required  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter pelo menos um n�mero e uma letra mai�scula e min�scula e pelo menos 8 ou mais caracteres">
        <input type="password" placeholder="Confirme Senha" id="confirm_password" required>
      
        <button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
         Cadastrar
         
            </button>
	</header>
	<br>
	<div>
		<div>
			<div>
				    <c:if test="${cadastro == null}"></c:if>>
					<form action="inserir cliente" method="post">
				
				<caption>
					<h2>
						<c:if test="${email == null}">Cadastrar Email</c:if>
						<c:if test="${senha == null}">Cadastrar Senha</c:if>
						<c:if test="${senha == senha}">Confirmar Senha</c:if>
					</h2>
				</caption>
				<c:if test="${cadastro != null}">
					<input type="hidden" name="id"
					value="<c:out value='${cadastro.id}' />" />
				</c:if>
					<label>Email:</label> <input type="text" id="email" placeholder="email" pattern="/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/" title="Siga o formato  XX. XXX. XXX/XXXX-XX." required>
					<label>Senha:</label> <input type="password" id="password" required  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter pelo menos um n�mero e uma letra mai�scula e min�scula e pelo menos 8 ou mais caracteres">
				    <label>Confirmar Senha:</label> <input type="password" id="confirm_password" required>
				    <button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">Cadastrar</button>
				</form>
			</div>
		</div>
	</div>

<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script><script  src="./script.js"></script>

</body>


</html>