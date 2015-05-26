package models;

import java.sql.SQLException;
import java.util.ArrayList;

import models.DatabaseHelper;
import dto.Usuario;

public class UsuarioDAO implements IDAO<Usuario>{

	@Override
	public ArrayList<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Usuario obj) throws ClassNotFoundException, SQLException {
		String query = "INSERT INTO usuarios (usuario, senha) VALUES "+
				"('{usuario}', {senha})";
				
		query = query.replace("{usuario}", obj.getUsuario());
		query = query.replace("{senha}", obj.getSenha());
		
		DatabaseHelper.ExecutarComandoSQL(query);
		
	}

	@Override
	public void delete(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario get(Usuario obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExist(Usuario obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
