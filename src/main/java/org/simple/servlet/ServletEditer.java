package org.simple.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simple.entity.Client;
import org.simple.service.ProxiBanqueService;
import org.simple.service.ServiceImplementation;

/**
 * Servlet implementation class ServletEditer
 */
@WebServlet("/")
public class ServletEditer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEditer() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProxiBanqueService proxiService = new ServiceImplementation();
		RequestDispatcher requestDispatcher;

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String adresse = request.getParameter("adresse");

		Client client = new Client(nom, prenom, adresse, mail);
		request.setAttribute("clientModifie", client);
		proxiService.modifierClient(client.getIdClient(), nom, prenom, mail, adresse);
		requestDispatcher = request.getRequestDispatcher("*");
		requestDispatcher.forward(request, response);
	}

}
