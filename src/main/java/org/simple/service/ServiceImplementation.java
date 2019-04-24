package org.simple.service;

import java.util.Date;
import java.util.List;

import org.simple.entity.Client;
import org.simple.entity.Compte;
import org.simple.entity.Conseiller;
import org.simple.entity.OperationVersement;
import org.simple.persistance.DaoImplementation;
import org.simple.persistance.ProxiBanqueDao;

/**
 * Attributs et méthodes permettant d'implémenter les règles métier relatives
 * aux conseillers, aux clients, aux comptes, et fait la connexion entre les
 * couches presentation et persistance
 * 
 * @author Mariem et Chloé
 *
 */
public class ServiceImplementation implements ProxiBanqueService {

	// Attributs

	private ProxiBanqueDao dao = new DaoImplementation();

	// Méthodes

	// Client
	@Override
	public void ajouterClient(Client client) {
		if (client != null) {
			dao.save(client);
		}
	}

	@Override
	public Client trouverClientParID(Long idClient) {
		return dao.findCliById(idClient);
	}

	@Override
	public List<Client> listerLesClients() {
		return dao.findAllCli();
	}

	@Override
	public void modifierClient(Long idClient, String newName, String newPrenom, String newMail, String newAdresse) {
		dao.updateClient(idClient, newName, newPrenom, newMail, newAdresse);
	}
	// Compte

	@Override
	public void ajouterCompte(Compte compte) {
		if (compte != null) {
			dao.save(compte);
		}

	}

	@Override
	public Compte trouverCompteParID(Long idCompte) {
		return dao.findCptById(idCompte);
	}

	@Override
	public List<Compte> listerLesComptes() {
		return dao.findAllCpt();
	}

	// Conseiller

	@Override
	public void ajouterConseiller(Conseiller conseiller) {
		if (conseiller != null) {
			dao.save(conseiller);
		}
	}

	@Override
	public Conseiller trouverConseillerParID(Long idConseiller) {
		return dao.findConsById(idConseiller);
	}

	@Override
	public List<Conseiller> listerLesConseillers() {
		return dao.findAllCons();
	}

	// Methode pour verser l'argent depuis un compte
	@Override
	public void verser(Long numCompte, Long idConseiller, Double montant) {

		dao.addOperation(new OperationVersement(new Date(), montant), numCompte, idConseiller);
		Compte cp = dao.findCptById(numCompte);
		cp.setSoldeCompte(cp.getSoldeCompte() + montant);

	}

	// Methode pour retirer de l'argent depuis un compte
	@Override
	public void retirer(Long numCompte, Long idConseiller, Double montant) {

		dao.addOperation(new OperationVersement(new Date(), montant), numCompte, idConseiller);
		Compte cp = dao.findCptById(numCompte);
		cp.setSoldeCompte(cp.getSoldeCompte() - montant);
	}

	// Methode pour effectuer virement de compte à compte
	@Override
	public void effectuerVirement(Long numCompte1, Long numCompte2, Long idConseiller, Double montant) {

		retirer(numCompte1, idConseiller, montant);
		retirer(numCompte2, idConseiller, montant);
	}

	// Gestion Patrimoine des Clients
	@Override
	public void gestionPatri(List<Client> listClient) {
		// TODO Auto-generated method stub
		//
//			for (Client client : listClient) {
		// function for getting solde

//				if ((client.getListComptes().get > 500000)
		//
//				{
//					System.out.println(
//							"Client : " + client.getId() + " est fortuné il a un solde de : " + client.getcC().getSolde());
//					System.out.println("Opération de placement non toxique dans " + PLACEMENT[0] + "" + PLACEMENT[1] + ""
//							+ PLACEMENT[2]);
		//
//				} else
//					System.out.println("Client : " + client.getId() + " n'est pas fortuné il a un solde de : "
//							+ client.getcC().getSolde());
		//
//			}
		//
//		}
	}

	@Override
	public List<Client> auditer(List<Client> listClient) {
		return listClient;
//			// TODO Auto-generated method stub
//			for (Client client : listClient) {
//				String typeClient = client.getTypeClient();
//				switch (typeClient) {
//				case "Particulier":
		//
//					if (client.getcC().getSolde() > 5000) {
//						System.out.println("Le client " + client.getId() + " est un compte " + typeClient
//								+ " qui a un compte debiteur de " + client.getcC().getSolde());
//					} else {
		//
//					}
//					break;
//				case "Entreprise":
		//
//					if (client.getcC().getSolde() > 50000) {
//						System.out.println("Le client " + client.getId() + " est un compte " + typeClient
//								+ " qui a un compte debiteur de " + client.getcC().getSolde());
//					} else {
		//
//					}
		//
////				default:
////					System.out.println("Il n'y a pas de client avec un compte débiteur augmenté");
////					break;
//				}
		//
//			}
//			return listClient;
		//
//		}

	}
}