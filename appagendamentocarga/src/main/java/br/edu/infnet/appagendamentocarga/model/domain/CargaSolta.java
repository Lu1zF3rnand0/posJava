package br.edu.infnet.appagendamentocarga.model.domain;

import br.edu.infnet.appagendamentocarga.exceptions.MercadoriaInvalidaException;
import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;

public class CargaSolta extends Carga {

	private String mercadoria;
	private boolean imo;
	private boolean oog;
	
	@Override
	public String retornaNavio() {
		return "O navio da mercadoria "+this.mercadoria+" é o "+super.getNavio()+ "!";
	}
	
	public CargaSolta(String navio, String documento, String porto) throws PortoInvalidoException {
		super(navio, documento, porto);

	}
	
	public CargaSolta(String navio, String documento, String porto, String mercadoria, boolean imo, boolean oog) {
		this();
		this.mercadoria = mercadoria;
		this.imo = imo;
		this.oog = oog;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(";");
		sb.append(this.mercadoria);
		sb.append(";");
		sb.append(this.imo);
		sb.append(";");
		sb.append(this.oog);
		sb.toString();
		return super.toString()+sb.toString();
	}
	
	
	public CargaSolta() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getMercadoria() {
		return mercadoria;
	}
	
	public void setMercadoria(String mercadoria) throws MercadoriaInvalidaException{
		
		if (mercadoria.length() > 20) {
			throw new MercadoriaInvalidaException("A mercadoria não pode conteiner mais de 20 caracteres!");
		}
		
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
