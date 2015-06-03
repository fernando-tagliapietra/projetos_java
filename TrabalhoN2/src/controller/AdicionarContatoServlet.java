package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exceptions.CampoNuloException;
import exceptions.DataInvalidException;
import exceptions.EmailInvalidException;
import exceptions.NumeroFoneInvalidException;
import exceptions.SenhaInvalidException;
import BO.GerenciadorContato;
import BO.GerenciadorUsuario;

/**
 * Servlet implementation class AdicionarContato
 */
@WebServlet(description="Adicionar Contato", urlPatterns={"/addcontato"})
public class AdicionarContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionarContatoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("msg", new MessageHelper());
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/addContato.jsp");  
		dispatcher.forward(request, response); 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome		= request.getParameter("nome");
		String apelido	= request.getParameter("apelido");
		String telefone	= request.getParameter("telefone");
		String celular	= request.getParameter("celular");
		String email	= request.getParameter("email");
		String data_nasc = request.getParameter("data_nasc");
		
		try {
			GerenciadorContato.adicionar(nome, apelido, telefone, celular, email, data_nasc);
			new MessageHelper("Contato adicionado com sucesso!", true);
			
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", "home");
			return;
			
		} catch (CampoNuloException e) {
			new MessageHelper("Alguns campos ficaram nulos.", false);
		} catch (ClassNotFoundException e) {
			new MessageHelper("Erro no código-fonte, contatar desenvolvedor!", false);
		} catch (NumeroFoneInvalidException e) {
			new MessageHelper(e.getMessage(), false);
		} catch (EmailInvalidException e) {
			new MessageHelper(e.getMessage(), false);
		} catch (DataInvalidException e) {
			new MessageHelper(e.getMessage(), false);
		} catch (SenhaInvalidException e) {
			new MessageHelper(e.getMessage(), false);
		} catch (SQLException e) {
			new MessageHelper("Erro na base de dados, contatar desenvolvedor!", false);
		}
		
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "addcontato");
		 
		
	}

}
