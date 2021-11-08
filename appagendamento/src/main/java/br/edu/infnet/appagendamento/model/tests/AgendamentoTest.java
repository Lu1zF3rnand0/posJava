package br.edu.infnet.appagendamento.model.tests;

import br.edu.infnet.appagendamento.model.domain.Agendamento;
import br.edu.infnet.appagendamento.model.domain.Cliente;

public class AgendamentoTest {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Agendamento agendamento = new Agendamento();
		
		

		agendamento.setId(1);
		agendamento.setCliente(cliente);
		
	}

}
