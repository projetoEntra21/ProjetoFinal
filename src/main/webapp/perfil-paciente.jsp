<%@page import="modelo.entidade.endereco.Endereco"%>
<%@page import="modelo.entidade.nutricionista.Nutricionista"%>
<%@page import="modelo.entidade.consulta.Consulta"%>
<%@page import="modelo.entidade.paciente.Paciente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/perfilpaciente.css"/>
	<style><%@include file="resources/css/perfilpaciente.css"%></style>
	
	<div class = "header">
					${sessionScope.usuario.nome}
			
					<a href="logout.jsp">sair</a>
				
				</div>
    
    <title>Paciente</title>
</head>
<body>

<!-- partial:index.partial.html -->
<div class="sttngs">
    <h2>Seu perfil</h2>
<div class="tabordion">
  <section id="section1">
    <input class="t" type="radio" name="sections" id="option1" checked>
    <label for="option1" class="trr"> Informacoes Pessoais</label>
    <article>
  
  
<div class="frm">     
        
<div id='profile-upload'>
<div class="hvr-profile-img">
  
  
  <input type="file" name="logo" id='getval'  class="upload"  id="imag">
    
  <div class="icon">
  <div class="camera4"><span></span></div>
  
  </div>
  </div>
  </div>
  
  <div class="tr">

   <label class="label" for="input">Nome:</label>
    <input class="input" value="${sessionScope.usuario.nome}" type="text" id="input" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem números e sem espaços"> 
  
    <label class="label" for="input">Sobrenome:</label>
    <input class="input" value="${sessionScope.usuario.sobrenome}" type="text" id="input" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem números e sem espaços"> 
    
    <label class="label" for="input">Cpf:</label>
    <input class="input" value="${sessionScope.usuario.cpf}" type="text" id="input" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem números e sem espaços"> 
 
    <label class="label" for="input">idade:</label>
    <input class="input" value="${sessionScope.usuario.idade}" type="number" id="input" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem números e sem espaços"> 
  
  </div>
  </article>
  </section>
  <section >

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> CONTA </label>

    <article>
    <div class="tr wwq">
        
      <label class="label" for="input">Nome de usuario</label>
      <input class="input" value="${sessionScope.usuario.login}" type="text" id="input" width = "70">
        
      <label class="label" for="input">Senha</label>
      <input class="input" value="${sessionScope.usuario.senha}" type="password" id="input">
        
      <label class="label" for="input">Confirmacao da senha</label>
      <input class="input" value="${sessionScope.usuario.senha}" type="password" id="input">
        
    </article>
    </section>

  
  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2">
    
  </article>
  </section>
  <section id="section3">
    <input class="t" type="radio" name="sections" id="option3">
    <label for="option3" class="trr">minhas Consultas</label>
    <article> 
       
    <div class="table-title">
         <h3></h3>
         </div>
         <table class="table-fill">
         <thead>
       		<tr>
       			<th class="text-left">DIA:</th>	
       			<th class="text-left">HORA:</th>
       			<th class="text-left">NUTRICIONISTA:</th>
       		</tr>
       		</thead>
         	<tbody class="table-hover">
       		<%List<Consulta> consultas = (List<Consulta>)request.getAttribute("consultas");
       		for(Consulta lista : consultas) {%>
       			<tr>
       			 <td class="text-left"><%=lista.getDia() %></th>
       			 <td class="text-left"><%=lista.getHora() %></th>
       			 <td class="text-left"><%=lista.getNutricionista().getNome()%></th>
				<%} %>
      		  </tr>
         </tbody>               
         </table>
        
         
   <a href="<%=request.getContextPath()%>/agendamento"><button type="button" width = "90" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
agendar minha consulta
     </button></a>
       
  </article>
  </section>
    
  </div>
  </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
</html>