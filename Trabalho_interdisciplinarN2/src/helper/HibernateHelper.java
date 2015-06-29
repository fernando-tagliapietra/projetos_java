package helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import dto.Pessoa;

public class HibernateHelper<T>{

	
	private EntityManagerFactory factory;
	
	private EntityManager getFactory(){
		
		factory = Persistence.createEntityManagerFactory("interdisciplinar");
		return factory.createEntityManager();
	}
	
	private void closeFactory(){
		factory.close();
	}
	
	
	public void executar(T obj) throws Exception{
		
		EntityManager em =  this.getFactory();
		    
	    em.getTransaction().begin();    
	    em.persist(obj);
	    em.getTransaction().commit();
	    
	    
	    em.close();
	    closeFactory();
		
	}
	
	
	public Collection<T> consultar(String query_string, HashMap<String, Object> args) throws Exception{
		
		System.out.println("parte1");
		EntityManager em =  this.getFactory();
		System.out.println("parte2");
	    Query query = em.createQuery(query_string);
	    System.out.println("parte3");
	    
		for(Entry<String, Object> entry : args.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    
		    query = query.setParameter(key, value);
		}		
		
		List<T> res = query.getResultList();
		em.close();
		closeFactory();
		return res;
	}
	
	
	public T selecionar(T obj) throws Exception{
		
		EntityManager em =  this.getFactory();
		T obj_encontrado = (T) em.find(obj.getClass() , obj);
		return obj_encontrado;
	}
	
	
}
	

