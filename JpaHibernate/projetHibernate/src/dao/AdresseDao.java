package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Adresse;
import entities.Adresse;
import utils.HibernateUtility;

public class AdresseDao {
	
	public void save(Adresse adresse) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(adresse);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void delete(Adresse adresse) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(adresse);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public List<Adresse> findAll() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		Query queryHql = s.createQuery("from Adresse") ;

			List<Adresse> liste = queryHql.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	
	public Adresse findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Adresse where id=:x");

			q.setParameter("x", id);
			Adresse mo = (Adresse) q.uniqueResult();

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
