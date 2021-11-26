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
		
		Conteiner conteiner = new Conteiner(null, null, null);
		CargaSolta cargaSolta = new CargaSolta(null, null, null);
		Veiculo veiculo = new Veiculo(null, null, null);
		
		List<Carga> cargas = new ArrayList<Carga>();
		cargas.add(conteiner);
		cargas.add(cargaSolta);
		cargas.add(veiculo);
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setCnpj("12.123.456/7890-12");
		cliente.setNome("MSC");
		cliente.setTelefone("21 1234-5678");
		cliente.setEmail("cliente@cliente.com");
		
		
		Agendamento agendamento = new Agendamento();
		agendamento.setId(1);
		agendamento.setTipo("Importacao");
		agendamento.setTransportador("TestTransp");
		agendamento.setCliente(cliente);
		agendamento.setCargas(cargas);
	}

}
