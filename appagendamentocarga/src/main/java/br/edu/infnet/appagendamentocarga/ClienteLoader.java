package br.edu.infnet.appagendamentocarga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendamentocarga.model.domain.Cliente;
import br.edu.infnet.appagendamentocarga.model.domain.Usuario;
import br.edu.infnet.appagendamentocarga.service.ClienteService;

@Component
@Order(2)
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Cliente cliente = new Cliente();
		cliente.setCnpj("02828446000134");
		cliente.setEmail("ClienteTeste@ClienteTeste");
		cliente.setNome("ClienteTeste ltda");
		cliente.setTelefone("21 3232-2323");
		cliente.setUsuario(usuario);
		
		clienteService.incluir(cliente);
		
	}
}