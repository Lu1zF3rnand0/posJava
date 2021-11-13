package br.edu.infnet.appagendamentocarga.model.domain;

import java.util.Date;

public abstract class Carga {
	private Integer id;
	private String navio;
	private Date dataMovimentacao; 
	private String porto;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNavio() {
		return navio;
	}
	public void setNavio(String navio) {
		this.navio = navio;
	}
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	public String getPorto() {
		return porto;
	}
	public void setPorto(String porto) {
		this.porto = porto;
	}
	
	
}
