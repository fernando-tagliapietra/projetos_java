package VendaDto;

public class Venda {
	
	private int nroVenda;
	private int codProduto;
	private double valor;
	private int quantidade;
	private int desconto;
	
	
	public Venda(){}
	
	public Venda(int nroVenda, int codProduto, double valor, int quantidade, int desconto){
		this.nroVenda =nroVenda;
		this.codProduto = codProduto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.desconto = desconto;
	}
	
	public int getNroVenda() {
		return nroVenda;
	}
	
	public void setNroVenda(int nroVenda) {
		this.nroVenda = nroVenda;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	
	
	
	

}
