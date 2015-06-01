package VendaMB;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import util.Message;
import VendaBean.vendaBean;
import VendaDto.Venda;

@ManagedBean
@ViewScoped
public class vendaMB {
	@EJB
	vendaBean bean;
	String nroVenda;
	String codProduto;
	String valor;
	String quantidade;
	String valorTotal;
	String desconto;

	
	
	private static Venda venda_dto = new Venda();

	public void addVenda() {

		int nroVenda;
		int codProduto;
		int valor;
		int quantidade;
		int desconto;
		
	
		
		
		try {
			nroVenda = Integer.parseInt(getNroVenda());
			codProduto = Integer.parseInt(getCodProduto());
			valor = Integer.parseInt(getValor());
			quantidade = Integer.parseInt(getQuantidade());
			desconto = Integer.parseInt(getDesconto());
			
			setValorTotal(Double.toString(bean.getValorTotal(valor, quantidade, desconto)));
			
		} catch (Exception e) {
			Message.setMessage("erro", "Preencha os campos corrretamente ");
			return;
		}
		
		venda_dto = new Venda(nroVenda, codProduto, valor, quantidade, desconto);

		try {
			bean.gravar(venda_dto);
		} 
		catch (Exception e) {
			Message.setMessage("erro", "Erro ao salvar laborátorio ERR: " + e.getMessage() );
			
			return;
		}
		
		
		Message.setMessage("sucesso", "Salvo com sucesso");
		
		

	}
	
	
	
	

	public String getDesconto() {
		return desconto;
	}





	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}





	public vendaBean getLaboratorioBean() {
		return bean;
	}

	public void setLaboratorioBean(vendaBean laboratorioBean) {
		this.bean = laboratorioBean;
	}





	public vendaBean getBean() {
		return bean;
	}





	public void setBean(vendaBean bean) {
		this.bean = bean;
	}





	public String getNroVenda() {
		return nroVenda;
	}





	public void setNroVenda(String nroVenda) {
		this.nroVenda = nroVenda;
	}





	public String getCodProduto() {
		return codProduto;
	}





	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}





	public String getValor() {
		return valor;
	}





	public void setValor(String valor) {
		this.valor = valor;
	}





	public String getQuantidade() {
		return quantidade;
	}





	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}





	public String getValorTotal() {
		return valorTotal;
	}





	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}





	public static Venda getVenda_dto() {
		return venda_dto;
	}





	public static void setVenda_dto(Venda venda_dto) {
		vendaMB.venda_dto = venda_dto;
	}





	

	

}
