package org.simple.entity;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.OneToMany;

/**
 * Attributs et méthodes relatifs aux Comptes des clients ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeCompte", discriminatorType = DiscriminatorType.STRING)
public class Compte {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long numCompte;
	protected Double soldeCompte;
	protected Date dateOuvertCompte;

//	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE})
//	@JoinColumn(name = "conseiller_id")
//	protected Conseiller conseiller;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "client_id")
	protected Client client;

	// Liste des operations
	@OneToMany(mappedBy = "compte")
	protected List<Operation> listOperations = new ArrayList<Operation>();

	// Constructeurs
	public Compte() {
		super();
	}

	public Compte(Double soldeCompte, Date dateOuvertCompte) {
		super();
		this.soldeCompte = soldeCompte;
		this.dateOuvertCompte = dateOuvertCompte;
	}

	// Getters et Setters
	public Long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}

	public Double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Date getDateOuvertCompte() {
		return dateOuvertCompte;
	}

	public void setDateOuvertCompte(Date dateOuvertCompte) {
		this.dateOuvertCompte = dateOuvertCompte;
	}

//	public Conseiller getConseiller() {
//		return conseiller;
//	}
//
//	public void setConseiller(Conseiller conseiller) {
//		this.conseiller = conseiller;
//	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getListOperations() {
		return listOperations;
	}

	public void setListOperations(List<Operation> listOperations) {
		this.listOperations = listOperations;
	}

	// ToString
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertCompte="
				+ dateOuvertCompte + "]";
	}

}
