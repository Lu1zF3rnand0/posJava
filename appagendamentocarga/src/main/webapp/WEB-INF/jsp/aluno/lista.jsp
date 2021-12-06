<%@page import="br.edu.infnet.appagendamentocarga.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
<!--   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container mt-3">
	  <h2> Cadastramento de Alunos</h2>
	 
	  <form action="aluno" method="get">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  
	  <hr>
	  
	   <c:if test="${not empty lista}">
	  
		  <h2>Total de alunos: ${lista.size()}</h2>
		  
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>E-mail</th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="a" items="${lista}">
		      <tr>
		        <td>${a.nome}</td>
		        <td>${a.email}</td>
		      </tr>
		      </c:forEach>
		    </tbody>
		  </table>	
	  </c:if>  
	  
	  <c:if test="${empty lista}">
	  	<h2>Não existem alunos cadastrados!!!</h2>
	  </c:if>
	   
	</div>

</body>
</html>