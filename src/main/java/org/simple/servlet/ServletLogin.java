package org.simple.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet qui permet de rediriger l'utilisateur vers la page creerClients.jsp
 * si il a renseigné le bon utilisateur et mot de passe, sinon la page login.jsp
 * s'actualise
 * 
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String name = "admin";
	private static final String passw = "admin";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("login");
		String pass = request.getParameter("mdp");
		/** Rediriger vers une page **/
		RequestDispatcher requestDispatcher;
		doGet(request, response);

		if ((name.equals(nom)) && (passw.equals(pass))) {
			requestDispatcher = request.getRequestDispatcher("./creerClients.jsp");
		} else {
			requestDispatcher = request.getRequestDispatcher("login.jsp");
		}
		requestDispatcher.forward(request, response);
	}
}
