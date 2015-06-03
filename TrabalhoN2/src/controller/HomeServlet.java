package controller;

import java.io.IOException;



import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utils.Global;
import BO.GerenciadorContato;
import DTO.Contato;
import exceptions.CampoNuloException;
import exceptions.SenhaInvalidException;


/**
 * Servlet implementation class IndexServlet
 */
@WebServlet(description="Login", urlPatterns={"/home"})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		HttpSession sessao = request.getSession();
	
			try {
				if(!Auth.autenticar(sessao)){
					response.setStatus(response.SC_MOVED_TEMPORARILY);
					response.setHeader("Location", "login");
				}
			} catch (CampoNuloException e1) {
				new MessageHelper(e1.getMessage(), false);
			} catch (ClassNotFoundException e1) {
				new MessageHelper(Global.ERROR_CLASS_NOT_FOUNT_EXCEPTION, false);
				e1.printStackTrace();
			} catch (SenhaInvalidException e1) {
				new MessageHelper(e1.getMessage(), false);
			} catch (SQLException e1) {
				new MessageHelper(Global.ERROR_SQL_EXCEPTION, false);
			}
			 
			   
		
		ArrayList<Contato> contatos= null;
		
		try {
			contatos=  GerenciadorContato.listar();
		} catch (ClassNotFoundException e) {
			new MessageHelper(Global.ERROR_CLASS_NOT_FOUNT_EXCEPTION, false);
		} catch (SQLException e) {
			new MessageHelper(Global.ERROR_SQL_EXCEPTION, false);
		}
		
		
		request.setAttribute("contatos", contatos);
		
	
		request.setAttribute("msg", new MessageHelper());
		
		
		
		//request.setAttribute("Estado", listaEstado);  
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/home.jsp");  
		dispatcher.forward(request, response); 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String contato_nome = (String)request.getParameter("contato_nome");
		
		
		try {
			GerenciadorContato.excluir(contato_nome);
			
			
			request.setAttribute("msg", new MessageHelper("Contato excluído com sucesso", true));
		} catch (ClassNotFoundException e) {
			request.setAttribute("msg", new MessageHelper("Erro no código-fonte, contatar desenvolvedor!", false));
		} catch (SQLException e) {
			request.setAttribute("msg", new MessageHelper("Erro na base de dados, contatar desenvolvedor!", false));
		}
		
		
		request.setAttribute("msg", new MessageHelper());
		
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "home");
	}

}
