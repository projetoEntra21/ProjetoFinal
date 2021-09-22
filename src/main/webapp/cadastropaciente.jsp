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
<style type="text/css"> @import url("../css/cadastro2.css"); </style>
</head>
<body>

 

     <script 
         src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
     <script 
         src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
     <script 
         src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
     <script src="script.js"></script>
 <form method="post" action="inserirPaciente">
    <fieldset>
         <h2 class="fs-title">CRIE SUA CONTA</h2>
         <h3 class="fs-subtitle"></h3>

<p>
                        <label>Nome</label> <input type="text" id="nome" 
                            pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$"
                            placeholder="Insira seu nome" title="Indique seu nome sem números"
                             required="required"
                            value="<c:out value='${paciente.nome}'/>" name="nome" />
                            </p>
                            <p>
                        <label>Sobrenome:</label> <input type="text" id="sobrenome" 
                            placeholder="Insira seu sobrenome" title="Indique seu sobrenome completo sem números"
                              required="required"
                            value="<c:out value='${paciente.sobrenome}'/>" name="sobrenome" />
                         </p>
                            <p>
                        <label>Idade</label> <input type="number" id="idade" 
                            pattern="[0-9]+$ "
                            placeholder="Insira sua idade" title="Entre com uma idade válida"
                            required="required"
                            value="<c:out value='${paciente.idade}'/>" name="idade" />
                             </p>
                            <p>
                        <label>Cpf</label> <input type="text" id="cpf" 
                            placeholder="Insira seu CPF"
                             required="required"
                            value="<c:out value='${paciente.cpf}'/>" name="cpf" />
                         </p>
                            <p>
                        <label>Email</label> <input type="text" id="email" 
                            placeholder="Email" title="Precisa ter um @ e um ."
                              required="required"
                            value="<c:out value='${paciente.email}'/>" name="email" />
                             </p>
                            <p>
                        <label>Senha</label> <input type="password" id="myPassword" 
                            placeholder="Senha"name="senha" />
                         </p>
                            <p>
                         <label>Confirmar Senha:</label> <input
                            type="password" placeholder="Senha"
                            id="senha"   required="required"
                            value="<c:out value='${paciente.senha}'/>" name="senha" />
                     </p>
                            <p>
                        <button type="submit" id="botao" class="button">Cadastrar</button>
   
  </fieldset>
  </form>
</body>
</html>