package dto;

import java.util.Date;

public class Turma {

	private int id;
	private int curso_id;
	private int capacidade;
	private Date data_fim;
	private Date data_inicio;
	public String tema;
	
	

	public Curso getCurso() {
		return null;
	}
	
	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
