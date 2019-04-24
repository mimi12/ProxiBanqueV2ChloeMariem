package org.simple.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.simple.entity.Client;
import org.simple.entity.Compte;
import org.simple.entity.Conseiller;
import org.simple.entity.Operation;

/**
 * Attributs et méthodes permettant de créer la base de données des clients,
 * comptes et conseillers, et de récupérer les éléments de la base
 * 
 * @author Mariem et Chloé
 *
 */
public class DaoImplementation implements ProxiBanqueDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	// Client

	@Override
	public void save(Client c) {

		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();

		try {

			txn1.begin();

			em1.persist(c); // Créé une entité Client en BDD

			txn1.commit();

		} catch (Exception e) {
			if (txn1 != null) {
				txn1.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em1 != null) {
				em1.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}
	}

	Client client = null;

	@Override
	public Client findCliById(Long idClient) {

		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn2 = em2.getTransaction();

		try {

			txn2.begin();

			client = em2.find(Client.class, idClient); // Cherche l'entité Client correspondant à l'id

			txn2.commit();

		} catch (Exception e) {
			if (txn2 != null) {
				txn2.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em2 != null) {
				em2.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return client;
	}

	@Override
	public void updateClient(Long idClient, String newName, String newPrenom, String newMail, String newAdresse) {
		EntityManager emcl = emf.createEntityManager();
		EntityTransaction txncl = emcl.getTransaction();

		try {

			txncl.begin();

			client = emcl.find(Client.class, idClient); // Cherche l'entité Client correspondant à l'id
			client.setNomClient(newName);
			client.setPrenomClient(newPrenom);
			client.setAdresse(newAdresse);
			client.setEmailClient(newMail);
			txncl.commit();

		} catch (Exception e) {
			if (txncl != null) {
				txncl.rollback();
			}
			e.printStackTrace();
		} finally {
			if (emcl != null) {
				emcl.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return;
	}

	// A IMPLEMENTER
	@Override
	public List<Client> findAllCli() {
		return null;
	}

	// Compte

	@Override
	public void save(Compte cpt) {

		EntityManager em7 = emf.createEntityManager();
		EntityTransaction txn7 = em7.getTransaction();

		try {

			txn7.begin();

			em7.persist(cpt); // Créé une entité Compte en BDD

			txn7.commit();

		} catch (Exception e) {
			if (txn7 != null) {
				txn7.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em7 != null) {
				em7.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

	}

	Compte compte = null;

	@Override
	public Compte findCptById(Long idCompte) {

		EntityManager em8 = emf.createEntityManager();
		EntityTransaction txn8 = em8.getTransaction();

		try {

			txn8.begin();

			compte = em8.find(Compte.class, idCompte); // Cherche l'entité Compte correspondant à l'id

			txn8.commit();

		} catch (Exception e) {
			if (txn8 != null) {
				txn8.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em8 != null) {
				em8.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return compte;
	}

	// A IMPLEMENTER
	@Override
	public List<Compte> findAllCpt() {
		return null;
	}

	// Conseiller

	@Override
	public void save(Conseiller cons) {

		EntityManager em10 = emf.createEntityManager();
		EntityTransaction txn10 = em10.getTransaction();

		try {

			txn10.begin();

			em10.persist(cons); // Créé une entité Conseiller en BDD

			txn10.commit();

		} catch (Exception e) {
			if (txn10 != null) {
				txn10.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em10 != null) {
				em10.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

	}

	Conseiller conseiller = null;

	@Override
	public Conseiller findConsById(Long idConseiller) {

		EntityManager em11 = emf.createEntityManager();
		EntityTransaction txn11 = em11.getTransaction();

		try {

			txn11.begin();

			conseiller = em11.find(Conseiller.class, idConseiller); // Cherche l'entité Conseiller correspondant à l'id

			txn11.commit();

		} catch (Exception e) {
			if (txn11 != null) {
				txn11.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em11 != null) {
				em11.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

		return conseiller;
	}

	// A IMPLEMENTER
	@Override
	public List<Conseiller> findAllCons() {
		return null;
	}

	@Override
	public Operation addOperation(Operation op, Long numCompte, Long idConseiller) {

		EntityManager em12 = emf.createEntityManager();
		EntityTransaction txn12 = em12.getTransaction();

		try {

			txn12.begin();

			Compte cp = em12.find(Compte.class, numCompte);
			Conseiller cons = em12.find(Conseiller.class, idConseiller);
			op.setCompte(cp);
//			op.getCompte().setConseiller(cons);
			em12.persist(op);

			txn12.commit();

		} catch (Exception e) {
			if (txn12 != null) {
				txn12.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em12 != null) {
				em12.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

		return op;

	}

}
