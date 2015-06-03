package model;

import java.sql.SQLException;
import java.util.ArrayList;

import utils.Global;
import model.DatabaseHelper;
import DTO.Usuario;



public class UsuarioDAO implements IDAO<Usuario>{

	@Override
	public ArrayList<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Usuario obj) throws ClassNotFoundException, SQLException {
		String query = Global.QUERY_INSERT_USUARIO;
		
		query = query.replace("{usuario}", obj.getUsuario());
		query = query.replace("{senha}", obj.getSenha());
		
		DatabaseHelper.executarComandoSQL(query);
		
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
	public boolean isExist(Usuario obj) throws ClassNotFoundException, SQLException {
		
		String query = Global.QUERY_SELECT_USUARIO;
		
		query = query.replace("{usuario}", obj.getUsuario())
				.replace("{senha}", obj.getSenha());
		
		return DatabaseHelper.checkComandoSQL(query);
	}
	
	
	

}
