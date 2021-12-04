package br.edu.infnet.appagendamentocarga.model.domain;

import br.edu.infnet.appagendamentocarga.exceptions.PortoInvalidoException;

public abstract class Carga {
	private Integer id;
	private String navio;
	private String documento;
	private String porto;

	protected static int cont = 1;

	public Carga(String navio, String documento, String porto) throws PortoInvalidoException {
		this();
		this.navio = navio;
		this.documento = documento;
		this.porto = porto;

		if (porto.length() != 5) {
			throw new PortoInvalidoException("Código do porto inválido!");
		}
	}

	public Carga() {
		this.id = cont++;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.navio);
		sb.append(";");
		sb.append(this.documento);
		sb.append(";");
		sb.append(this.porto);
		return sb.toString();
	}

	public abstract String retornaNavio();

	public Integer getId() {
		return id;
	}

	public String getNavio() {
		return navio;
	}

	public String getDocumento() {
		return documento;
	}

	public String getPorto() {
		return porto;
	}

}
