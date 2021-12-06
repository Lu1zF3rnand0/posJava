package br.edu.infnet.appagendamentocarga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appagendamentocarga.model.domain.Veiculo;

@Controller
public class VeiculoController {

	List<Veiculo> veiculos = new ArrayList<Veiculo>();
			
			
	@GetMapping(value = "/veiculo")
	public String telaCadatro() {
		
		return "veiculo/cadastro";
	}
	
	@GetMapping(value = "/veiculos")
	public String telaLista(Model model) {
		model.addAttribute("lista", veiculos);
		return "veiculo/lista";
	}
	
	@PostMapping(value = "/veiculo/incluir")
	public String incluir(Model model, Veiculo veiculo) {
		veiculos.add(veiculo);
		model.addAttribute("mensagem", "O veiculo "+veiculo.getChassi()+" foi cadastrado com sucesso!!!");
		
		return telaLista(model);
	}
}
