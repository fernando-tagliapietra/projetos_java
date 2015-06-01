import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Random;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




import bo.GerenciadorUsuario;
import dto.Usuario;
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
	
	

}
