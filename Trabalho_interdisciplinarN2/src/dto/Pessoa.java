package dto;

import java.io.Serializable;





import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="pessoas")
public class Pessoa implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 322317077739507674L;

	@Id
	@Column(name="Id_pessoa")
	private int id;
	
	@Column(name="CEP")
	private int cep;
	
	@Column(name="Logradouro")
	private String logradouro;

	@Column(name="Nome_social")
	private String nomeSocial;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name="Nome")
	private String nome;
	
	//@OneToOne(fetch = FetchType.LAZY, mappedBy = "pessoas", cascade = CascadeType.ALL)
	@OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private Usuario usuario;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getNomeSocial() {
		return nomeSocial;
	}
	
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	
}
