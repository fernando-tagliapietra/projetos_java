package exceptions;

public class EmailInvalidException extends ContatoException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2305547394415044366L;
	
	public EmailInvalidException(){
		
		super("E-mail inválido");
		
	}

}
