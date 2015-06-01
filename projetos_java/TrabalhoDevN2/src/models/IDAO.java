package models;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDAO<T> {
	
	public ArrayList<T> getAll();
	public void create(T obj) throws ClassNotFoundException, SQLException;
	public void delete(T obj) throws ClassNotFoundException, SQLException;
	public T get(T obj);
	public boolean isExist(T obj);

	
}
