package model;

import helper.HibernateHelper;
import helper.RandomHelper;

import java.util.ArrayList;

import dto.Pessoa;
import dto.Professor;

public class ProfessorDAO extends HibernateHelper<Professor> implements IDAO<Professor>{
	


	public ArrayList<Professor> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Professor obj) throws Exception {
		obj.setId(RandomHelper.getIntRandom());
		executar(obj);
	}

	public Professor get(Professor obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
