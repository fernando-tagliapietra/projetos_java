package dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 165214148039913493L;
	
	@Column(name="F_pagamento")
	private String fpagamento;

	public String getFpagamento() {
		return fpagamento;
	}

	public void setFpagamento(String fpagamento) {
		this.fpagamento = fpagamento;
	}


	
	
	
}
