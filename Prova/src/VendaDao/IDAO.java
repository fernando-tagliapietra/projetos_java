package VendaDao;

import java.util.ArrayList;

public interface IDAO<T> {

	
	public void save(T obj) throws Exception;
	public ArrayList<T> getAll();
	public void remove(T obj) throws Exception;
	public void alter(T obj) throws Exception;
	public T get(T obj) throws Exception;
	 	

}
