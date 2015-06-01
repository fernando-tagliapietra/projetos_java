package Dao;

public interface IDao<T> {
	public int save (T obj) throws Exception;
}
