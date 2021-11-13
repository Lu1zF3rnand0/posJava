package controller;

import java.io.IOException;

import domain.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.ClienteRepository;

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ClienteController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome(request.getParameter("nome"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setTelefone(request.getParameter("telefone"));
		
		ClienteRepository.incluir(cliente);
		
		request.setAttribute("oNome", cliente.getNome());
		request.setAttribute("oCpf", cliente.getCpf());
		request.setAttribute("oTelefone", cliente.getTelefone());
		
		
	}

}
