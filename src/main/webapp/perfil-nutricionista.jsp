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

<link rel="stylesheet"
	href="<%=request.getContextPath()%>resourcers/css/perfilnutricionista.css" />
<style><%@include file="resources/css/perfilnutricionista.css"%></style>


<title>Nutricionista</title>
</head>
<body>

	<!-- partial:index.partial.html -->
	<div class="sttngs">
		<h2>Seu perfil</h2>
		<div class="tabordion">
			<section id="section1">
				<input class="t" type="radio" name="sections" id="option1" checked>
				<label for="option1" class="trr"> Informa��es Pessoais</label>
				<article>

					<div class="frm">

						<div id='profile-upload'>
							<div class="hvr-profile-img">


								<input type="file" name="logo" id='getval' class="upload"
									id="imag">

								<div class="icon">
									<div class="camera4">
										<span></span>
									</div>

								</div>
							</div>
						</div>

						<div class="tr">

							<label class="label" for="input">Nome </label> <input
								class="input e" type="text" id="input"> <label
								class="label" for="input">CNPJ</label> <input class="input e"
								type="tel" id="input"> <label class="label" for="input">Descri��o</label>
							<textarea id="story" name="story" rows="5" cols="33">
    </textarea>

							<button>Salvar</button>

						</div>
				</article>
			</section>

			<section id="section2">

				<input class="t" type="radio" name="sections" id="option2">
				<label for="option2" class="trr"> Atualiza��o conta </label>

				<article>
					<div class="tr wwq">

						<label class="label" for="input">Nome de usu�rio</label> <input
							class="input" type="text" id="input"> <label
							class="label" for="input">Email</label> <input class="input"
							type="email" id="input"> <label class="label" for="input">Senha</label>
						<input class="input" type="password" id="input"> <label
							class="label" for="input">Confirma��o da senha</label> <input
							class="input" type="password" id="input">

					</div>
					<button>Salvar</button>
				</article>
			</section>

			<section id="section2">

				<input class="t" type="radio" name="sections" id="option2">

				</article>
			</section>
			<section id="section3">
				<input class="t" type="radio" name="sections" id="option3">
				<label for="option3" class="trr">Consultas</label>
				<article>

					<table id="customers">
						<tr>
							<div id="divBusca">
								<input type="text" id="txtBusca" placeholder="Buscar..." />
								<button id="btnBusca">buscar</button>
							</div>
						</tr>
					</table>

					<br>

					<table>
					
					<tr>
						<td>Nome:</td>
						<td>Cpf:</td>
					</tr>
					
					<% List<Paciente> pacientes = (List<Paciente>)request.getAttribute("pacientes");
						for (Paciente lista : pacientes) { %>
						<tr>
							<td><%=lista.getNome() %></td>
							<td><%=lista.getCpf() %></td>
							<%} %>
						</tr>
					</table>
					
					<table>	
					<tr>
						<td>Dia:</td>
						<td>Hora:</td>
						<td>Id da Consulta:</td>
					</tr>
					
					<% List<Consulta> consultas = (List<Consulta>)request.getAttribute("consultas");
						for(Consulta lista : consultas) { %>
						<tr>
							<td><%=lista.getDia() %></td>
							<td><%=lista.getHora() %></td>
							<td><%=lista.getId() %></td>
							<%} %>
						</tr>
					</table>

				</article>
			</section>

			<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</body>
</html>