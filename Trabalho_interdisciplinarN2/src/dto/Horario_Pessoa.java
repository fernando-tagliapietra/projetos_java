package dto;

public class Horario_Pessoa {

	private int pessoa_id;
	private int horario_id;
	
	private int ano;
	private String situacao;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public int getPessoa_id() {
		return pessoa_id;
	}
	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	public int getHorario_id() {
		return horario_id;
	}
	public void setHorario_id(int horario_id) {
		this.horario_id = horario_id;
	}

	
	
}
