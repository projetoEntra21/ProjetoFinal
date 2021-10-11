<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br" >
<head>
  <meta charset="UTF-8">
  <title>perfil</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">


	<link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/perfilpaciente.css"/>
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
<script src="script.js"></script>
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
    <label for="option1" class="trr"> Atualiza��o conta</label>
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

    
	<label class="label" for="input">Nome de usu�rio </label>
	<input class="input" type="text" id="input" name="usuario" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem n�meros e sem espa�os"> 

  <label class="label" for="input">Email</label>
	<input class="input" type="email" id="input" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email teve conter um @" required>
	
  <label class="label" for="input">Senha</label>
<input class="input"  onsubmit="validatemyPassword()" type="password" id="myPassword" name="password"  title="Deve conter pelo menos um n�mero e uma letra mai�scula e min�scula e pelo menos 8 ou mais caracteres" required>

  <label class="label" for="input">Confirma��o da senha</label>
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
        <h5 class="modal-title" id="exampleModalLabel">Confirma��o de atualiza��o da conta</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       Sua atualiza��o est� prestes a ser concluid. Suas informa��es est�o certas?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
        <button type="submit" class="btn btn-primary">Salvar informa��es </button >
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
    
    <label for="option2" class="trr"> Informa��es Pessoais</label>
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

 
 		<!-- Button trigger modal -->
<button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
  Salvar
     </button>
     
     <!-- Modal -->
     <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
     <div class="modal-dialog" role="document">
       <div class="modal-content">
       <div class="modal-header">
         <h5 class="modal-title" id="exampleModalLabel">Confirma��o de atualiza��o da conta</h5>
         <button type="button" class="close" data-dismiss="modal" aria-label="Close">
         <span aria-hidden="true">&times;</span>
         </button>
       </div>
       <div class="modal-body">
        Sua atualiza��o est� prestes a ser concluida. Suas informa��es est�o certas?
       </div>
       <div class="modal-footer">
         <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
         <button type="submit" class="btn btn-primary">Salvar informa��es </button >
       </div>
       </div>
     </div>
     </div>
   
       
       </div>
     </form>
     </form>
     </article>
   </section>

  <section id="section3">
    <input class="t" type="radio" name="sections" id="option3">
    <label for="option3" class="trr">Meus planos</label>
    <article>
   
      <div class="tr wwq">
  	<label class="label" for="input"></label>	
	<input class="input e" type="password" id="input">

  <label class="label" for="input"></label>	
	<input class="input e" type="password" id="input">
        
  <label class="label" for="input"></label>	
	<input class="input e" type="password" id="input">


      </div> 
      
    </article>
  </section>
  <section id="section4">
    <input class="t" type="radio" name="sections" id="option4">
    <label for="option4" class="trr">Minhas dietas</label>
    <article>

     
    </article>
  </section>

  <section id="section5">
 
    <input class="t" type="radio" name="sections" id="option5">
    <label for="option5" class="trr">Minhas Consultas</label>
    <article>

<a href="<%=request.getContextPath()%>/mostrarAgendamento"><button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
agendar minha consulta
     </button></a>
    
    </article>
  </section>
</div>
  
  
  </div>
    

<!-- partial -->

</body>
</html>
