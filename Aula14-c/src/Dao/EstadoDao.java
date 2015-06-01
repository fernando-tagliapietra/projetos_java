package Dao;

import java.io.Console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Estado;

import Helper.DataBaseHelper;

public class EstadoDao {
	
	public ArrayList<Estado> getEstados() throws ClassNotFoundException, SQLException{
		String query = "select * from estados";
		ArrayList<Estado> estado = new ArrayList<Estado>();
		ResultSet rs =  DataBaseHelper.getInstance().ReturnComandoSQL(query);
		rs.first();				
		System.out.print(rs.getString("sigla"));
		while(rs.next()){
			Estado es = new Estado();
			es.setSigla(rs.getString("sigla"));
			es.setNome(rs.getString("nome"));
			es.setPais(rs.getString("pais"));
			estado.add(es);			
		}
		return estado;		
	}
}
