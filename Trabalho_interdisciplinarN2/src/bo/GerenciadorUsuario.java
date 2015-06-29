package bo;

import javax.ejb.Local;
import javax.ejb.Stateless;

import model.IDAO;
import model.UsuarioDAO;
import dao.UsuarioDao;
import dto.Usuario;

@Stateless
@Local
public class GerenciadorUsuario {
	
	
	private static IDAO<Usuario> usuarioDao = new UsuarioDAO();
	
	public static Usuario getUsuario(String login, String senha) throws Exception{
	
		Usuario usuarioDto = new Usuario(login, senha);
		return usuarioDao.get(usuarioDto);
	}
	
	
	
	
	
	
}

	
