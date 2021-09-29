<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de Consulta</title>

</head>
<body>
	<form method="post" action="inserirConsulta">


	<label>Nome:</label>
	<input type="text" required="required"
		value="<c:out value='${paciente.nome}'/>" name="nome" />

	<label>Sobrenome:</label>
	<input type="text" required="required"
		value="<c:out value='${paciente.sobrenome}'/>" name="sobrenome" />


	<label>Data:</label>
	<input type="date" required="required"
		value="<c:out value='${consulta.data}'/>" name="data" />

		
	<label>Horas:</label>
	<input type="time" required="required"
		value="<c:out value='${consulta.hora}'/>" name="hora" />
		
	<label>Nutricionistas:</label>
	<input type="text" required="required"
		value="<c:out value='${consulta.hora}'/>" name="hora" />
		
	<p><a href="<%=request.getContextPath()%>/listarPacientes">Nutricionistas</a></p>
	     <c:forEach var="sala" items="${nutricionistas}">
	     <p><a href="listarNutricionistas?idSala=<c:out value='${nutricionista.id}'/>"><c:out value="${nutricionista.nome}"/></a></p>	        	        	
		</c:forEach>	       
</form>
</body>
</html>