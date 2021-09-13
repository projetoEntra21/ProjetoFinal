<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Listar Paciente</title>
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
			<h3>Lista De Pacientes</h3>
			<hr>
			<div>
				<a href="<%=request.getContextPath()%>/novo">Adicionar Paciente</a>
			</div>
			<br>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Sobrenome</th>
						<th>Idade</th>
						<th>Cpf</th>
						<th>Contato</th>
						<th>Endereço</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="paciente" items="${pacientes}">
						<tr>
							<td><c:out value="${paciente.nome}" /></td>
							<td><c:out value="${paciente.sobrenome}" /></td>
							<td><c:out value="${paciente.idade}" /></td>
							<td><c:out value="${paciente.cpf}" /></td>
							<td><c:out value="${paciente.contato}" /></td>
							<td><c:out value="${paciente.endereco}" /></td>
							<td><a href="editar?id=<c:out value='${paciente.id}'/>">Editar</a>
								<a href="deletar?id=<c:out value='${paciente.id}'/>">Deletar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>