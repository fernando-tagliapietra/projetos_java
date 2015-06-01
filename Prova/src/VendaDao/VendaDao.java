package VendaDao;

import java.util.ArrayList;

import VendaDto.Venda;

public class VendaDao implements IDAO<Venda>{

	@Override
	public void save(Venda obj) throws Exception {
		String query = "INSERT INTO Venda (nroVenda, codProduto, valor, quantidade) VALUES "
				+ "('{nroVenda}', {codProduto}, {valor}, {quantidade})";

		query = query.replace("{nroVenda}", 
				String.valueOf(obj.getNroVenda()));
		query = query.replace("{codProduto}",
				String.valueOf(obj.getCodProduto()));
		query = query.replace("{valor}",
				String.valueOf(obj.getValor()));
		query = query.replace("{quantidade}",
				String.valueOf(obj.getQuantidade()));
		
		
		System.out.println(query);

		DatabaseHelper.ExecutarComandoSQL(query);
		
	}

	@Override
	public ArrayList<Venda> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Venda obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alter(Venda obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Venda get(Venda obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
