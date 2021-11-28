package br.edu.infnet.appagendamentocarga.model.domain;

public class Cliente {
	private Integer id;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	
	protected static int cont;
	

	public Cliente() {
		this.id = cont++;
		
	}
	
	public Cliente(String nome, String cnpj, String telefone, String email) {
		this();
		this.nome= nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(';');
		sb.append(this.cnpj);
		sb.append(';');
		sb.append(this.telefone);
		sb.append(';');
		sb.append(this.email);
		
		return sb.toString();
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
