package br.edu.infnet.appagendamentocarga.model.domain;

public abstract class Carga {
	private Integer id;
	private String navio;
	private String documento; 
	private String porto;
	
	protected static int cont;
	
	public Carga(String navio, String documento, String porto) {
		this();
		this.navio = navio;
		this.documento = documento;
		this.porto = porto;
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
