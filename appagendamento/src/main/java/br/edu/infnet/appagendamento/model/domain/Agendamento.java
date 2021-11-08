package br.edu.infnet.appagendamento.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Agendamento {

	private Integer id;
	private LocalDateTime data;
	// criar mais 2 atributos

	private Cliente cliente;
	private List<Corte> cortes;

	public Agendamento() {
		data = LocalDateTime.now();
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Corte> getCortes() {
		return cortes;
	}

	public void setCortes(List<Corte> cortes) {
		this.cortes = cortes;
	}


}
