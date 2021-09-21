<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Cadastro Paciente</title>

 <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" 
       rel="stylesheet" />
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" 
       rel="stylesheet" 
       integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" 
       crossorigin="anonymous">
 <link rel="stylesheet" href="./cadastro2.css">

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
						<c:if test="${paciente == null}">
							<form action="inserirPaciente" method="post">
						</c:if>
						<c:if test="${paciente != null}">
							<input type="hidden" name="id"
								value="<c:out value='${paciente.id}'/>" />
						</c:if>

						<label>Nome</label> <input type="text" id="nome" required
						    pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$"
							placeholder="Insira seu nome" title="Indique seu nome sem números"
							required value="<c:out value='${paciente.nome}'/>"
							name="nome" />
							
					    <label>Sobrenome:</label> <input type="text" id="sobrenome" required
					        pattern="^([AZ] {1} [az] {1,30} [-] {0,1} | [AZ] {1} [- \ '] { 1} [AZ] {0,1} [az] {1,30} [-] {0,1} | [az] {1,2} [- \ '] {1} [AZ] {1} [ az] {1,30}) {2,5} {3,20}$"
					        placeholder="Insira seu sobrenome" title="Indique seu sobrenome completo sem números"
					        required value="<c:out value='${paciente.sobrenome}'/>"
					        name="sobrenome" />
					    
						<label>Idade</label> <input type="number" id="idade" required
						    pattern="[0-9]+$ "
							placeholder="Insira sua idade" title="Entre com uma idade válida"
							required value="<c:out value='${paciente.idade}'/>"
							name="idade" />
							
						<label>Cpf</label> <input type="text" id="cpf" required
							placeholder="Insira seu CPF"
							required value="<c:out value='${paciente.cpf}'/>"
							name="cpf" />
						
						<label>Email</label> <input type="text" id="email" required
						    pattern="/^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/"
							placeholder="Email" title="Precisa ter um @ e um ."
							required value="<c:out value='${paciente.email}'/>"
							name="email" />
							
						<label>Senha</label> <input type="password" id="myPassword" required
							placeholder="Senha"
							name="senha" />
						
						 <label>Confirmar Senha:</label> <input
							type="password" placeholder="Confirme Senha"
							id="confirm_password" required
							value="<c:out value='${paciente.confirmar}' />"name="confirmar" />
					
						<button type="button" id="botao" class="button"
							data-toggle="modal" data-target="#exampleModal">Cadastrar</button>
					</div>
				</div>
			</div>
   
 <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
 <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script><script  src="./script.js"></script>
 
</body>
</html>