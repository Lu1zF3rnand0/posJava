<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AppAgendamentoCarga</a>
    </div>
    <ul class="nav navbar-nav">
    
      <li class="active"><a href="/">Home</a></li>
      
      <c:if test="${not empty user}">
	      <li><a href="/usuarios">Usu�rio</a></li>
	      <li><a href="/Clientes">Cliente</a></li>
	      <li><a href="#">Carga</a></li>
	      <li><a href="/conteineres">Conteiner</a></li>
	      <li><a href="/veiculos">Veiculo</a></li>
	      <li><a href="/cargas">Carga Solta</a></li>
	      <li><a href="#">Agendamento</a></li>
      </c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
      <c:if test="${not empty user}">
      	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, ${user.nome}</a></li>
      </c:if>
      
      <c:if test="${empty user}">
      	<li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>
    </ul>
  </div>
</nav>
