package testCases;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Random;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;











import BO.GerenciadorUsuario;
import DTO.Usuario;
import exceptions.CampoNuloException;
import exceptions.SenhaInvalidException;


public class UsuarioTestCase {

	
	public static Random randomGenerator = new Random();
	
	public static Usuario usuario = new Usuario();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void AdicionarUsuarioSuccess() {
		
	
		String nova_senha = String.valueOf(randomGenerator.nextInt((999999999 - 99999999) + 1) + 99999999);
		
		try {
			GerenciadorUsuario.adicionar("fernando", nova_senha);
		} 
		catch (Exception e) {
			fail("ERRO AO ADICIONAR USUÁRIO: " + e.getMessage() + nova_senha);
		}
	
		
		//assertArrayEquals(expecteds, actuals);
	}
	
	@Test(expected=SenhaInvalidException.class)
	public void AdicionarUsuarioSenhaInvalidaFail() throws ClassNotFoundException, SenhaInvalidException, SQLException, CampoNuloException {
		GerenciadorUsuario.adicionar("fernando", "123");
	}
	
	@Test(expected=CampoNuloException.class)
	public void AdicionarUsuarioCamposNullFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException {
		GerenciadorUsuario.adicionar("", "");
	}
	
	
	@Test
	public void AutenticarUsuarioSuccess() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException {
		assertEquals(true, GerenciadorUsuario.autenticar("fernando", "312888546"));
	}
	
	@Test
	public void AutenticarUsuarioFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException {
		assertEquals(false, GerenciadorUsuario.autenticar("null", "null"));
	}
	
	
	/*@Test(expected=CampoNuloException.class)
	public void AutenticarUsuarioCampoNuloFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException {
		GerenciadorUsuario.autenticar("", "dsdds");
	}
	
	@Test(expected=SenhaInvalidException.class)
	public void AutenticarUsuarioSenhaInvalidaFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException {
		GerenciadorUsuario.autenticar("fernando", "1");
	}*/
	
	

}
