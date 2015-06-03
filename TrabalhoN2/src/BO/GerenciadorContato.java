package BO;

import java.sql.SQLException;





import java.util.ArrayList;

import javax.swing.JFormattedTextField.AbstractFormatter;

import utils.DateValidator;
import utils.EmailValidator;
import model.ContatoDAO;
import model.IDAO;
import model.UsuarioDAO;
import DTO.Contato;
import DTO.Usuario;
import exceptions.CampoNuloException;
import exceptions.DataInvalidException;
import exceptions.EmailInvalidException;
import exceptions.NumeroFoneInvalidException;
import exceptions.SenhaInvalidException;


public class GerenciadorContato {

	
	public static IDAO<Contato> contatoDao = new ContatoDAO(); 
	public static Contato contatoDto = new Contato();
	
	
	private static EmailValidator emailValidator = new EmailValidator(); 
	
	public static ArrayList<Contato> listar() throws ClassNotFoundException, SQLException{
		return contatoDao.getAll();
	}
	
	public static void adicionar(String nome, String apelido, String telefone, String celular, String email, String data_nasc) throws CampoNuloException, SenhaInvalidException, ClassNotFoundException, SQLException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException{
		validarCampos(nome, apelido, telefone,celular, email, data_nasc);
		contatoDao.create(new Contato(nome, apelido, telefone, celular, email, data_nasc));
	}
	
	public static void excluir(String nome) throws ClassNotFoundException, SQLException {
		contatoDao.delete(new Contato(nome));
	}
	
	public static void validarCampos(String nome, String apelido, String telefone, String celular, String email, String data_nasc) throws CampoNuloException, SenhaInvalidException, NumeroFoneInvalidException, EmailInvalidException, DataInvalidException{
		
		if(nome.isEmpty() || apelido.isEmpty())
			throw new CampoNuloException();
		
		if(telefone.length()>0 || celular.length()>0)
			if(telefone.length() != 10 || celular.length() != 10)
				throw new NumeroFoneInvalidException();
			
		if(email.length()>0)
			if(!emailValidator.validate(email) || email.length() > 30 )
				throw new EmailInvalidException();
			
		if(data_nasc.length()>0)//fazer val cemail
			if(!DateValidator.isThisDateValid(data_nasc, "yyyy-m-dd"))
				throw new DataInvalidException();
	}
}
