<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Cadastro usuario</title>
  <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet" href="./cadastroUsuario.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-11 col-sm-10 col-md-10 col-lg-6 col-xl-5 text-center p-0 mt-3 mb-2">
            <div class="card px-0 pt-4 pb-0 mt-3 mb-3">
                <h2 id="heading">Fa�a seu Cadastro</h2>
            
                <form id="msform">
                    <!-- progressbar -->
                    <ul id="progressbar">
                        <li class="active" id="account"><strong>Conta</strong></li>
                        <li id="personal"><strong>Contato</strong></li>
                        <li id="payment"><strong>Pessoal</strong></li>
                        <li id="confirm"><strong>Finalizar</strong></li>
                    </ul>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar" aria-valuemin="0" aria-valuemax="100"></div>
                    </div> <br> <!-- fieldsets -->
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                <div class="col-7">
                                    <h2 class="fs-title">Informa��es da conta:</h2>
                                </div>
                                
                            </div> <label class="fieldlabels">Nome de usuario</label> 	<input class="input" type="text" id="user" name="usuario" placeholder="Insira um nome de usu�rio" required pattern="^[a-zA-Z]{3,25}$" title="Indique seu nome completo sem n�meros e sem espa�os"> 
                             <label class="fieldlabels">Senha</label> <input class="input"  onsubmit="validatemyPassword()" type="password" placeholder="Insira uma senha" id="myPassword" name="password"  title="Deve conter pelo menos um n�mero e uma letra mai�scula e min�scula e pelo menos 8 ou mais caracteres" required>
 
                             <label class="fieldlabels">Confirme sua senha</label> 	<input class="input" type="password" id="confirm_password" placeholder="Confirme sua senha" required oninput="ValidarProximo ()">

                        </div> 
                        
                        <button type="submit" name="submit" class="next action-button" id="proximo" value="Pr�ximo"> Pr�ximo</button> 
                       
                    </fieldset>
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                <div class="col-7">
                                    <h2 class="fs-title">Informa��es de contato</h2>
                                </div>
                                
                            </div> <label class="fieldlabels">Email</label> <input class="input" type="email" id="input" name="email" placeholder="Insira um email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email teve conter um @" required> 
                            <label class="fieldlabels">Telefone Residencial</label>	<input class="input e" id="phone" placeholder="Insira um telefone residencial" name="phone" onkeypress="mask(this, mphone);" onblur="mask(this, mphone);" maxlength="14"/>

                            <label class="fieldlabels">Telefone celular</label> 	<input class="input e" id="phone" placeholder="Insira um telefone celular" name="phone" onkeypress="mask(this, mphone);" onblur="mask(this, mphone);" maxlength="15" required/>
                
                        </div> <input type="button" name="next" class="next action-button" value="Pr�ximo" /> <input type="button" name="Voltar" class="previous action-button-previous" value="Voltar" />
                    </fieldset>
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                <div class="col-7">
                                    <h2 class="fs-title">Informa��es Pessoais</h2>
                             
                                </div><label class="fieldlabels">Primeiro Nome</label>  <input type="text" name="nome" id="nome"placeholder="Entre com seu nome" pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$" title="Indique seu nome sem n�meros" required>
                                
                                <label class="fieldlabels">Sobrenome</label>     <input type="text" name="sobrenome" id="sobrenome" placeholder="Insira seu sobrenome" pattern="^([AZ] {1} [az] {1,30} [-] {0,1} | [AZ] {1} [- \ '] { 1} [AZ] {0,1} [az] {1,30} [-] {0,1} | [az] {1,2} [- \ '] {1} [AZ] {1} [ az] {1,30}) {2,5} {3,20}$  "title="Indique seu sobrenome completo sem n�meros" required>

                                <label class="fieldlabels">Idade</label>  <input type="number" name="idade" id="idade" placeholder="Insira sua idade" pattern="[0-9]+$ " title="Entre com uma idade sem letras" maxlength="2">
                                 
                               <label class="fieldlabels">CPF</label> <input type="text" value="" id="cpf" placeholder="Insira seu CPF"  maxlength="14" required >
                               
                               <label class="label" for="input"> Cep</label>
                                <input class= "input e" name="cep" type="text" id="cep" placeholder="Insira seu CEP" class="mascCEP" value="" size="10" maxlength="9" onblur="pesquisacep(this.value);" required /></label>
                            
                                <label class="label" for="input"> Rua</label>
                                <input class="input e" name="rua" type="text" id="rua" placeholder="Insira sua rua" size="60" required /></label>
                            
                                <label class="label" for="input"> Numero</label>
                                <input class="input e" name="numero" type="number" id="numero" placeholder="Insira seu n�mero" required>
                            
                                <label class="label" for="input"> Bairro</label>
                                <input class= "input e" name="bairro" type="text" id="bairro" placeholder="Insira seu bairro" size="40" required /></label>
                            
                                <label class="label" for="input"> Cidade</label>
                                <input class="input e" name="cidade" type="text" id="cidade" size="40" placeholder="Insira sua cidade" required/></label>
                            
                                <label class="label" for="input"> Estado</label>
                                <input class="input e" name="uf" type="text" id="uf" size="2" required placeholder="Insira seu Estado" /></label><br />
                            

                            </div> <label class="fieldlabels">Escolha sua foto de perfil:</label> <input type="file" name="pic" accept="image/*"> 
                        </div>
                        
                     
        <button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
            Cadastrar
               </button>
               
               <button type="button" name="Voltar" class="previous action-button-previous" value="Voltar"> Voltar</button> 
               <!-- Modal -->
               <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
               <div class="modal-dialog" role="document">
                 <div class="modal-content">
                 <div class="modal-header">
                   <h5 class="modal-title" id="exampleModalLabel">Confirma��o de cadastro
                   </h5>
                   <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                   <span aria-hidden="true">&times;</span>
                   </button>
                 </div>
                 <div class="modal-body">
                  Antes de prosseguir, veja se todas as suas informa��es foram completadas e preenchidas.
                  
                 </div>
                 <div class="modal-footer">
                   <button type="button"name="Voltar" class="previous action-button-previous" value="Voltar" data-dismiss="modal">Voltar</button>
                   <button type="submit"name="next" class="next action-button" value="Pr�ximo" >Pr�ximo </button >
                 </div>
                 </div>
               </div>
               </div>
            
                    
                    
                    </fieldset>
                    <fieldset>
                        <div class="form-card">
                            <div class="row">
                                
            
                            </div> <br><br>
                            <h2 class="purple-text text-center"><strong>Enviado com sucesso!</strong></h2> <br>
                            <div class="row justify-content-center">
                                <div class="col-3"> <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Green_check.svg/2048px-Green_check.svg.png" class="fit-image"> </div>
                            </div> <br><br>
                            <div class="row justify-content-center">
                            
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

  <script  src="./cadastroUsuario.js"></script>

</body>
</html>