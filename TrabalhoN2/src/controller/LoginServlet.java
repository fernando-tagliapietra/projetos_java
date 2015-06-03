package controller;


import java.io.IOException;



import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utils.Global;
import exceptions.CampoNuloException;
import exceptions.SenhaInvalidException;


/**
 * Servlet implementation class IndexServlet
 */
@WebServlet(description="Login", urlPatterns={"/"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		HttpSession sessao = request.getSession();
		
		boolean acaoLogin= (request.getParameter("btnlogin") != null);
		
		if(acaoLogin){
			sessao.setAttribute("usuario", request.getParameter("txtusuario"));
			sessao.setAttribute("senha", request.getParameter("txtsenha"));
		}
		
		
		try {
			if(Auth.autenticar(sessao)){
			   response.setStatus(response.SC_MOVED_TEMPORARILY);
			   response.setHeader("Location", "home");
			 
			}
			else
				if(acaoLogin)
					new MessageHelper("Seu usuário não existe, contate o admin.", false);
			
		} catch (CampoNuloException e) {
			new MessageHelper(e.getMessage(), false);
		} catch (ClassNotFoundException e) {
			new MessageHelper(Global.ERROR_CLASS_NOT_FOUNT_EXCEPTION, false);
		} catch (SenhaInvalidException e) {
			new MessageHelper(e.getMessage(), false);
		} catch (SQLException e) {
			new MessageHelper(Global.ERROR_SQL_EXCEPTION, false);
		}	   
		
		request.setAttribute("msg", new MessageHelper());
		  
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/login.jsp");  
		dispatcher.forward(request, response); 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*Cliente cliente = new Cliente();
		cliente.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		cliente.setNome(request.getParameter("nome"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setEmail(request.getParameter("email"));
		cliente.setTelefone(request.getParameter("telefone"));
		cliente.setRg(request.getParameter("rg"));
		String page = "";
		try {
			if (cliente.save() == 0)
				page = "view/gravacao.jsp";
			else
				page = "view/index.jsp";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);  
		dispatcher.forward(request, response); */
	}

}
