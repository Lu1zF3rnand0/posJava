package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;

public class ClienteRepository {
	
	private static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void incluir (Cliente cliente) {
		clientes.add(cliente);
	}

	public static List<Cliente> obterLista(){
		return clientes;
	}
}
