package org.simple.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et méthodes relatifs aux Clients Entreprise de ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@DiscriminatorValue("Entreprise")
public class ClientEntreprise extends Client {

	// Constructeurs

	public ClientEntreprise() {
		super();
	}

	public ClientEntreprise(String nomClient, String prenomClient, String adresse, Integer codePostal, String ville,
			String telephone) {
		super(nomClient, prenomClient, adresse, codePostal, ville, telephone);
	}

	public ClientEntreprise(String nom, String prenom, String adresse, String mail) {
		super(nom, prenom, adresse, mail);
	}

}
