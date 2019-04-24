package org.simple.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et méthodes relatifs aux Comptes Epargne des clients ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@DiscriminatorValue("C_Epargne")
public class CompteEpargne extends Compte {
	// Attributs
	private static final double TAUXREMUNERATIONDEFAUT = 0.03;

	// Getters et Setters
	public static double getTauxremunerationdefaut() {
		return TAUXREMUNERATIONDEFAUT;
	}

	private static final Double AUTORISATIONDECOUVERT = 1000.0;

	public CompteEpargne() {
		super();

	}

	public CompteEpargne(Double soldeCompte, Date dateOuvertCompte) {

		super(soldeCompte, dateOuvertCompte);
	}

	public static Double getAutorisationdecouvert() {
		return AUTORISATIONDECOUVERT;
	}

	@Override
	public String toString() {
		return "CompteEpargne [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertCompte="
				+ dateOuvertCompte + ", client=" + client + ", listOperations=" + listOperations + "]";
	}

}
