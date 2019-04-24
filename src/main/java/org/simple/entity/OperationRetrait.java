package org.simple.entity;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et méthodes relatifs aux opérations de retrait sur les comptes de
 * ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@DiscriminatorValue("Retrait")
public class OperationRetrait extends Operation {
	// Constructeurs

	public OperationRetrait() {
		super();
	}

	public OperationRetrait(Date date, Double montant) {
		super(date, montant);
	}

}
