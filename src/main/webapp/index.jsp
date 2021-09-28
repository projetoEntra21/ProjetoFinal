<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>  
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Handlee|Josefin+Sans:300,600&amp;display=swap'><link rel="stylesheet" href="./style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
   
   <link rel="stylesheet" href="<%=request.getContextPath()%>resources/css/newhome.css"/>
	<style><%@include file="resources/css/newhome.css"%></style>
	<script><%@include file="resources/js/newhome.js"%></script>	
		
</head>
<body>

<!-- partial:index.partial.html -->
<div class="sttngs">
<div class="tabordion">
  <section id="section1">
    <input class="t" type="radio" name="sections" id="option1" checked>
    <label for="option1" class="trr"> Home</label>
    <article>
  
      <img src="logo.jpg" alt="some text" 
      width=300 height=300>

      <div class= "card-title1"> 
        <p1> Health Society </p1>
      </div>
      <div class = "card-title2"><p3> Para uma vida mais saud�vel </p3></div>
        <div class="card-text1">
         

          <div class="background">
            <div class="whole-menu">
              
              <div class="items filled-items">
                <h3>Voc� acredita que n�o consegue emagrecer porque n�o tem foco?</h3>
                <h4> N�s da Health Society, temos o objetivo de ajudar pessoas que buscam melhorar a sua sa�de atrav�s de uma alimenta��o saud�vel.
                  Afinal o conceito de nutri��o se baseia em uma alimenta��o completa e variada, de forma que atenda �s necessidades do organismo. 
                  Trabalhando tamb�m com os guias alimentares que s�o op��es pr�ticas quando pensamos numa alimenta��o com qualidade, 
                  uma vez que fornece um conjunto de informa��es, recomenda��es e orienta��es sobre escolhas, preparo e consumo de alimentos.</h4>
              </div>
          

  
 
  </article>
  </section>

  <section id="section2">

    <input class="t" type="radio" name="sections" id="option2"> 
    <label for="option2" class="trr"> Planos  </label>

    
   
 

<article>

  <div id="planos">
    <div class="planos">
      <div class="card1-group">
        <div class="card1">
          <img src="card2.jpg" class="card1-img-top" alt="..." width=675 height=450>
          <div class="card1-body" >
            <h5 class="card-title3">Emagrecimento Eficiente</h5>
            <p class="card-text2">
              Muitos acreditam em uma dieta universal, �nica para todos ou ainda apostam em dietas milagrosas, 
              sem perceber que o que realmente conta, � a individualidade de cada indiv�duo, 
              com suas prefer�ncias, estilo de vida, intoler�ncias e necessidades espec�ficas. Ent�o, 
              antes de qualquer leitura, reflita sobre uma coisa: n�o existe uma dieta est�tica e universal. 
              Existem estrat�gias diferentes, para objetivos diferentes, segundo a 
              necessidade e individualidade de cada ser humano. E � assim, que o emagrecimento eficiente acontece.
              </p>
            <a href="#Contato" class="btn btn-primary1" >Entre em contato</a>
          </div>
        </div>
        <div class="card2" id="teste">
          <img src="card1.jpg" class="card2-img-top" alt="..." width=675 height= 450>
          <div class="card1-body">
            <h5 class="card-title4">Reeduca��o Alimentar</h5>
            <p class="card-text3">
              A reeduca��o alimentar � um processo de mudan�a de h�bitos na alimenta��o. Ela consiste em doutrinar a pessoa
              a aprender a comer bem, de maneira saud�vel, mas sem necessariamente precisar se privar de comer alguns alimentos 
              que goste. � atrav�s de pequenas mudan�as que a reeduca��o vai se constituindo e, aos poucos, tornando a alimenta��o 
              do indiv�duo mais saud�vel e equilibrada. A reeduca��o alimentar � feita de forma personalizada e, para isso, 
              devem ser consultados especialistas antes de qualquer decis�o. Cada pessoa apresenta suas especificidades e, 
              por isso, o processo � feito com base nos nutrientes que cada pessoa precisa.</p>
            <a href="#" class="btn btn-primary2">Entre em contato</a>
          </div>
        </div>
        <div class="card3">
          <img src="card3.jpeg" class="card3-img-top" alt="..." width=675 height=450>
          <div class="card-body">
            <h5 class="card-title5"> Dietas esportiva </h5>
            <p class="card-text4">Se voc� � um fisiculturista, um atleta profissional ou simplesmente exercendo esportes, muscula��o, corrida, 
              ciclismo etc para melhorar sua sa�de, a nutri��o esportiva desempenha um papel fundamental na 
              otimiza��o dos efeitos ben�ficos da atividade f�sica. Tomar melhores decis�es com sua nutri��o e hidrata��o pode 
              resultar em melhor desempenho, recupera��o e preven��o de les�es. Profissionais de nutri��o oferecem 
              uma gama de servi�os para apoiar a sua sa�de e metas esportivas. Isso pode variar de um card�pio alimentar 
              di�rio, a um plano abrangente de alimenta��o e nutri��o para treinamento e competi��es que se realiza��o a curto e m�dio prazo.</p>
            <a href="#" class="btn btn-primary3">Entre em contato</a>
          </div>
        </div>
      </div>  
          </div>
        </div>
      </section>

      </article>
  

  <section id="section3">

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
              <div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">CL�NICA</a><a class="btn btn-lg btn-login js-btn" data-target="login">PACIENTE</a></div>
            </div>
          </div>
          <div class="card border-0 shadow card--register" id="register">
            <div class="card-body">
              <br>
              <h2 class="card-title">CL�NICA</h2>
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
                      
            <a href="<%=request.getContextPath()%>/mostrarCadastroNutricionista" target="_self">Cadastre-se</a>
      
              </p>
              <br>
                <button class="btn-btn-lg">Entrar</button>
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
                       
  	  <a href="<%=request.getContextPath()%>/mostrarCadastroPaciente" target="_self">Cadastre-se</a> 
         
              </p>
              <br>
              <a href='../homepaci/dist/index.html' ><button class="btn-btn-lg"  >Entrar </button> </a>
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