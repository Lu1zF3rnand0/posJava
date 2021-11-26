package br.edu.infnet.appagendamentocarga.model.domain;

public class Veiculo extends Carga {
	

	private String chassi;
	private String montadora;
	private String modelo;
	
	@Override
	public String retornaNavio(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Veiculo(String navio, String documento, String porto) {
		super(navio, documento, porto);
		// TODO Auto-generated constructor stub
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	

}
