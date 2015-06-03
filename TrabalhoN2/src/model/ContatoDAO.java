package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.Global;
import DTO.Contato;

public class ContatoDAO implements IDAO<Contato>{

	@Override
	public ArrayList<Contato> getAll() throws ClassNotFoundException, SQLException {
		
		String query = Global.QUERY_SELECT_CONTATO;
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		ResultSet rs = DatabaseHelper.consultarComandoSQL(query);
		
		while(rs.next()){
			
			Contato contato = new Contato(
				rs.getString("nome"),
				rs.getString("apelido"),
				rs.getString("telephone"),
				rs.getString("celular"),
				rs.getString("email"),
				rs.getString("dt_nasc")
			);
					
			contatos.add(contato);			
		}
		
		
		return contatos;
		
	}

	@Override
	public void create(Contato obj) throws ClassNotFoundException, SQLException {
	
		String query = Global.QUERY_INSERT_CONTATO;
		
		
		query = query.replace("{nome}",obj.getNome())
					.replace("{apelido}",obj.getApelido())
					.replace("{telefone}",obj.getTelefone())
					.replace("{celular}",obj.getCelular())
					.replace("{email}",obj.getEmail())
					.replace("{data}",obj.getData_nasc());
		
		
		System.out.println(query);
		
		DatabaseHelper.executarComandoSQL(query);
		
	}

	@Override
	public void delete(Contato obj) throws ClassNotFoundException, SQLException {
		String query = Global.QUERY_DELETE_CONTATO;
		query = query.replace("{nome}", obj.getNome());
		DatabaseHelper.executarComandoSQL(query);
	}

	@Override
	public Contato get(Contato obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExist(Contato obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
}
