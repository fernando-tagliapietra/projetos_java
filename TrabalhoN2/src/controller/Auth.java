package controller;

import java.sql.SQLException;


import javax.servlet.http.HttpSession;

import exceptions.CampoNuloException;
import exceptions.SenhaInvalidException;
import BO.GerenciadorUsuario;

public class Auth {

	
	public static boolean autenticar(HttpSession sessao) throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException{
		
		String usuario = (String)sessao.getValue("usuario");
		String senha = (String)sessao.getValue("senha");
		
		usuario = usuario == null ? "" : usuario;
		senha 	= senha == null ? "" : senha;
		
		return GerenciadorUsuario.autenticar(usuario, senha);
			
	}
	
	
}
