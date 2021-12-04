package br.edu.infnet.appagendamentocarga.model.tests;

import br.edu.infnet.appagendamentocarga.exceptions.ChassiInvalidoException;
import br.edu.infnet.appagendamentocarga.exceptions.MercadoriaInvalidaException;
import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;
import br.edu.infnet.appagendamentocarga.exceptions.TamanhoInvalidoException;
import br.edu.infnet.appagendamentocarga.model.domain.CargaSolta;
import br.edu.infnet.appagendamentocarga.model.domain.Conteiner;
import br.edu.infnet.appagendamentocarga.model.domain.Veiculo;

public class CargaTest {

	public static void main(String[] args) {

		try {
			Conteiner conteiner = new Conteiner("MSC TESTE", "21/123456-7", "BRRIO");
			conteiner.setNumero("MSCU123456");
			conteiner.setStatus("Vazio");
			conteiner.setTamanho(20);
			System.out.println(conteiner.toString());
			System.out.println(conteiner.retornaNavio());
		} catch (PortoInvalidoException | TamanhoInvalidoException e) {
			System.out.println(e.getMessage());

		}

		
		try {
			CargaSolta cargaSolta = new CargaSolta("MSC TESTE", "21/765432-1", "BRRIO");
			cargaSolta.setImo(false);
			cargaSolta.setOog(true);
			cargaSolta.setMercadoria("Tubos");
			System.out.println(cargaSolta.toString());
			System.out.println(cargaSolta.retornaNavio());
		} catch (PortoInvalidoException | MercadoriaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
		Veiculo veiculo = new Veiculo("MSC TESTE", "21/123456-3", "BRRIO");
		veiculo.setChassi("9BGRD08X04G117975");
		veiculo.setModelo("208");
		veiculo.setMontadora("Peugeot");
		System.out.println(veiculo.toString());
		System.out.println(veiculo.retornaNavio());
		} catch (PortoInvalidoException | ChassiInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
