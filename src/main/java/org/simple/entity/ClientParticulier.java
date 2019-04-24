package org.simple.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et méthodes relatifs aux Clients Particuliers de ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@DiscriminatorValue("Particulier")
public class ClientParticulier extends Client {

	// Constructeurs

	public ClientParticulier() {
		super();
	}

	public ClientParticulier(String nomClient, String prenomClient, String adresse, Integer codePostal, String ville,
			String telephone) {
		super(nomClient, prenomClient, adresse, codePostal, ville, telephone);
	}

	public ClientParticulier(String nom, String prenom, String adresse, String mail) {
		super(nom, prenom, adresse, mail);
	}

}
