package controller;

public class MessageHelper {

	
	
	
	private static String msg;
	private static boolean sucesso;
	private static boolean existMessage;
	
	
	public MessageHelper(){}
	
	public MessageHelper(String msg, boolean sucesso){
		MessageHelper.msg = msg;
		MessageHelper.sucesso =  sucesso;
		existMessage = true;
	}
	
	
	public boolean isExistMessage(){
		return existMessage;
	}
	
	public String getMsg() {
		String _msg = msg;
		msg = "";
		existMessage = false;
		return _msg;
	}

	public boolean isSucesso() {
		return sucesso;
		
		
	}



	
	
	
	
}
