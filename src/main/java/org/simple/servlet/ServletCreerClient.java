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
 * 
 * Servlet permettant de récupérer les valeurs rensignées par le conseiller sur
 * la page de connexion login.jsp, puis de créer un client en base de données
 * 
 * Servlet implementation class ServletEditer
 */
@WebServlet("/ServletCreer")
public class ServletCreerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProxiBanqueService proxiService = new ServiceImplementation();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCreerClient() {
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

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String email = request.getParameter("email");

		Client client = new Client();
		client.setNomClient(nom);
		client.setNomClient(prenom);
		client.setNomClient(adresse);
		client.setNomClient(email);

		request.setAttribute("client", client);
		proxiService.ajouterClient(client);

		// à revoir ça
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("login.jsp");
		requestdispatcher.forward(request, response);
	}

}
