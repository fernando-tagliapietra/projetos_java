package VendaBean;

import javax.ejb.Local;
import javax.ejb.Stateless;

import VendaDao.IDAO;
import VendaDao.VendaDao;
import VendaDto.Venda;


@Stateless
@Local
public class vendaBean {
	
	
	public IDAO<Venda> vendaDao = new VendaDao();
	

	public void gravar(Venda obj) throws Exception {
		
		System.out.println(obj.getNroVenda());
		
		double valorTotal = getValorTotal(obj.getValor(),
				obj.getQuantidade(),
				obj.getDesconto());
		
		obj.setValor(valorTotal);
		
		vendaDao.save(obj);
			
	}
	
	public double getValorTotal(double valor, int qtd, int desconto){
		
		double valorTotal = valor * qtd; 
		double valorDesconto =  (valorTotal*desconto)/100;
		
		return valorTotal - valorDesconto;
	}
	
	/*
	 * 
	 * 100 ---- 100
	 * 10 ----- x
	 * 
	 * 
	 * x= 1000/100
	 * 
	 */
	
	
	
	
}
