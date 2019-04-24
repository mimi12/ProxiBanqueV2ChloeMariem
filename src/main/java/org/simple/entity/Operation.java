package org.simple.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Attributs et méthodes relatifs aux opérations effectuées sur les comptes des
 * clients de ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeOperation", discriminatorType = DiscriminatorType.STRING)
public class Operation {
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long idOperation;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "compte_id", unique = true)
	protected Compte compte;
	protected Date dateOperation;
	protected Double montant;

	// Constructeurs
	public Operation(Long idOperation) {
		super();
		this.idOperation = idOperation;
	}

	public Operation(Compte compte, Double montant) {
		super();
		this.compte = compte;
		this.montant = montant;
	}

	public Operation(Date dateOperation, Double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public Operation() {
		super();
	}

	// Getters et Setters
	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", compte=" + compte + "]";
	}

	// ToString

}
