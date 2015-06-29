package bo;


import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.AlunoDAO;
import model.FuncionarioDAO;
import model.IDAO;
import model.ProfessorDAO;
import dto.Aluno;
import dto.Funcionario;
import dto.Pessoa;
import dto.Professor;

public class GerenciadorPessoa {
	
	
	private static IDAO<Professor> professorDao = new ProfessorDAO(); 
	private static IDAO<Aluno> alunoDao = new AlunoDAO(); 
	private static IDAO<Funcionario> funcDao = new FuncionarioDAO();
	
	
	
	
	private static Pessoa validPessoa(int cep,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, int dia_id  ) throws Exception{
		
		if(nome.isEmpty())
			throw new Exception("Nome é obrigatório");
	
		
		Pessoa pessoaDto = new Pessoa();
		
		pessoaDto.setCep(cep);
		pessoaDto.setLogradouro(logradouro);
		pessoaDto.setNome(nome);
		pessoaDto.setNomeSocial(nomeSocial);
		return pessoaDto;
		
	}
	
	
	public static void salvarProfessor(int cep, String formacao,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, int dia_id ) throws Exception{
		
		Professor professorDto = (Professor) validPessoa(cep, logradouro, nome, nomeSocial, sexo_id, etnia_id, religiao_id, deficiencias_id, dia_id);
		professorDto.setFormacao(formacao);
		professorDao.save(professorDto);
	}
	
	
	public static void salvarAluno(int cep, String fpagamento,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, int dia_id ) throws Exception{
		
		Aluno alunoDto = (Aluno) validPessoa(cep, logradouro, nome, nomeSocial, sexo_id, etnia_id, religiao_id, deficiencias_id, dia_id);
		alunoDto.setFpagamento(fpagamento);
		alunoDao.save(alunoDto);
	}
	
	
	public static void salvarFuncionario(int cep, String cargo, Date data_admissao,  String logradouro, String nome, String nomeSocial, int sexo_id, int etnia_id, int religiao_id, ArrayList<Integer> deficiencias_id, int dia_id ) throws Exception{
		
		Funcionario funcionarioDto = (Funcionario) validPessoa(cep, logradouro, nome, nomeSocial, sexo_id, etnia_id, religiao_id, deficiencias_id, dia_id);
		funcionarioDto.setData_admissao(data_admissao);
		funcionarioDto.setCargo(cargo);
		funcDao.save(funcionarioDto);
	}
	
	
	
	
	
	/////DEIXAR AKI PARA EXEMPLO DE CRIACAO
	public static Pessoa get1(){ 
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("interdisciplinar");
		EntityManager manager = factory.createEntityManager();

		Pessoa encontrada = manager.find(Pessoa.class, 1);

		System.out.println(encontrada.getNome());
		return encontrada;
	}
	
	
	
	
	

}
