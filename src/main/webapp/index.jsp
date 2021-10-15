<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">

     <link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/index.css"/>
	<style><%@include file="resources/css/index.css"%></style>

</head>

<!-- partial:index.partial.html -->
<div class="sttngs">
 <div class="tabordion">
  <section id="section1">

 	<img src="https://i.imgur.com/cinExZu.png" class="logo"alt="some text" 
 	 width= 150 height= 150>
 
 
    <h1 class="card-title">NutriTech</h1>
    
    <a class="btn btn-light" href="<%=request.getContextPath()%>/login" role="button">Login</a>
    <a class="btn btn-light" href="<%=request.getContextPath()%>/cadastre-se" role="button">Cadastre-se</a>
   
  <!--icons-->
<div class="container">
  <div class="row row-cols-2 row-cols-lg-4">
    <div class="col-10 col-lg-2">
      <i class="bi bi-geo-alt-fill"></i>
      <p class="pin"> R. Bella Crystal N°26</p></div>
    <div class="col-10 col-lg-2">
      <i class="bi bi-telephone-fill"></i>
      <p class="telefone"> 3376-8101</p></div>
    <div class="col-10 col-lg-2">
      <i class="bi bi-envelope"></i>
      <p class="envelope"> Ntech@gmail.com</p></div>
    <div class="col-10 col-lg-2">
      <i class="bi bi-whatsapp"></i>
      <p class="whatsapp">  (47) 98072-8290</p></div>
    <div class="col-10 col-lg-2"> 
      <i class="bi bi-instagram"></i>
      <p class="instagram">  NutriTech </p></div>
    <div class="col-10 col-lg-2">
      <i class="bi bi-facebook"></i>
      <p class="facebook">  NutriTech </p>
    </div>
  </div>
</div>

<!-- receitas -->

  <img src="https://i.imgur.com/UIG9NPz.png" class="acai"alt="some text" 
     width= 550 height= 300>

  <img src="https://i.imgur.com/PdRPDkJ.png" class="cookie"alt="some text" 
     width= 550 height= 300>

  <img src="https://i.imgur.com/mGZYZTK.png" class="agua"alt="some text" 
     width= 550 height= 300>


<!-- balão -->

  <div  class="balao">     
    <h3>Você acredita que não consegue emagrecer porque não tem foco? <br></h3>
      <p>Nós da NutriTech, temos o objetivo de ajudar pessoas que buscam melhorar a sua saúde através de uma alimentação saudável.
       Afinal o conceito de nutrição se baseia em uma alimentação completa e variada, de forma que atenda às necessidades do organismo.
       Trabalhando também com os guias alimentares que são opções práticas quando pensamos numa alimentação com qualidade,
       uma vez que fornece um conjunto de informações, recomendações e orientações sobre escolhas, preparo e consumo de alimentos.</p>
  </div>
 
<!-- planos -->

  <div class="container1">
    <div class="row">
      <div class="card-group">
        <div class="card">
          <img src="https://i.imgur.com/ZpnMOaj.png" class="card-img-top" alt="...">
          <p class="card-text">Muitos acreditam em uma dieta universal, única para todos ou 
            ainda apostam em dietas milagrosas, sem perceber que o que realmente conta, é a 
            individualidade de cada indivíduo, com suas preferencias, estilo de vida, 
            intolerâncias e necessidades específicas. Então, antes de qualquer leitura, 
            reflita sobre uma coisa: não existe uma dieta estática e universal. Existem estratégias 
            diferentes, para objetivos diferentes, segundo a necessidade 
            e individualidade de cada humano. E é assim que o emagrecimento eficiente acontece.</p>
        </div>
   
        <div class="card">
         <img src="https://i.imgur.com/cTY0ErB.png" class="card-img-top" alt="...">
         <p class="card-text">A reeducação alimentar é um processo de mudanças e hábitos na alimentação. 
           Ela consiste em doutrinar as pessoas à aprenderem a comer bem, de maneira saudável, mas sem 
           necessariamente precisar se privar, de comer alguns alimentos quer goste. É através de pequenas 
           mudanças que a reeducação vai se construindo e, aos poucos tornando a alimentação do indivíduo 
           mais saudável e equilibrada. A reeducação alimentar é feita de forma personalizada e, para isso, 
           devem ser consultados especialistas antes de qualquer decisão. Cada pessoa apresenta suas especialidades e, 
           por isso, o processo é feito com base nos nutrientes que cada pessoa precisa.</p>
        </div>
   
        <div class="card">
         <img src="https://i.imgur.com/iducNSY.png" class="card-img-top" alt="...">
          <p class="card-text">Se você é um fisiculturista, um atleta profissional ou simplesmente exerce esportes, 
            musculação, corrida, ciclismo, etc. para melhorar sua saúde, a nutrição esportiva desempenha um papel 
            fundamental na otimização dos efeitos benéficos da atividade física. Tomar melhores decisões com sua 
            nutrição e hidratação pode resultar em melhor desempenho, recuperação e prevenção de lesões. Profissionais 
            de nutrição oferecem uma gama de serviços para apoiar a sua saúde e metas esportivas. Isso pode variar de um 
            cardápio alimentar diário, a um plano abrangente de alimentação e nutrição e competições que se realizam a curto e médio prazo.</p>
        </div>
      </div>
    </div>
  </div>

  </article>
  </section>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
<script  src="./script.js"></script>

</body>
</html>