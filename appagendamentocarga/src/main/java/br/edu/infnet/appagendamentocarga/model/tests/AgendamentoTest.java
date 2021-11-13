package br.edu.infnet.appagendamentocarga.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appagendamentocarga.model.domain.Agendamento;
import br.edu.infnet.appagendamentocarga.model.domain.Carga;
import br.edu.infnet.appagendamentocarga.model.domain.CargaSolta;
import br.edu.infnet.appagendamentocarga.model.domain.Cliente;
import br.edu.infnet.appagendamentocarga.model.domain.Conteiner;
import br.edu.infnet.appagendamentocarga.model.domain.Veiculo;

public class AgendamentoTest {

	public static void main(String[] args) {
		
		Conteiner conteiner = new Conteiner();
		CargaSolta cargaSolta = new CargaSolta();
		Veiculo veiculo = new Veiculo();
		
		List<Carga> cargas = new ArrayList<Carga>();
		cargas.add(conteiner);
		cargas.add(cargaSolta);
		cargas.add(veiculo);
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setCnpj("12.123.456/7890-12");
		cliente.setNome("MSC");
		cliente.setTelefone("21 1234-5678");
		
		
		Agendamento agendamento = new Agendamento();
		agendamento.setId(1);
		agendamento.setTipo("Importacao");
		//agendamento.setDataSolicitada(10-10-2010);
		agendamento.setTransportador("TestTransp");
		agendamento.setCliente(cliente);
		agendamento.setCargas(cargas);
	}

}
