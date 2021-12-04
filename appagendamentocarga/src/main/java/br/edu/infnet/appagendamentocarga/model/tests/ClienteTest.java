package br.edu.infnet.appagendamentocarga.model.tests;

import br.edu.infnet.appagendamentocarga.model.domain.Cliente;

public class ClienteTest {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setCnpj("12.123.456/7890-12");
		cliente.setNome("MSC");
		cliente.setTelefone("21 1234-5678");
		cliente.setEmail("cliente@cliente.com");
		System.out.println(cliente.toString());
		

	}

}
