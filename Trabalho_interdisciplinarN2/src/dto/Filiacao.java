package dto;

public class Filiacao {

	private int filiacao_id;
	private String descricao;
	private int tipo_id;
	private int pessoa_id;
	
	
	public Pessoa getPessoa(){
		return null;
	}
	
	public TipoFiliacao getTipoFiliacao(){
		return null;
	}
	
	public int getFiliacao_id() {
		return filiacao_id;
	}
	public void setFiliacao_id(int filiacao_id) {
		this.filiacao_id = filiacao_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTipo_id() {
		return tipo_id;
	}
	public void setTipo_id(int tipo_id) {
		this.tipo_id = tipo_id;
	}
	public int getPessoa_id() {
		return pessoa_id;
	}
	public void setPessoa_id(int pessoa_id) {
		this.pessoa_id = pessoa_id;
	}
	
}
