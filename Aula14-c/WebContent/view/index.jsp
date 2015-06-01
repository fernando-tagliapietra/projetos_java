<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tela Principal</title>
</head>
<body>
	<form action="index" method="POST">
		<label>Código</label><br/>
		<input type="text" name="codigo"/><br/>
		<label>Nome</label><br/>
		<input type="text" name="nome"/><br/>
		<label>Cpf</label><br/>
		<input type="text" name="cpf"/><br/>
		<label>Rg</label><br/>
		<input type="text" name="rg"/><br/>
		<label>Estado</label><br/>
		<select name="estado">
			<option value="0">Selecione </option>		
			<c:forEach var="estado" items="${Estado}">
				<option value="${estado.getSigla()}"> ${estado.getNome()} </option>
			</c:forEach>
		</select>
		<br/>
		<label>Telefone</label><br/>
		<input type="text" name="telefone"/><br/>
		<label>Email</label><br/>
		<input type="text" name="email"/><br/>
		<input type="submit" value ="Salvar" name="salvar"/>
	</form>
</body>
</html>