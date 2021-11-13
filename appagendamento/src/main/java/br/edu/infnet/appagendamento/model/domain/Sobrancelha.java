package br.edu.infnet.appagendamento.model.domain;

public class Sobrancelha extends Corte {
	private Integer id;
	private boolean pigmentacao;
	private boolean esfoliar;
	private boolean basico;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isPigmentacao() {
		return pigmentacao;
	}
	public void setPigmentacao(boolean pigmentacao) {
		this.pigmentacao = pigmentacao;
	}
	public boolean isEsfoliar() {
		return esfoliar;
	}
	public void setEsfoliar(boolean esfoliar) {
		this.esfoliar = esfoliar;
	}
	public boolean isBasico() {
		return basico;
	}
	public void setBasico(boolean basico) {
		this.basico = basico;
	}

}
