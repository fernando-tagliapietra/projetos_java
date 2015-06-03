package testCases;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Random;

import org.junit.Test;

import BO.GerenciadorContato;
import BO.GerenciadorUsuario;
import exceptions.CampoNuloException;
import exceptions.DataInvalidException;
import exceptions.EmailInvalidException;
import exceptions.NumeroFoneInvalidException;
import exceptions.SenhaInvalidException;

public class ContatoTestCase {

	public static Random randomGenerator = new Random();
	public static String novo_nome = "Fernando" + String.valueOf(randomGenerator.nextInt(100));
	@Test
	public void AdicionarContatoSuccess() {
		
	
		
		
		try {
			GerenciadorContato.adicionar(novo_nome, "Darknite", "5134886416", "5192081993", "fernandotagliapietra@gmail.com", "1992-06-18");
		} 
		catch (Exception e) {
			fail("ERRO AO ADICIONAR CONTATO: " + e.getMessage() + novo_nome);
		}
	
		
		//assertArrayEquals(expecteds, actuals);
	}
	
	@Test(expected=CampoNuloException.class)
	public void AdicionarContatoCamposObrigatoriosNulosFail() throws ClassNotFoundException, SenhaInvalidException, SQLException, CampoNuloException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException {
		GerenciadorContato.adicionar("", "", "5134886416", "92081993", "fernandotagliapietra@gmail.com", "18/06/1992");
	}
	
	@Test(expected=NumeroFoneInvalidException.class)
	public void AdicionarContatoTelefoneInvalidoFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException {
		GerenciadorContato.adicionar("fernando", "fernando", "fgrtggd", "5192081993", "fernandotagliapietra@gmail.com", "18/06/1992");
	}
	
	@Test(expected=NumeroFoneInvalidException.class)
	public void AdicionarContatoCelularInvalidoFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException {
		GerenciadorContato.adicionar("fernando", "fernando", "5192081993", "424842", "fernandotagliapietra@gmail.com", "18/06/1992");
	}
	
	
	@Test(expected=EmailInvalidException.class)
	public void AdicionarContatoEmailInvalidoFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException {
		GerenciadorContato.adicionar("fernando", "fernando", "5192081993", "5192081993", "fernandotagliapietra", "18/06/1992");
	}
	
	@Test(expected=DataInvalidException.class)
	public void AdicionarContatoDataInvalidoFail() throws CampoNuloException, ClassNotFoundException, SenhaInvalidException, SQLException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException {
		GerenciadorContato.adicionar("fernando", "fernando", "5192081993", "5192081993", "fernandotagliapietra@gmail.com", "1992-18");
	}
	
	
	@Test
	public void ExcluirContatoSuccess(){
		try {
			GerenciadorContato.excluir(novo_nome);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			fail("ERRO NO CODIGO" + e.getMessage());
		} catch (SQLException e) {
			fail("ERRO NO BANCO DE DADOS" + e.getMessage());
			
		}
	}
	
	
	@Test
	public void ListarContatoSuccess(){
		try {
			GerenciadorContato.listar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			fail("ERRO NO CODIGO" + e.getMessage());
		} catch (SQLException e) {
			fail("ERRO NO BANCO DE DADOS" + e.getMessage());
			
		}
	}
	
	
	
	
	
	
	

	
	
	
	

}
