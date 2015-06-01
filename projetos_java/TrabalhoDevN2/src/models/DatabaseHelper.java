package models;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DatabaseHelper {

	private static DatabaseHelper connection;
	private static ResourceBundle config;
	
	private DatabaseHelper(){
		config  = ResourceBundle.getBundle("config");
	}
	
	public static DatabaseHelper getInstance(){
		if(connection == null)
			connection = new DatabaseHelper();
		return connection;
	}
	
	public void close() throws ClassNotFoundException, SQLException{
		
		if(getInstance().getConnection() != null)
			getInstance().getConnection().close();
		
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		//carregar: a classe com o driver do mysql
		Class.forName(config.getString("br.edu.qi.Driver"));
		return DriverManager.getConnection(config.getString("br.edu.qi.url"), config.getString("br.edu.qi.user"), config.getString("br.edu.qi.user"));
	}
	
	//public static Connection getConexao(){
     //   return null;
    //}
    
    public static int ExecutarComandoSQL(String query) throws SQLException, ClassNotFoundException {
    	PreparedStatement pstm = getInstance().getConnection().prepareStatement(query);
    	//ResultSet rs =  pstm.executeQuery();
    	
    	return pstm.executeUpdate();
    }
    
    public static Cursor ConsultarComandoSQL(String query){
       return null;
    }
	
	
	
	
	
	
}
