<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Cadastro de Paciente</title>
</head>
<body>
<header>
		<nav>
			<ul>
				<li><a href="<%=request.getContextPath()%>/listar">Pacientes</a>
				</li>
			</ul>
		</nav>
	</header>
	<br>
	<div>
		<div>
			<div>
				<c:if test="${paciente != null}">
					<form action="atualizar" method="post">
				</c:if>
				<c:if test="${paciente == null}">
					<form action="inserir" method="post">
				</c:if>
				<caption>
					<h2>
						<c:if test="${paciente != null}">Editar Paciente</c:if>
						<c:if test="${paciente == null}">Inserir Paciente</c:if>
					</h2>
				</caption>
				<c:if test="${paciente != null}">
					<input type="hidden" name="id"
						value="<c:out value='${paciente.id}' />" />
				</c:if>
					<label>Nome:</label> <input type="text"
						value="<c:out value='${paciente.nome}' />" name="nome">
					<label>Sobrenome:</label> <input type="text"
						value="<c:out value='${paciente.sobrenome}'/>" name="sobrenome">
				    <label>Idade:</label> <input type="number"
						value="<c:out value='${paciente.idade}'/>" name="idade">
				    <label>Cpf:</label> <input type="text"
						value="<c:out value='${paciente.cpf}'/>" name="cpf">
				    <label>Contato:</label> <input type="text"
						value="<c:out value='${paciente.contato}'/>" name="contato">
				    <label>Endereco:</label> <input type="text"
						value="<c:out value='${paciente.endereco}'/>" name="endereço">
				<button type="submit">Salvar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>