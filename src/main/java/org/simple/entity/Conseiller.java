package org.simple.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Attributs et méthodes relatifs aux Conseillers de ProxiBanque
 * 
 * @author Mariem et Chloé
 *
 */
@Entity
public class Conseiller {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseiller;
	private String nomConseiller;

	// Liste de comptes gérés
//	@OneToMany(mappedBy = "conseiller")
//	private Set<Compte> listComptes = new HashSet<Compte>();

	// Constructeurs
	public Conseiller() {
		super();
	}

	public Conseiller(String nomConseiller) {
		super();
		this.nomConseiller = nomConseiller;
	}

	// Getters et Setters
	public Long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNomConseiller() {
		return nomConseiller;
	}

	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

//	public Set<Compte> getListComptes() {
//		return listComptes;
//	}
//
//	public void setListComptes(Set<Compte> listComptes) {
//		this.listComptes = listComptes;
//	}

	// ToString
	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nomConseiller=" + nomConseiller + "]";
	}

}
