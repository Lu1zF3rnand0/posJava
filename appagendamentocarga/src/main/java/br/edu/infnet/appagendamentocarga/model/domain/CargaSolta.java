package br.edu.infnet.appagendamentocarga.model.domain;

import br.edu.infnet.appagendamentocarga.exceptions.MercadoriaInvalidaException;
import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;

public class CargaSolta extends Carga {

	private String mercadoria;
	private boolean imo;
	private boolean oog;
	
	@Override
	public String retornaNavio(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public CargaSolta(String navio, String documento, String porto) throws PortoInvalidoException {
		super(navio, documento, porto);

		if (porto.length() != 5) {
			throw new PortoInvalidoException("Código do porto inválido!");
		}
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
