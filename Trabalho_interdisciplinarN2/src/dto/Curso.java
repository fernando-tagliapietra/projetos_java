package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cursos")
public class Curso implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6036466372809289683L;

	@Id
	@Column(name="Id_curso")
	private int id;
	
	@Column(name="Descricao")
	private String descricao;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
