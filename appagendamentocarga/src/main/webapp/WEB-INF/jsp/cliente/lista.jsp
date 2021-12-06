<%@page import="br.edu.infnet.appagendamentocarga.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clientes</title>
<!--   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2> Cadastramento de Clientes</h2>
	 	  
	  <hr>
	  
	   <c:if test="${not empty lista}">		
	     
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>E-mail</th>
		        <th>Telefone</th>
		        <th>CNPJ</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="a" items="${lista}">
		      <tr>
		        <td>${a.nome}</td>
		        <td>${a.email}</td>
		        <td>${a.telefone}</td>
		        <td>${a.cnpj}</td>
		      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
		  <h4>Total de Clientes: ${lista.size()}</h4>
		  
	  </c:if>  
	  
	  <c:if test="${empty lista}">
	  	<h4>Não existem clientes cadastrados!!!</h4>
	  </c:if>
	   
	</div>
	
	<div class="container mt-3" align = "right">
		<form action="/cliente" method="get" >
			<button type="submit" class="btn btn-primary">Novo</button>
		</form>
	</div>

</body>
</html>