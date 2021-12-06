package br.edu.infnet.appagendamentocarga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appagendamentocarga.model.domain.Conteiner;

@Controller
public class ConteinerController {

	List<Conteiner> conteineres = new ArrayList<Conteiner>();
			
			
	@GetMapping(value = "/conteiner")
	public String telaCadatro() {
		
		return "conteiner/cadastro";
	}
	
	@GetMapping(value = "/conteineres")
	public String telaLista(Model model) {
		model.addAttribute("lista", conteineres);
		return "conteiner/lista";
	}
	
	@PostMapping(value = "/conteiner/incluir")
	public String incluir(Model model, Conteiner conteiner) {
		conteineres.add(conteiner);
		model.addAttribute("mensagem", "O conteiner "+conteiner.getNumero()+" foi cadastrado com sucesso!!!");
		return telaLista(model);
	}
}
