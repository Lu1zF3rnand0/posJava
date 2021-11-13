package br.edu.infnet.appagendamento.model.domain;

public abstract class Corte {

	private Integer id;
	private String equipamento; 
	private boolean coloracao;
	private boolean tratamento;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public boolean isColoracao() {
		return coloracao;
	}
	public void setColoracao(boolean coloracao) {
		this.coloracao = coloracao;
	}
	public boolean isTratamento() {
		return tratamento;
	}
	public void setTratamento(boolean tratamento) {
		this.tratamento = tratamento;
	}

	

}
