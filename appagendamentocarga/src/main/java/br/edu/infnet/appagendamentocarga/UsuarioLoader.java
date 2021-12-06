package br.edu.infnet.appagendamentocarga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendamentocarga.model.domain.Usuario;
import br.edu.infnet.appagendamentocarga.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setEmail("luiz@gmail.com");
		usuario.setNome("luiz");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		
		usuarioService.incluir(usuario);
		
	}
}