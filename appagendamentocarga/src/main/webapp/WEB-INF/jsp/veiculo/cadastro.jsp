<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastramento de Veiculo</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
    
      <li class="nav-item">
        <a class="nav-link" href="/index">P�gina Inicial</a>
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
        <a class="nav-link active" href="#">Veiculo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/cargas">Carga Solta</a>
      </li>
<!--       <li class="nav-item"> -->
<!--         <a class="nav-link disabled" href="#">Disabled</a> -->
<!--       </li> -->
    </ul>
  </div>
</nav>

<div class="container mt-3">
  <h2>Cadastramento de Veiculos</h2>
  
  <form action="/veiculo/incluir" method="post">
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
    <label>Chassi:</label>
      <input type="text" class="form-control" placeholder="Entre com o numero do conteiner" name="chassi" value="WDCBB86E7AA520206">
    </div>
    
    <div class="mb-3 mt-3">
    <label>Montadora:</label>
      <input type="text" class="form-control" placeholder="Entre com o tamanho do conteiner" name="montadora" value="Mercedes">
    </div>
       
    <div class="mb-3 mt-3">
    <label>Modelo:</label>
      <input type="text" class="form-control" placeholder="Entre com o status do conteiner" name="modelo" value="ML 350">
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>


</body>
</html>