package Controller;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import Bo.UserMb;
import Model.User;

@ManagedBean
@ViewScoped
public class UserController {
	@EJB
	UserMb userMb;
	private String name;
	private String password;
	
	public void validLogIn() throws Exception{
		try {
			User user = new User();
			user.setName(name);
			user.setPassword(password);
			
			if (userMb.validLogin(user)) 
				setMessage("msgSuccess", "Login com sucesso");
			else	
				setMessage("msgError", "Login Inválido");
			
		} catch (Exception e) {
			throw e;
		} 
	}
	
	public void setMessage(String objMsg, String message){
		FacesMessage msg = new FacesMessage(message);
		FacesContext.getCurrentInstance().addMessage(objMsg, msg);
	}
	public UserMb getUserMb() {
		return userMb;
	}

	public void setUserMb(UserMb user) {
		this.userMb = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
