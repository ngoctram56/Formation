package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Commercial;
import entities.Commercial;
import utils.HibernateUtility;

public class CommercialDao {
	
	public void save(Commercial commercial) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(commercial);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void delete(Commercial commercial) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(commercial);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public List<Commercial> findAll() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		Query queryHql = s.createQuery("from Commercial") ;

			List<Commercial> liste = queryHql.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	
	public Commercial findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Commercial where id=:x");

			q.setParameter("x", id);
			Commercial mo = (Commercial) q.uniqueResult();

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
