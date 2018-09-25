package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entites.Personne;
import entites.PersonnePK;
import utils.HibernateUtility;

public class PersonneDao {
	
	public void create(Personne pers) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(pers);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}
	
	public Personne findOne(PersonnePK pk) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Personne where clePersonne.nom=:x and clePersonne.prenom =:y");

			q.setParameter("x", pk.getNom() );
			q.setParameter("y", pk.getPrenom() );
			Personne pers = (Personne) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return pers;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}


}
	
	public List<Personne> findAll() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery("from Personne");

			List<Personne> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}

	}
	

	
}
