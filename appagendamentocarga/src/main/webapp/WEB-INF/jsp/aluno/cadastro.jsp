<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>


<div class="container mt-3">
  <h2>Cadastramento de Alunos</h2>
  
  <form action="/aluno/incluir" method="post">
    <div class="mb-3 mt-3">
    <label>Nome:</label>
      <input type="text" class="form-control" placeholder="Entre com seu nome" name="nome" value="Luiz">
    </div>
    
    <div class="mb-3 mt-3">
      <label>E-mail:</label>
      <input type="email" class="form-control" placeholder="Entre com seu e-mail" name="email" value="luiz@luiz.com"> 
    </div>
    
    <div class="mb-3 mt-3">
    <label>Idade:</label>
      <input type="text" class="form-control" placeholder="Entre com sua idade" name="idade" value="32">
    </div>
    
    <div class="mb-3 mt-3">
    <label>Mensalidade:</label>
      <input type="text" class="form-control" placeholder="Entre com sua mensalidade" name="mensalidade" value="999">
    </div>
    
    <div class="mb-3 mt-3">
	    <label>Curso:</label>
	    <div class="form-check">
	      <input type="radio" class="form-check-input" name="curso" value="G" >
	      <label class="form-check-label" for="radio1">Graduação</label>
	    </div>
	    <div class="form-check">
	      <input type="radio" class="form-check-input" name="curso" value="E" checked>
	      <label class="form-check-label" for="radio2">Especialização</label>
	    </div>
	    <div class="form-check">
	      <input type="radio" class="form-check-input" name="curso" value="M">
	      <label class="form-check-label" for="radio2">Mestrado</label>
	    </div>
    </div>
       
    <div class="mb-3 mt-3">
	    <label>Disciplinas:</label>
	    <div class="form-check">
	      <input type="checkbox" class="form-check-input" name="disciplinas" value="Fundamentos">
	      <label class="form-check-label" for="radio2">Fundamentos Java</label>
	    </div>
	    <div class="form-check">
	      <input type="checkbox" class="form-check-input"  name="disciplinas" value="Java Web" checked>
	      <label class="form-check-label" for="radio1">Java Web</label>
	    </div>
	    <div class="form-check">
	      <input type="checkbox" class="form-check-input" name="disciplinas" value="Programa OO">
	      <label class="form-check-label" for="radio2">POO</label>
	    </div>
    </div>
    
    <div class="mb-3 mt-3">
	    <label class="form-label">Região</label>
	    <select class="form-select" name="regiao">
	      <option value="S">Sul</option>
	      <option value="SU" selected>Sudeste</option>
	      <option value="C">Centro-Oeste</option>
	      <option value="N">Norte</option>
	      <option value="NO">Nordeste</option>
	    </select>
    </div>
    
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>


</body>
</html>