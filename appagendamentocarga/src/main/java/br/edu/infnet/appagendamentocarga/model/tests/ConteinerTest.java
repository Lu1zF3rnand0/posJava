package br.edu.infnet.appagendamentocarga.model.tests;

import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;
import br.edu.infnet.appagendamentocarga.exceptions.TamanhoInvalidoException;
import br.edu.infnet.appagendamentocarga.model.domain.Conteiner;

public class ConteinerTest {

	public static void main(String[] args) {

		try {
			Conteiner conteiner = new Conteiner("MSC TESTE", "21/123456-7", "BRRIO");
			conteiner.setNumero("MSCU123456");
			conteiner.setStatus("Vazio");
			conteiner.setTamanho(20);
			System.out.println(conteiner.toString());
			System.out.println(conteiner.retornaNavio());
			System.out.println(conteiner.getId());
		} catch (PortoInvalidoException | TamanhoInvalidoException e) {
			System.out.println(e.getMessage());

		}
		
		
		try {
			Conteiner conteiner = new Conteiner("MSC TESTE", "21/123456-7", "BRRI");
			conteiner.setNumero("MSCU654321");
			conteiner.setStatus("Cheio");
			conteiner.setTamanho(40);
			System.out.println(conteiner.toString());
			System.out.println(conteiner.retornaNavio());
			System.out.println(conteiner.getId());
		} catch (PortoInvalidoException | TamanhoInvalidoException e) {
			System.out.println(e.getMessage());

		}
		


	}
}
