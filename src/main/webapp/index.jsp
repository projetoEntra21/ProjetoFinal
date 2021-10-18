<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/index.css"/>
	<style><%@include file="resources/css/index.css"%></style>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">

</head>
</body>
<div id="Header">

	<div class="container">
		<nav
			class="navbar navbar-expand-lg navbar-light justify-content-between">
			<a class="navbar-brand" href="#"> <img src="" class="img-fluid " />
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">NutriTech</a></li>
				</ul>
			</div>
			<div>
				<div class="align-self-right">
					<a href="<%=request.getContextPath()%>/login"
						class="btn button-primay-outline btn-outline-primary button">login</a>
					<a href="<%=request.getContextPath()%>/cadastre-se"
						class="btn button-primay-outline btn-outline-primary button">Crie
						sua conta</a>
				</div>
			</div>
	</div>
	</nav>
</div>
</div>
<div>
      <img class="d-block w-100" src="https://i.imgur.com/kWDjF8I.jpg" alt="First slide">
  
</div>

<div id="slider">
<div class="container">
  <div class="row">
    <div class ="col-md-6 align-self-center" >
<h1>O que voce esta precisando?</h1> 
<h4>Conheca nossos planos e agende sua consulta!</h4>
<a href="#" class="btn button-primay btn-primary button">Saiba mais</a>
<a href="#" class="btn button-primay-outline btn-outline-primary button">Cadastre-se</a>
    </div>
    
    </div>
  </div>
</div>
<div class ="col-lg-6">
  <img src="https://i.imgur.com/0fIT0mX.png" class="img-fluid" />
 </div>
 
 <div class="footer">
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

</ul>
</div>

</html>