package BO;


import java.sql.SQLException;

import DTO.Usuario;
import exceptions.CampoNuloException;
import exceptions.SenhaInvalidException;
import model.IDAO;
import model.UsuarioDAO;

public class GerenciadorUsuario {

	
	public static IDAO<Usuario> usuarioDao = new UsuarioDAO(); 
	public Usuario usuarioDto = new Usuario();
	
	
	
	public static boolean autenticar(String nome, String senha) throws CampoNuloException, SenhaInvalidException, ClassNotFoundException, SQLException{
		//validarCampos(nome, senha);
		return usuarioDao.isExist(new Usuario(nome,senha));
	}
	
	
	public static void adicionar(String nome, String senha) throws CampoNuloException, SenhaInvalidException, ClassNotFoundException, SQLException{
		validarCampos(nome, senha);
		usuarioDao.create(new Usuario(nome, senha));
	}
	
	
	public static void validarCampos(String nome, String senha) throws CampoNuloException, SenhaInvalidException{
		
		if(nome.isEmpty() || senha.isEmpty())
			throw new CampoNuloException();
		
		if(senha.length() < 8)
			throw new SenhaInvalidException();
		
	}
	
	
	
	
}
