package Dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.Cliente;

import Helper.DataBaseHelper;

public class ClienteDao implements IDao<Cliente> {
	
	public String convertData(Date data) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String myDateConverted = sdf.format(data);
				
		return myDateConverted;
	}

	@Override
	public int save(Cliente obj) throws Exception {
		String query = "INSERT INTO clientes (codigo, nome, cpf, rg, telefone, email, estado) VALUES "
				+ "( {codigo}, '{nome}', '{cpf}', '{rg}', '{telefone}', '{email}', '{estado}')";

		query = query.replace("{codigo}", String.valueOf(obj.getCodigo()));
		query = query.replace("{nome}",
				String.valueOf(obj.getNome()));
		query = query.replace("{cpf}",
				String.valueOf(obj.getCpf()));
		query = query.replace("{rg}",
				String.valueOf(obj.getRg()));
		query = query.replace("{telefone}",
				String.valueOf(obj.getTelefone()));
		query = query.replace("{email}",
				String.valueOf(obj.getEmail()));
		query = query.replace("{estado}",
				String.valueOf(obj.getEstado()));
		return DataBaseHelper.getInstance().ExecutarComandoSQL(query);
	}
}
