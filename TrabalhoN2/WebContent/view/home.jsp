<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<jsp:include page="libs.jsp" />

</head>
<body>

	<jsp:include page="menu.jsp" />
	
<jsp:include page="message.jsp" />
	<c:out value="${msg.getMsg()}" />  
	
	<br>

	<table class="table table-hover">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Apelido</th>
				<th>Telefone</th>
				<th>Celular</th>
				<th>Email</th>
				<th>Data nascimento</th>
				<th>Ações</th>
			</tr>
		</thead>
		
		<tbody>
		   <c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.getNome()}</td>
				<td>${contato.getApelido()}</td>
				<td>${contato.getTelefoneFormated()}</td>
				<td>${contato.getCelularFormated()}</td>
				<td>${contato.getEmail()}</td>
				<td>${contato.getData_nasc()}</td>
				<td>
					<form method="POST">
						<input type="hidden" name="contato_nome" value="${contato.getNome()}"/>
						<button class="btn btn-default" type="submit" onClick="return confirm('Deseja excluir o contato ${contato.getNome()}?')">Excluir</button>
					</form>
				</td>
			</tr>			
			</c:forEach>
		</tbody>
	
	</table>



</body>
</html>