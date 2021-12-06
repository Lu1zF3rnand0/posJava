package br.edu.infnet.appagendamentocarga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appagendamentocarga.model.domain.Usuario;
import br.edu.infnet.appagendamentocarga.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario validar(String email, String senha) {
		
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		
		usuarioRepository.save(usuario);
	}

	public List<Usuario> obterLista() {
		
		return (List<Usuario>) usuarioRepository.findAll();
	}

	public Usuario obterPorId(Integer id) {

		return usuarioRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		
		usuarioRepository.deleteById(id);		
	}
}