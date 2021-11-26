package br.edu.infnet.appagendamentocarga.model.domain;

public class Conteiner extends Carga {
	

	private String numero;
	private int tamanho;
	private String status;
	
	@Override
	public String retornaNavio(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Conteiner(String navio, String documento, String porto) {
		super(navio, documento, porto);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
