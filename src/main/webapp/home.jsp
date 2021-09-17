<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Handlee|Josefin+Sans:300,600&amp;display=swap'><link rel="stylesheet" href="./style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel="stylesheet" href="./style.css">
    <link rel="stylesheet" href="style.css">
    <title>Home</title>
</head>
<body>

<!-- partial:index.partial.html -->
<div class="sttngs">
<div class="tabordion">
  <section id="section1">
    <input class="t" type="radio" name="sections" id="option1" checked>
    <label for="option1" class="trr"> Home</label>
    <article>
  

  
 
  </article>
  </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> Planos  </label>

    <article>
   
    </article>
    </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2">
    
  </article>
  </section>
  <section id="section3">
    <input class="t" type="radio" name="sections" id="option3">
    <label for="option3" class="trr">Contato</label>
    <article> 
 
      
  </article>
  </section>
    
  <section id="section4">
    <input class="t" type="radio" name="sections" id="option4">
    <label for="option4" class="trr">Login</label>
    <article>

      <div class="container">
        <div class="card-wrap">
          <div class="card border-0 shadow card--welcome is-show" id="welcome">
            <div class="card-body">
              <h2 class="card-title">Bem-vindo(a)</h2>
              <p>Escolha a melhor op��o que se encaixa � voc�</p>
              <br>
              <div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">CLINICA</a><a class="btn btn-lg btn-login js-btn" data-target="login">PACIENTE</a></div>
            </div>
          </div>
          <div class="card border-0 shadow card--register" id="register">
            <div class="card-body">
              <br>
              <h2 class="card-title">CLINICA</h2>
              <br>
              <p class="card-text">Para se manter conectado conosco<br/>por favor, fa�a login</p>
              <br>
              <form>
               
                <div class="form-group">
                  <input class="form-control" type="CNPJ" placeholder="CNPJ" pattern="[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2}" title="Informe um CNPJ nesse formato  XX. XXX. XXX/XXXX-XX." required="required"/>
                </div>
                <div class="form-group">
                  <input class="form-control" type="password" placeholder="Senha" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter pelo menos um n�mero e uma letra mai�scula e min�scula e pelo menos 8 ou mais caracteres" required="required"/>
                </div>
                <p> N�o tem nenhuma conta?
                      
                  <a href='../cadastronutri/cadastronutricionista.html'>Cadastre-se </a> 
      
              </p>
              <br>
                <button class="btn btn-lg">Entrar</button>
              </form>
            </div>
            <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
          </div>
          <div class="card border-0 shadow card--login" id="login">
            <div class="card-body">
              <h2 class="card-title">PACIENTE</h2>
              <br>
              <p>Para se manter conectado conosco<br/>por favor, fa�a login</p>
             <br>
              <form>
                <div class="form-group">
                  <input class="form-control" type="Email" placeholder="Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="O email teve conter um @" required="required"/>
                </div>
                <div class="form-group">
                  <input class="form-control" type="password" placeholder="Senha" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Deve conter pelo menos um n�mero e uma letra mai�scula e min�scula e pelo menos 8 ou mais caracteres"required="required"/>
                </div>
                <p> N�o tem nenhuma conta?
                      
                  <a href='../cadastro2/cadastrocliente.html'>Cadastre-se </a> 
      
              </p>
              <br>
              <a href='../homepaci/dist/index.html' ><button class="btn btn-lg"  >Entrar </button> </a>
              </form>
            </div>
            <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
          </div>
        </div>
      </div>

  </article>
  </section>
  </div>
  </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
  <script  src="./script.js"></script>

</body>
</html>