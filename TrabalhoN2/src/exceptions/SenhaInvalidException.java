package exceptions;

public class SenhaInvalidException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2851004182951660493L;

	public SenhaInvalidException(){
		super("Senha devar� ter mais que 8 caracteres");
		
	}
	
}
