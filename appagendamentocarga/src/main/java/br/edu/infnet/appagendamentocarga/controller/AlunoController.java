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

	List<Aluno> alunos = new ArrayList<Aluno>();
			
			
	@GetMapping(value = "/aluno")
	public String telaCadatro() {
		
		return "aluno/cadastro";
	}
	
	@GetMapping(value = "/alunos")
	public String telaLista(Model model) {
		model.addAttribute("lista", alunos);
		return "aluno/lista";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Model model, Aluno aluno) {
		alunos.add(aluno);
		model.addAttribute("nome", aluno.getNome());
		return "confirmacao";
	}
}
