<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmação</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
	
      <div class="alert alert-success">
      	<strong>Sucesso!</strong> A carga solta <strong>${carga}</strong> foi cadastrada com sucesso!!!
  	  </div>

  	<form action="/index" method="get">
    	<button type="submit" class="btn btn-primary">Voltar</button>
  	</form>
</div>


</body>
</html>