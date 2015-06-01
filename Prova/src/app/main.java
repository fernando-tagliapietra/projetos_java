package app;

import VendaBean.vendaBean;
import VendaDto.Venda;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vendaBean vendaBean = new vendaBean();
		
		try {
			
			//Venda venda1 = new Venda(2, 1, 10f, 10, 10);
			//vendaBean.gravar(venda1);
			System.out.println(vendaBean.getValorTotal(10, 10, 10));
			
		} catch (Exception e) {
			System.out.println("ERRO" + e.getMessage());
		}
		
		
		
	}

}
