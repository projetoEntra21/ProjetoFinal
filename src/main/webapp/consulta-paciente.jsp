<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Agendar sua Consulta</title>
</head>
<body>
	<header>
		<nav>
			<ul>
				<li><a href="<%=request.getContextPath()%>/"listar">Consultas</a>
				</li>
			</ul>
		</nav>
	</header>
	<br>
	<div>
		<div>
			<div>

				<c:if test=${consulta == null}">
					<form action="inserir" method="post">
				</c:if>
				<capiton>
				<h2>
					<c:if test="${consulta != null }">Atualizar Consulta</c:if>
					<c:if test=${consulta == null}">Inserir COnsulta</c:if>
				</h2>
				</capiton>
				<c:if test="${consulta != null }">
					<input type="hidden" name="id"
						value="<c:out value='${consulta.id }'/>" />
				</c:if>
				<label>Hora:</label> <input type="time"
					value="<c:out value='${consulta.hora}'/>" name="hora"> <label>Data:</label>
				<input type="date" value="<c:out value='${consulta.data}'/>"
					name="data">
				<button type="submit">Salvar</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>