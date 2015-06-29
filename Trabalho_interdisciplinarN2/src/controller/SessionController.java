package controller;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

<<<<<<< HEAD
import dto.Session; 
import dto.Usuario;
import bo.GerenciadorUsuario;
=======
import dto.Session;
import dto.Usuario;
import bo.GerenciadorUsuario;

>>>>>>> origin/master

@ManagedBean
@SessionScoped
public class SessionController {
	@EJB
<<<<<<< HEAD
	
=======
	GerenciadorUsuario userBo;
>>>>>>> origin/master
	private String login;
	private String senha;
	private String messageError;
	
	
	
	public void accesslogin() throws Exception {
		this.messageError = "";
		try {
<<<<<<< HEAD
			Usuario user = GerenciadorUsuario.getUsuario(login, senha);
			if (user == null) {	
				throw new Exception("incorrect user or password");
=======

			boolean user = GerenciadorUsuario.autenticar(login, senha);
			if (!user) {
				FacesContext.getCurrentInstance().validationFailed();
				throw new Exception("incorrect user and password");
>>>>>>> origin/master
			}
			else
			{
				Session.getInstance().setAttribute("usuarioLogado", user);			
			}
		} catch(Exception ex) {			
			this.setMessage("msgError", ex.getMessage());
		}		
	}
	
	private void setMessage(String obj,String msg)
	{		
	   FacesMessage message = new FacesMessage(msg);
	   FacesContext.getCurrentInstance().addMessage(obj, message);
	}

<<<<<<< HEAD
=======
	public GerenciadorUsuario getUserBo() {
		return userBo;
	}

	public void setUserBo(GerenciadorUsuario userBo) {
		this.userBo = userBo;
	}
>>>>>>> origin/master

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	
}
