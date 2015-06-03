package utils;

public class Global {

	
	
	public static final String QUERY_INSERT_USUARIO = "INSERT INTO usuarios (cd_usuario, senha) VALUES "+
			"('{usuario}', '{senha}')";
	
	
	public static final String QUERY_SELECT_USUARIO = "SELECT * FROM usuarios WHERE cd_usuario = '{usuario}'" +
			" AND senha = '{senha}'";
	
	public static final String QUERY_INSERT_CONTATO = "INSERT INTO contatos (nome, apelido, telephone, celular, email, dt_nasc) VALUES"+
			"('{nome}', '{apelido}', '{telefone}', '{celular}', '{email}', STR_TO_DATE('{data}', '%Y-%m-%d') )";
	
	public static final String QUERY_DELETE_CONTATO = "DELETE FROM contatos WHERE nome = '{nome}'";
	
	public static final String QUERY_SELECT_CONTATO = "SELECT * FROM contatos";
	
	
	public static final String REGEX_EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	
	public static final String ERROR_SQL_EXCEPTION = "Erro na base de dados, contatar desenvolvedor!"; 
	public static final String ERROR_CLASS_NOT_FOUNT_EXCEPTION = "Erro no código-fonte, contatar desenvolvedor!";
	
			
	
	
}
