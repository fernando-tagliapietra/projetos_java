package Helper;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;

public class DataBaseHelper {
	private static DataBaseHelper connection;
	private Configuration config ;
	
	private DataBaseHelper(){ 
		config = new Configuration();
	}
	
	public static DataBaseHelper getInstance() {
		if (connection == null)
			connection = new DataBaseHelper();
		return connection;
	}
	
	public void close() throws ClassNotFoundException, SQLException{
		if (this.getConnection() != null)
			this.getConnection().close();
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(config.DRIVER);
		return DriverManager.getConnection(config.URL, config.USER, config.PASSWORD);
	}
	
	public int ExecutarComandoSQL(String query) throws ClassNotFoundException, SQLException {
		PreparedStatement prepare = this.getConnection().prepareStatement(query);
		return prepare.executeUpdate();
	}
	
	public ResultSet ReturnComandoSQL(String query) throws ClassNotFoundException, SQLException {
		System.out.print(query);
		PreparedStatement prepare = this.getConnection().prepareStatement(query);
		return prepare.executeQuery(query);		
	}
}
