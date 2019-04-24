package org.simple.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et méthodes relatifs aux opérations de versement sur les comptes de
 * ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@DiscriminatorValue("Versement")
public class OperationVersement extends Operation {
	// Constructeurs
	public OperationVersement() {
		super();
	}

	public OperationVersement(Date date, Double montant) {
		super(date, montant);
	}

}
