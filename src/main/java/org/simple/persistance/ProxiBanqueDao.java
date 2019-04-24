package org.simple.persistance;

import java.util.List;

import org.simple.entity.Client;
import org.simple.entity.Compte;
import org.simple.entity.Conseiller;
import org.simple.entity.Operation;

/**
 * Interface permettant d'enregistrer les informations relatives aux clients,
 * comptes et conseillers dans la base de données, et de récupérer les éléments
 * de la base
 * 
 * @author Mariem et Chloé
 *
 */
public interface ProxiBanqueDao {

	// Client
	public void save(Client c);

	public Client findCliById(Long idClient); // -

	public List<Client> findAllCli();

	// Compte

	public void save(Compte cpt);

	public Compte findCptById(Long idCompte); // -

//	public void updateSoldeCompte(Long idCompte, Double solde); 

	public List<Compte> findAllCpt();

	// Conseiller

	public void save(Conseiller cons);

	public Conseiller findConsById(Long idConseiller); // -

	public List<Conseiller> findAllCons();

	public Operation addOperation(Operation op, Long numCompte, Long idConseiller);

	void updateClient(Long idClient, String newName, String newPrenom, String newMail, String newAdresse);

	// Operation, à implémenter
}
