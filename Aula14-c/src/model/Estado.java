package model;

import java.sql.SQLException;
import java.util.ArrayList;
import Dao.EstadoDao;

public class Estado {
	private String sigla;
	private String nome;
	private String pais;
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public ArrayList<Estado> getEstados() throws ClassNotFoundException, SQLException{
		EstadoDao es = new EstadoDao(); 
		return es.getEstados();
	}
	
	public Estado getEstado(String sigla) throws ClassNotFoundException, SQLException{
		ArrayList<Estado> es = this.getEstados();
		for(int i=0; i< es.size();i++) {
			if (es.get(i).getSigla().equals(sigla)) {
				this.nome = es.get(i).getNome();
				this.sigla = es.get(i).getSigla();
				this.pais = es.get(i).getPais();
			}
		}
		return this;
	}
 }
