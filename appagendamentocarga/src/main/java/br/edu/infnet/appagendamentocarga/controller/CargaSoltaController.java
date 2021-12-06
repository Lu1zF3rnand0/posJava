package br.edu.infnet.appagendamentocarga.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appagendamentocarga.model.domain.CargaSolta;
import br.edu.infnet.appagendamentocarga.model.domain.Veiculo;

@Controller
public class CargaSoltaController {

	List<CargaSolta> cargas = new ArrayList<CargaSolta>();
			
			
	@GetMapping(value = "/carga")
	public String telaCadatro() {
		
		return "cargaSolta/cadastro";
	}
	
	@GetMapping(value = "/cargas")
	public String telaLista(Model model) {
		model.addAttribute("lista", cargas);
		return "cargaSolta/lista";
	}
	
	@PostMapping(value = "/carga/incluir")
	public String incluir(Model model, CargaSolta carga) {
		cargas.add(carga);
		model.addAttribute("mensagem", "A carga solta "+carga.getMercadoria()+" foi cadastrada com sucesso!!!");
		return telaLista(model);
	}
}
