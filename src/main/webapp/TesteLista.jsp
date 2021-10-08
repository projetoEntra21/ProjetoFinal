<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div class="container">
            <h3>Lista de Pacientes</h3>
            <hr>
            <br>
            <table>
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Cpf</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="pacientes" items="${paciente}">
                        <tr>
                            <td><c:out value="${paciente.nome}" /></td>
                            <td><c:out value="${paciente.cpf}" /></td>
                            <td><a href="editar-professor?id=<c:out value='${professor.id}'/>">Editar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>


</body>
</html>