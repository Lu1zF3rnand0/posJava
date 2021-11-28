package br.edu.infnet.appagendamentocarga.model.domain;

import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;
import br.edu.infnet.appagendamentocarga.exceptions.TamanhoInvalidoException;

public class Conteiner extends Carga {

	private String numero;
	private int tamanho;
	private String status;

	@Override
	public String retornaNavio(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Conteiner(String navio, String documento, String porto) throws PortoInvalidoException {
		super(navio, documento, porto);

		if (porto.length() != 5) {
			throw new PortoInvalidoException("Código do porto inválido!");
		}
	}

	public Conteiner() {
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

	public void setTamanho(int tamanho) throws TamanhoInvalidoException {
		
		if (tamanho != 40 && tamanho != 20) {
			throw new TamanhoInvalidoException("Tamanho do conteiner inválido!");
		}
		
		this.tamanho = tamanho;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
