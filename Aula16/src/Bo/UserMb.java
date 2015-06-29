package Bo;


import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import Model.User;

@Stateless
@Local
public class UserMb {
	public boolean validLogin(User user) throws Exception {
		EntityManagerFactory factory = null;
		EntityManager em;
		try {
			factory = Persistence.createEntityManagerFactory("clienteDB");
			em = factory.createEntityManager();
			
			Query query = em.createQuery("select u from User u "+
										 "where u.name = :paramName and u.password = :paramPassword");
			query = query.setParameter("paramName", user.getName());
			query = query.setParameter("paramPassword", user.getPassword());
			
			List res = query.getResultList();
			
			return !res.isEmpty();
			
		} catch (Exception e) {
			throw e;
		} 
		finally{
			if (factory != null)
				factory.close();	
		}	
	}
}
