package dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends Pessoa  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6781236811990652271L;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column(name="Dt_admissao")
	private Date data_admissao;
	
	@Column(name="Cargo")
	private String cargo;

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	
	
}
