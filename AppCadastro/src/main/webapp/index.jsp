<%@page import="domain.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppCadastroCliente</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
	  <h2>Cadastramento de Cliente</h2>
	  
	  <form action="cliente" method="post">
	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome" value="Cliente">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>CPF:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu e-mail" name="cpf" value="123.456.789-12">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Telefone</label>
	      <input type="text" class="form-control" placeholder="Entre com a sua idade" name="telefone" value="2112345678">
	    </div>
	    		
		
	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>
	
	
	<%
	List<Cliente> lista = (List<Cliente>)request.getAttribute("aLista");
	%>	
	
<hr>

	<div class="container mt-3">
	  <h2>Clientes Cadastrados</h2>
	  
	  
	  <hr>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Nome</th>
		        <th>CPF</th>
		        <th>Telefone</th>
		      </tr>
		    </thead>
		    <tbody>
		      <%
		      if (lista != null) {
		      for(Cliente a : lista){
		      %>
		      <tr>
		        <td><%=a.getNome()%></td>
		        <td><%=a.getCpf()%></td>
		        <td><%=a.getTelefone()%></td>
		      </tr>
		      <%}}%>
		    </tbody>
	  	</table>	  	  
	</div>

</body>
</html>