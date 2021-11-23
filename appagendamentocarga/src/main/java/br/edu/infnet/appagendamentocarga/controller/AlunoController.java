package br.edu.infnet.appagendamentocarga.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appagendamentocarga.model.domain.Aluno;

@Controller
public class AlunoController {


	@GetMapping(value = "/aluno")
	public String telaCadatro() {
		
		return "aluno/cadastro";
	}
	
	@GetMapping(value = "/alunos")
	public String telaLista(Model model) {
		List<Aluno> alunos = new ArrayList<Aluno>(
					Arrays.asList(
								new Aluno("Luiz", "Luiz@luiz.com"),
								new Aluno("Marcos", "Marcos@marcos.com"),
								new Aluno("Ana", "Ana@ana.com")
							)
				);
		model.addAttribute("lista", alunos);
		return "aluno/lista";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Model model, Aluno aluno) {
		
		model.addAttribute("nome", aluno.getNome());
		return "confirmacao";
	}
}
