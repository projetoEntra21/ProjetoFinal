<!DOCTYPE html>
<%@page import="modelo.entidade.consulta.Consulta"%>
<%@page import="java.util.List"%>
<html lang="pt-br" >
<head>
  <meta charset="UTF-8">
  <title>perfil</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />

<link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/perfilpaciente.css"/>
	<style><%@include file="resources/css/perfilpaciente.css"%></style>
<script><%@include file="resources/js/perfilpaciente.js"%></script>


</head>
<body>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
            crossorigin="anonymous"></script>
            
            
            
<script src="resources/js/perfilpaciente.js"><%@include file="resources/css/perfilpaciente.css"%></script>
<!-- partial:index.partial.html -->
<div class="sttngs">
<div class = "header">
					${sessionScope.usuario.nome}
					<button>
						<a href ="logout.jsp">sair</a>
					</button>
				</div>

    <h2>Seu perfil</h2>
<div class="tabordion">
  <section id="section1">
    <input class="t" type="radio" name="sections" id="option1" checked>
    <label for="option1" class="trr"> Atualização conta</label>
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
<form action="">
  <form id="msform">

    
	<label class="label" for="input">Nome de usuário </label>
	<input class="input" type="text" id="nome" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem números e sem espaços"> 

  <label class="label" for="input">Email</label>
	<input class="input" type="email" id="email" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email teve conter um @" required>
	
  <label class="label" for="input">Senha</label>
<input class="input"  onsubmit="validatemyPassword()" type="password" id="myPassword" name="password"  title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres" required>

  <label class="label" for="input">Confirmação da senha</label>
	<input class="input" type="password" id="confirm_password" required>
	
  
			<!-- Button trigger modal -->
<button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
 Salvar
    </button>
    
    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Confirmação de atualização da conta</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       Sua atualização está prestes a ser concluid. Suas informações estão certas?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
        <button type="submit" class="btn btn-primary">Salvar informações </button >
      </div>
      </div>
    </div>
    </div>
  
      
      </div>
    </form>
    </form>
    </article>
  </section>
 
  <section id="section2">
    
    <input class="t" type="radio" name="sections" id="option2">
    
    <label for="option2" class="trr"> Informações Pessoais</label>
    <article>
     <form action="">
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

 
 	 <button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal3">
    Salvar
       </button>
   
       <!-- Modal -->
       <div class="modal fade" id="exampleModal3" tabindex="-1" role="dialog" aria-labelledby="exampleModal3Label" aria-hidden="true">
       <div class="modal-dialog" role="document">
         <div class="modal-content">
         <div class="modal-header">
           <h5 class="modal-title" id="exampleModal3Label">Confirmação de cadastro
           </h5>
           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
           <span aria-hidden="true">&times;</span>
           </button>
         </div>
         <div class="modal-body">
         Antes de ir para o próximo, verifique se suas informações foram completadas e estão corretas!!
          
         </div>
         <div class="modal-footer">
           <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
           <button type="submit" class="btn btn-primary">Salvar informações </button >
         </div>
         </div>
       </div>
       </div>

   
       
       </div>
     </form>
     </form>
     </article>
   </section>

  
  <section id="section5">
 
    <input class="t" type="radio" name="sections" id="option5">
    <label for="option5" class="trr">Minhas Consultas</label>  
 

    <article>
      <form action="">
         <div class="tr wwq">
 <table id="customers">
   <tr>
     
     </tr> <br>
 
     <div class="table-title">
       <h3></h3>
       </div>
       <table>
       		<tr>
       			<th>Dia:</th>	
       			<th>Hora</th>
       		</tr>
       		<%List<Consulta> consultas = (List<Consulta>)request.getAttribute("consultas");
       		for(Consulta lista : consultas) {%>
       			<tr>
       			<th><%=lista.getDia() %></th>
       			<th><%=lista.getHora() %></th>
				<%} %>
       		</tr>
      	</table>

       			<!-- Button trigger modal -->
<a href="<%=request.getContextPath()%>/agendamento"><button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
agendar minha consulta
     </button></a>
    
    </article>
  </section>
</div>
  
  
  </div>
    

<!-- partial -->

</body>
</html>
