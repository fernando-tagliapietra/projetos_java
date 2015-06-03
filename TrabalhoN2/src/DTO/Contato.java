package DTO;

public class Contato {

	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String apelido;
	private String telefone;
	private String celular;
	private String email;
	private String data_nasc;
	
	
	public Contato(){}
	
	public Contato(String nome){
		this.nome = nome;
	}
	
	
	public Contato(String nome, String apelido, String telefone, String celular, String email, String data_nasc){
		this.nome = nome;
		this.apelido = apelido;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.data_nasc = data_nasc;
	}
	
	
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	public String getTelefoneFormated(){
		String.format("{telefone} - {celular}",telefone,celular);
		return telefone;
	}
	
	public String getCelularFormated(){
		String.format("{telefone} - {celular}",telefone,celular);
		return telefone;
	}
	
	
	
	
}
