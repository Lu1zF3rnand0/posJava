package br.edu.infnet.appagendamento.model.domain;

public class Cabelo extends Corte {
	
	private Integer id;
	private boolean pe;
	private boolean penteado;
	private boolean luzes;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isPe() {
		return pe;
	}
	public void setPe(boolean pe) {
		this.pe = pe;
	}
	public boolean isPenteado() {
		return penteado;
	}
	public void setPenteado(boolean penteado) {
		this.penteado = penteado;
	}
	public boolean isLuzes() {
		return luzes;
	}
	public void setLuzes(boolean luzes) {
		this.luzes = luzes;
	}
	
	

}
