package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Message {

	public static void setMessage(String objMsg, String msg) {

		FacesMessage Fmsg = new FacesMessage(msg);
		FacesContext.getCurrentInstance().addMessage(objMsg, Fmsg);
	}
	
	
}
