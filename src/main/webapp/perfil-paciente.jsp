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

   <label class="label" for="input">Nome de usuario </label>
    <input class="input" type="text" id="input" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem números e sem espaços"> 
  
    <label class="label" for="input">Email</label>
    <input class="input" type="email" id="input" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email teve conter um @" required>
    
    <label class="label" for="input">Senha</label>
  <input class="input"  onsubmit="validatemyPassword()" type="password" id="myPassword" name="password"  title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres" required>
  <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABDUlEQVQ4jd2SvW3DMBBGbwQVKlyo4BGC4FKFS4+TATKCNxAggkeoSpHSRQbwAB7AA7hQoUKFLH6E2qQQHfgHdpo0yQHX8T3exyPR/ytlQ8kOhgV7FvSx9+xglA3lM3DBgh0LPn/onbJhcQ0bv2SHlgVgQa/suFHVkCg7bm5gzB2OyvjlDFdDcoa19etZMN8Qp7oUDPEM2KFV1ZAQO2zPMBERO7Ra4JQNpRa4K4FDS0R0IdneCbQLb4/zh/c7QdH4NL40tPXrovFpjHQr6PJ6yr5hQV80PiUiIm1OKxZ0LICS8TWvpyyOf2DBQQtcXk8Zi3+JcKfNafVsjZ0WfGgJlZZQxZjdwzX+ykf6u/UF0Fwo5Apfcq8AAAAASUVORK5CYII=" onclick="mouseoverPass();" onmouseout="mouseoutPass();"  id="olho" class="olho" required/>

    <label class="label" for="input">Confirmacao da senha</label>
    <input class="input" type="password" id="confirm_password" required>
     
      
  </div>
  </article>
  </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> Endereco  </label>

    <article>
    <div class="tr wwq">
        
    <label class="label" for="input">Telefone Residencial</label>	
    <input class="input e" id="phone" name="phone" onkeypress="mask(this, mphone);" onblur="mask(this, mphone);" maxlength="14" required/>
  
    <label class="label" for="input">Telefone Celular</label>	
    <input class="input e" id="phone" name="phone" onkeypress="mask(this, mphone);" onblur="mask(this, mphone);" maxlength="15" required/>
  
    <label class="label" for="input"> Cep</label>
      <input class= "input e" name="cep" type="text" id="cep" class="mascCEP" value="" size="10" maxlength="9" onblur="pesquisacep(this.value);" required /></label>
  
      <label class="label" for="input"> Rua</label>
      <input class="input e" name="rua" type="text" id="rua" size="60" required /></label>
  
      <label class="label" for="input"> Numero</label>
      <input class="input e" name="numero" type="number" id="numero" required>
  
      <label class="label" for="input"> Bairro</label>
      <input class= "input e" name="bairro" type="text" id="bairro" size="40" required /></label>
  
      <label class="label" for="input"> Cidade</label>
      <input class="input e" name="cidade" type="text" id="cidade" size="40" required/></label>
  
      <label class="label" for="input"> Estado</label>
      <input class="input e" name="uf" type="text" id="uf" size="2" required /></label><br />
    

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
       			<th class="text-left">Dia:</th>	
       			<th class="text-left">Hora</th>
       		</tr>
       		</thead>
         	<tbody class="table-hover">
       		<%List<Consulta> consultas = (List<Consulta>)request.getAttribute("consultas");
       		for(Consulta lista : consultas) {%>
       			<tr>
       			 <td class="text-left"><%=lista.getDia() %></th>
       			 <td class="text-left"><%=lista.getHora() %></th>
				<%} %>
      		  </tr>
         </tbody>
         </table>
         
   <a href="<%=request.getContextPath()%>/agendamento"><button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
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