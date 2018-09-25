package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Personne;
import entities.Personne;
import utils.HibernateUtility;

public class PersonneDao {
	
	public void save(Personne personne) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(personne);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void delete(Personne personne) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(personne);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public List<Personne> findAll() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		Query queryHql = s.createQuery("from Personne") ;

			List<Personne> liste = queryHql.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	
	public Personne findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Personne where id=:x");

			q.setParameter("x", id);
			Personne mo = (Personne) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return mo;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}
	


}
