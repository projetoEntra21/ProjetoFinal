<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastro Nutricionista</title>

 

<link
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
    rel="stylesheet" />
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
    crossorigin="anonymous">
<style type="text/css"> @import url("../css/cadastronutricionista.css"); </style>
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
       

        <fieldset>
            <h2 class="fs-title">CRIE SUA CONTA</h2>
            <h3 class="fs-subtitle"></h3>

 

            <div>
                <div>
                    <div>
                        <c:if test="${nutricionista == null}">
                            <form action="inserirNutricionista" method="post">
                        </c:if>
                        <c:if test="${nutricionista != null}">
                            <input type="hidden" name="id"
                                value="<c:out value='${consulta.id}'/>" />
                        </c:if>

                        <label>Nome:</label> <input type="text" name="nome" id="nome"
                            placeholder="Insira seu nome "
                            pattern="^[a-zA-Z][a-zA-Z-_\.]{3,20}$"
                            title="Indique seu nome sem números" required
                            value="<c:out value='${nutricionista.nome}'/>"name="nome_nutricionista" />
                            
                        <label>Sobrenome:</label><input type="text" name="sobrenome" id="sobrenome"
                         placeholder="Insira seu sobrenome"required
                         value="<c:out value='${nutricionista.sobrenome}'/>"name="sobrenome_nutricionista" />
                                
                        <label>Cnpj</label><input
                            type="text" id="cnpj" placeholder="Cnpj"
                            title="Siga o formato  XX. XXX. XXX/XXXX-XX." required
                            value="<c:out value='${nutricionista.cnpj}'/>" name="cnpj_nutricionista" />
                            
                         <label>Senha:</label><input type="password" placeholder="Senha" id="password" required
                            pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
                            title="Deve conter pelo menos um número e uma letra maiúscula e minúscula e pelo menos 8 ou mais caracteres"
                            required> 
                            <label>Confirmar Senha:</label><input type="password" placeholder="Confirme Senha"
                            id="confirm_password" required
                            value="<c:out value='${nutricionista.senha}'/>"name="senha_nutricionista" />
 					<button type="button" id="botao" class="button" data-toggle="modal" data-target="#exampleModal">
         Cadastrar
            </button>
        
            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Confirmação de cadastro
                </h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
               Seu cadastro está prestes a ser concluido. Suas informações estão certas?
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                <button type="submit" class="btn btn-primary">Salvar informações </button >
              </div>
              </div>
            </div>
            </div>
             </div>
            </div>
            </div>
          </fieldset>
  </form>
            <script
                src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
            <script
                src='https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js'></script>
            <script src="./script.js"></script>
</body>
</html>