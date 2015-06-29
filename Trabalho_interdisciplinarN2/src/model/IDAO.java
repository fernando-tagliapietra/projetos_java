package model;

import java.util.ArrayList;

public interface IDAO<T> {

	public void save(T obj) throws Exception;
	public ArrayList<T> getAll() throws Exception;
	public T get(T obj) throws Exception;
	
}
