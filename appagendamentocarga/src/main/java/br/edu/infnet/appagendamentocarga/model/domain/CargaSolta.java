package br.edu.infnet.appagendamentocarga.model.domain;

public class CargaSolta extends Carga {

	private String mercadoria;
	private boolean imo;
	private boolean oog;
	
	
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
