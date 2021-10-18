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
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/perfilnutricionista.css"/>
	<style><%@include file="resources/css/perfilnutricionista.css"%></style>
	
	<div class = "header">
					${sessionScope.usuario.nome}
			
					<a href="logout.jsp">sair</a>
				
				</div>
    
    <title>Nutricionista</title>
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

    <label class="label" for="input">NOME: </label>	
	  <input class="input e" value = "${sessionScope.usuario.nome}" type="text" id="input">
	  
	<label class="label" for="input">SOBRENOME: </label>	
	  <input class="input e" value = "${sessionScope.usuario.sobrenome}" type="text" id="input">
  
    <label class="label" for="input">CPF:</label>	
	  <input class="input e" value = "${sessionScope.usuario.cpf}" type="tel" id="input">
	  
	<label class="label" for="input">IDADE:</label>	
	  <input class="input e" value = "${sessionScope.usuario.idade}" type="tel" id="input">
	    
      
  </article>
  </section>

  <section >

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> INFORMACOES DA CONTA </label>

    <article>
    <div class="tr wwq">
        
      <label class="label" for="input">Nome de usuário</label>
      <input class="input" type="text" value = "${sessionScope.usuario.login}" id="input" width = "70">
             
      <label class="label" for="input">Senha</label>
      <input class="input" type="password" value = "${sessionScope.usuario.senha}" id="input">
        
      <label class="label" for="input">Confirmação da senha</label>
      <input class="input" type="password" value = "${sessionScope.usuario.senha}" id="input">
        
    </article>
    </section>
    
  </article>
  </section>
  <section id="section3">
    <input class="t" type="radio" name="sections" id="option3">
    <label for="option3" class="trr"> MINHAS CONSULTAS</label>
    <article> 
       
     <table>

           <div class="table-title">
         <h3></h3>
         </div>
         <table class="table-fill">
         <thead>
       		<tr>
       			<th class="text-left">DIA:</th>	
       			<th class="text-left">HORA:</th>
       			<th class="text-left">PACIENTE:</th>
       		</tr>
       		</thead>
         	<tbody class="table-hover">
       		<%List<Consulta> consultas = (List<Consulta>)request.getAttribute("consultas");
       		for(Consulta lista : consultas) {%>
       			<tr>
       			 <td class="text-left"><%=lista.getDia() %></th>
       			 <td class="text-left"><%=lista.getHora() %></th>
       			 <td class="text-left"><%=lista.getPaciente().getNome() %></th>
				<%} %>
      		  </tr>
         </tbody>
         </table>
  </article>
  </section>
    
  </div>
  </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
</html>