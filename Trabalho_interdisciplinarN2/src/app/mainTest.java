package app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import bo.GerenciadorPessoa;
import bo.GerenciadorUsuario;
import dto.Pessoa;
import dto.Usuario;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		EntityManagerFactory factory = null;
		EntityManager em;
		
		try {
			
			
			
			factory = Persistence.createEntityManagerFactory("interdisciplinar");
			
			
			
			em = factory.createEntityManager();
			
			Query query = em.createQuery("select u from Pessoa u "+
										 "where u.nome = :paramName");
			
			query = query.setParameter("paramName", "fernando");
		
			List<Pessoa> res = query.getResultList();
			
			for (Pessoa object : res) {
				
				System.out.println(object.toString());
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally{
			if (factory != null)
			
				factory.close();	
		}
		*/
		
		
		
		
		try {
			System.out.println("FAZENDO LOGIN.....");
			Usuario d =GerenciadorUsuario.getUsuario("root", "root");
			System.out.println(d.getPessoa());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERRO" + e.getMessage());
		}
		
		
		

	}

}
