package exceptions;

public class NumeroFoneInvalidException extends ContatoException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2305547394415044366L;
	
	public NumeroFoneInvalidException(){
		
		super("Número de telefone/celular inválido");
		
	}

}
