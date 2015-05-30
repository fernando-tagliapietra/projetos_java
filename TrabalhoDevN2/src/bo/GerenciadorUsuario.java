package bo;


import dto.Usuario;
import exceptions.CampoNuloException;
import exceptions.SenhaInvalidException;
import models.IDAO;
import models.UsuarioDAO;

public class GerenciadorUsuario {

	
	public static IDAO<Usuario> usuarioDao = new UsuarioDAO(); 
	public Usuario usuarioDto = new Usuario();
	
	
	
	public boolean autenticar(String nome, String senha) throws CampoNuloException, SenhaInvalidException{
		
		validarCampos(nome, senha);
		
		usuarioDto = new Usuario();
		
		usuarioDto = usuarioDao.get(new Usuario(nome, senha));
		
		if(usuarioDto.equals(new Usuario()))
		
		
		
		return false;
		return false;
		
		
		
		
	}
	
	
	public static void adicionar(String nome, String senha) throws CampoNuloException, SenhaInvalidException, ClassNotFoundException, SQLException{
		validarCampos(nome, senha);
		usuarioDao.create(new Usuario(nome, senha));
	}
	
	
	public static void validarCampos(String nome, String senha) throws CampoNuloException, SenhaInvalidException{
		
		if(nome.isEmpty() &&  senha.isEmpty())
			throw new CampoNuloException();
		
		if(senha.length() < 8)
			throw new SenhaInvalidException();
		
	}
	
	
	
	
}
