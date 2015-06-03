<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Trabalho N2</title>
<jsp:include page="libs.jsp" />
</head>
<body>


<jsp:include page="message.jsp" />
<c:out value="${msg.getMsg()}" />  
	
<div class="container">
			
			
	<div class="jumbotron">
	  <div class="container">
		  <div class="col-md-6 col-md-offset-3"> 
		  	<h1>Trabalho N2</h1>
		  	<h3>Programação de Objetos Distribuidos<br><small>Fernando Tagliapietra, Juliano Camilo</small></h3>
		  	
		  </div>
	  </div>
</div>			

					
	<form method="GET">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="form-group">
				 	<label for="txtusuario">Usuário</label>
					<input type="text" name="txtusuario"  class="form-control"/>
				</div>
				
				<div class="form-group">
					<label for="txtusuario">Senha</label>
					<input type="password" name="txtsenha" class="form-control"/>
				</div>
			
				<input type="submit" name="btnlogin" value="Entrar" class="btn btn-default pull-right" />
				
			</div>
		</div>	
					
	
		
	</form>

	
</div>


</body>
</html>