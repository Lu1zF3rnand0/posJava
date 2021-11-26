package br.edu.infnet.appagendamentocarga.model.domain;

public class CargaSolta extends Carga {

	private String mercadoria;
	private boolean imo;
	private boolean oog;
	
	@Override
	public String retornaNavio(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public CargaSolta(String navio, String documento, String porto) {
		super(navio, documento, porto);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getMercadoria() {
		return mercadoria;
	}
	public void setMercadoria(String mercadoria) {
		this.mercadoria = mercadoria;
	}
	public boolean isImo() {
		return imo;
	}
	public void setImo(boolean imo) {
		this.imo = imo;
	}
	public boolean isOog() {
		return oog;
	}
	public void setOog(boolean oog) {
		this.oog = oog;
	}
	
	
}
