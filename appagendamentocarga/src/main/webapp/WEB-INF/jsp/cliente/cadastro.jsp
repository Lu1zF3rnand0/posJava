<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Cliente</title>
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastramento de Clientes</h2>
	  
	  <form action="/cliente/incluir" method="post">
	    <div class="mb-3 mt-3">
	    <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome" value="Luiz">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com o e-mail" name="email" value="luiz@luiz.com"> 
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com o telefone" name="telefone" value="21 3232-2323"> 
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>CNPJ:</label>
	      <input type="text" class="form-control" placeholder="Entre com o CNPJ" name="cnpj" value="02828446000134"> 
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>


</body>
</html>