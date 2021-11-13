package br.edu.infnet.appagendamentocarga.model.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Agendamento {
	
	private Integer id;
	private LocalDateTime data;
	private String tipo;
	private String Transportador;
	private LocalDateTime dataSolicitada;
	private Cliente cliente;
	private List<Carga> cargas;
	
	
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTransportador() {
		return Transportador;
	}


	public void setTransportador(String transportador) {
		Transportador = transportador;
	}


	public LocalDateTime getDataSolicitada() {
		return dataSolicitada;
	}


	public void setDataSolicitada(LocalDateTime dataSolicitada) {
		this.dataSolicitada = dataSolicitada;
	}


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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

}
