<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastre-se</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/style.css">

	<link rel="stylesheet" href="<%=request.getContextPath()%>resourcers/css/cadastresse.css"/>
	<style><%@include file="resources/css/cadastresse.css"%></style>
	
</head>

<!-- partial:index.partial.html -->
<div class="sttngs">
 <div class="tabordion">
  <section id="section1">

    <img src="https://i.imgur.com/HPxV3Hd.png" class="logo"alt="some text" 
        width= 150 height= 150>
    <h1 class="card-text">NutriTech</h1>

    <p class="font-weight-bold">Escolha uma op��o.</p>

    <div class="row">
      <div class="col-sm-6">
        <div class="card">
          <img class="card-img-top" src="https://i.imgur.com/MPCxVfL.png" height= 300 width = 200 >
          <div class="card-body">
            <h3 class="card-title">Paciente</h3>
            <a href="<%=request.getContextPath()%>/cadastro-paciente" class="btn btn-outline-success">Cadastre-se</a>
          </div>
        </div>
      </div>

      <div class="col-sm-6">
        <div class="card">
          <img class="card-img-top" src="https://i.imgur.com/T4KzECx.png" height = 300 width = 200>
          <div class="card-body">
            <h3 class="card-title">Nutricionista</h3>
             <a href="<%=request.getContextPath()%>/cadastro-nutricionista" class="btn btn-outline-success">Cadastre-se</a>
          </div>
        </div>
      </div>
    </div>
  
  </article>
  </section>

 


  
     
      

     
   
   


  
  

<!-- partial -->
      
    </article>
    </section>
    </div>
    </div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- partial -->
<script  src="./script.js"></script>

</body>
</html>