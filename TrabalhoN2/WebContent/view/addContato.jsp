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
	<form method="POST">
	
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<div class="form-group">
						<label for="nome">Nome</label>
						<input type="text" name="nome"  class="form-control"/>
					</div>
					
					<div class="form-group">
						<label for="apelido">Apelido</label>
						<input type="text" name="apelido" class="form-control" />
					</div>
					
					<div class="form-group">
						<label for="telefone">Telefone</label>
						<input type="text" name="telefone" class="form-control" placeholder="Ex:'5132084998'"/>
					</div>
					<div class="form-group">
						<label for="telefone">Celular</label>
						<input type="text" name="celular" class="form-control"  placeholder="Ex:'5192084998'"/>
					</div>
					<div class="form-group">
						<label for="telefone">Email</label>
						<input type="text" name="email" class="form-control" placeholder="Ex:'teste@teste.com.br'"/>
					</div>
					<div class="form-group">
						<label for="telefone">Data nascimento</label>
						<input type="text" name="data_nasc" class="form-control" placeholder=" Ex: '2012-05-25'"/>
					</div>
					
					<button class="btn btn-default" type="submit">Adicionar</button>
					<a class="btn btn-danger" href="home">Cancelar</a>
					
				</div>
			</div>
		
		
		
		
		
		</div>
	
	</form>




</body>
</html>