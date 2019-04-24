package org.simple.service;

import java.util.List;

import org.simple.entity.Client;
import org.simple.entity.Compte;
import org.simple.entity.Conseiller;

/**
 * Interface permettant d'implémenter les règles métier relatives aux clients,
 * comptes et conseillers
 * 
 * @author Mariem et Chloé
 *
 */
public interface ProxiBanqueService {

	// Client
	public void ajouterClient(Client client);

	public Client trouverClientParID(Long idClient);

	public List<Client> listerLesClients();

	// Compte
	public void ajouterCompte(Compte compte);

	public Compte trouverCompteParID(Long idCompte);

	public List<Compte> listerLesComptes();

	// Conseiller
	public void ajouterConseiller(Conseiller conseiller);

	public Conseiller trouverConseillerParID(Long idConseiller);

	public List<Conseiller> listerLesConseillers();

	// Virement
	// Auditer

	public void verser(Long numCompte, Long idConseiller, Double montant);

	public void retirer(Long numCompte, Long idConseiller, Double montant);

	public void effectuerVirement(Long numCompte1, Long numCompte2, Long idConseiller, Double montant);

	public void gestionPatri(List<Client> listClient);

	public List<Client> auditer(List<Client> listClient);

	void modifierClient(Long idClient, String newName, String newPrenom, String newMail, String newAdresse);

}
