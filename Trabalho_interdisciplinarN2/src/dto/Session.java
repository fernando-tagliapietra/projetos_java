package dto;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class Session {
	private static Session instance;
	
	private Session() {
		
	}
	
	public static Session getInstance() {		
		return instance == null ? instance = new Session() : instance;		
	}
	
	private ExternalContext currentExternalContext() {
		if (FacesContext.getCurrentInstance() == null) {
			throw new RuntimeException("O FacesContext não pode ser chamado");
		} else {
			return FacesContext.getCurrentInstance().getExternalContext();
		}
	}
	
	public Object getAttribute(String nome){
        return currentExternalContext().getSessionMap().get(nome);
    }
	
	public void setAttribute(String nome, Object valor) {
		currentExternalContext().getSessionMap().put(nome, valor);
	}
		
	public Usuario getUsuarioLogado() {
		return (Usuario) getAttribute("usuarioLogado");
	}
	
	public void setUsuarioLogado(Usuario usuario) {
        setAttribute("usuarioLogado", usuario);
    }
	
	public void encerrarSessao() {   
        currentExternalContext().invalidateSession();
    }
	
}
