<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cargas Solta</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
    
      <li class="nav-item">
        <a class="nav-link" href="/index">Página Inicial</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Agendamento</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Cliente</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/conteineres">Conteiner</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/veiculos">Veiculo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="#">Carga Solta</a>
      </li>
<!--       <li class="nav-item"> -->
<!--         <a class="nav-link disabled" href="#">Disabled</a> -->
<!--       </li> -->
    </ul>
  </div>
</nav>

	<div class="container mt-3">
	  <h2> Cadastramento de Cargas Solta</h2>
	 	  
	  <hr>
	  
	   <c:if test="${not empty lista}">
	    
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Mercadoria</th>
		        <th>IMO</th>
		        <th>OOG</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="a" items="${lista}">
		      <tr>
		        <td>${a.mercadoria}</td>
		        <td>
		        	<c:if test="${a.imo}">Sim</c:if> 
		            <c:if test="${!a.imo}">Não</c:if> 
		        </td>
		        <td>
		        	<c:if test="${a.oog}">Sim</c:if> 
		        	<c:if test="${!a.oog}">Não</c:if> 
		        </td>
		      </tr>
		      </c:forEach>
		    </tbody>
		  </table>
		  <h4>Total de cargas: ${lista.size()}</h4>	
	  </c:if>  
	    
	  <c:if test="${empty lista}">
	  	<h4>Não existem cargas cadastradas!!!</h4>
	  </c:if>
	   
	</div>
	
	<div class="container mt-3" align = "right">
	  <form action=carga method="get">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	</div>

</body>
</html>