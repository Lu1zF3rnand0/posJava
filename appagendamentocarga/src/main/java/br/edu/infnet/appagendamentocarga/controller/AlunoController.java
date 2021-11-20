package br.edu.infnet.appagendamentocarga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appagendamentocarga.model.domain.Aluno;

@Controller
public class AlunoController {

	//@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	@GetMapping(value = "/aluno")
	public String telaCadatro() {
		
		return "aluno/cadastro";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Aluno aluno) {
		
		aluno.impressoa();
		return "confirmacao";
	}
}
