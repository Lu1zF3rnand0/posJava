<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Cargas Solta</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container mt-3">
	  <h2>Cadastramento de Cargas Soltas</h2>
	  
	  <form action="/carga/incluir" method="post">
	    <div class="mb-3 mt-3">
	    <label>Navio:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome do navio" name="navio" value="Navio Teste">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Documento:</label>
	      <input type="text" class="form-control" placeholder="Entre com o numero do documento" name="documento" value="21/12345-6"> 
	    </div>
	    
	    <div class="mb-3 mt-3">
	    <label>Porto:</label>
	      <input type="text" class="form-control" placeholder="Entre com o porto" name="porto" value="BRRIO">
	    </div>
	    
	    <div class="mb-3 mt-3">
	    <label>Mercadoria:</label>
	      <input type="text" class="form-control" placeholder="Entre com o tipo de mercadoria" name="mercadoria" value="tubos">
	    </div>
	    
	    <div class="form-check" style="margin-top:25px">
	    <label class="form-check-label">IMO</label>
	      <input class="form-check-input" type="checkbox" class="form-control"  name="imo" value="true">
	    </div>    
		
	    <div class="form-check" style="margin-top:25px; margin-bottom:30px">
	    <label class="form-check-label">OOG</label>
	      <input class="form-check-input" type="checkbox" name="oog" value="true">
	    </div>
	
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>


</body>
</html>