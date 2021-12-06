<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<!--   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	
	<c:if test="${not empty msg}">
		<div class="alert alert-warning">
	    	<strong>Atenção!</strong> ${msg} 
	  	</div>
	</c:if>
	  
	  <h2>Autenticação</h2>
	  <form action="/login" method="post">
	    <div class="mb-3 mt-3" style="margin-bottom:20px">
	      <label>E-mail:</label>
	      <input type="email" style="margin-bottom:10px" class="form-control" placeholder="Entre com o seu e-mail" name="email" value="luiz@gmail.com">
	   

	    
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha" value="luiz@gmail.com">
	    </div>

	    <button type="submit" class="btn btn-primary">Acessar</button>
	  </form>
	  
	</div>
</body>
</html>