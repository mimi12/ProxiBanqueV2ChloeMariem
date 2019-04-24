package org.simple.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simple.entity.Client;
import org.simple.entity.ClientEntreprise;
import org.simple.entity.ClientParticulier;
import org.simple.entity.Compte;
import org.simple.entity.CompteCourant;
import org.simple.entity.Conseiller;
import org.simple.service.ServiceImplementation;

/**
 * Servlet qui permet de créer une base de données contenant plusieurs clients,
 * conseillers, et comptes associés
 * 
 * Servlet implementation class SimpleS
 */
public class SimpleS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimpleS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServiceImplementation proxiService = new ServiceImplementation();

		// création des objets conseillers

		Conseiller cons1 = new Conseiller("Duchmul");
		Conseiller cons2 = new Conseiller("Michel");
		Conseiller cons3 = new Conseiller("Bouch");
		Conseiller cons4 = new Conseiller("Duchmul");
		Conseiller cons5 = new Conseiller("Michel");
		Conseiller cons6 = new Conseiller("Bouch");
		Conseiller cons7 = new Conseiller("Duchmul");
		Conseiller cons8 = new Conseiller("Michel");
		Conseiller cons9 = new Conseiller("Bouch");
		Conseiller cons10 = new Conseiller("Bouch");

		// création des objets clients
		Client c1 = new ClientEntreprise("RepareTout", "RepareTout", "8 rue des myrtilles", 45896, "Rouen",
				"0568452136");
		Client c2 = new ClientEntreprise("ComptaExpress", "ComptaExpress", "35 avenue du gers", 23564, "Fleuret",
				"0654785212");
		Client c3 = new ClientEntreprise("LaModeIci", "LaModeIci", "40 rue du Bourg", 12456, "SaintRémi", "0555215635");
		Client c4 = new ClientEntreprise("PetitsPrix", "PetitsPrix", "23 avenue des Fleurs", 64521, "Biarritz",
				"0645854525");
		Client c5 = new ClientEntreprise("LaFoire", "LaFoire", "36 place des Champs", 36485, "Rouen", "0645125631");

		Client c6 = new ClientParticulier("Dupont", "Sophie", "7 impasse du lilas", 75201, "Paris", "0125631452");
		Client c7 = new ClientParticulier("Spinnato", "Amelie", "32 rue Jeannot", 92452, "Paris", "0654177895");
		Client c8 = new ClientParticulier("Sbayou", "Maxime", "45 clos saint louis", 94712, "Paris", "0125459785");
		Client c9 = new ClientParticulier("Chang", "Cyril", "1 rue Michel", 45632, "Gers", "0645459865");
		Client c10 = new ClientParticulier("Fleuret", "Vivien", "3 avenue Gambetta", 66200, "Lyon", "0645654512");

		// création de 10 objets comptes courants

		Compte com1 = new CompteCourant(40.0, new Date());
		Compte com2 = new CompteCourant(1500.0, new Date());
		Compte com3 = new CompteCourant(400.0, new Date());
		Compte com4 = new CompteCourant(5800.0, new Date());
		Compte com5 = new CompteCourant(42000.0, new Date());
		Compte com6 = new CompteCourant(120.0, new Date());
		Compte com7 = new CompteCourant(5.0, new Date());
		Compte com8 = new CompteCourant(0.0, new Date());
		Compte com9 = new CompteCourant(165.3, new Date());
		Compte com10 = new CompteCourant(1450.0, new Date());
		//
		// Associe les clients aux comptes courants
		com1.setClient(c1);
		com2.setClient(c2);
		com3.setClient(c3);
		com4.setClient(c4);
		com5.setClient(c5);
		com6.setClient(c6);
		com7.setClient(c7);
		com8.setClient(c8);
		com9.setClient(c9);
		com10.setClient(c10);

		// Ajoute comptes en Base de données
		proxiService.ajouterCompte(com1);
		proxiService.ajouterCompte(com2);
		proxiService.ajouterCompte(com3);
		proxiService.ajouterCompte(com4);
		proxiService.ajouterCompte(com5);
		proxiService.ajouterCompte(com6);
		proxiService.ajouterCompte(com7);
		proxiService.ajouterCompte(com8);
		proxiService.ajouterCompte(com9);
		proxiService.ajouterCompte(com10);

		proxiService.ajouterConseiller(cons1);
		proxiService.ajouterConseiller(cons2);
		proxiService.ajouterConseiller(cons3);
		proxiService.ajouterConseiller(cons4);
		proxiService.ajouterConseiller(cons5);
		proxiService.ajouterConseiller(cons6);
		proxiService.ajouterConseiller(cons7);
		proxiService.ajouterConseiller(cons8);
		proxiService.ajouterConseiller(cons9);
		proxiService.ajouterConseiller(cons10);
//		

		// Ajoute clients en Base de données
		proxiService.ajouterClient(c1);
		proxiService.ajouterClient(c2);
		proxiService.ajouterClient(c3);
		proxiService.ajouterClient(c4);
		proxiService.ajouterClient(c5);
		proxiService.ajouterClient(c6);
		proxiService.ajouterClient(c7);
		proxiService.ajouterClient(c8);
		proxiService.ajouterClient(c9);
		proxiService.ajouterClient(c10);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
