package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Client;
import entities.Client;
import utils.HibernateUtility;

public class ClientDao {
	

	public void save(Client client) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(client);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void delete(Client client) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(client);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public List<Client> findAll() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		Query queryHql = s.createQuery("from Client") ;

			List<Client> liste = queryHql.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	
	public Client findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Client where id=:x");

			q.setParameter("x", id);
			Client mo = (Client) q.uniqueResult();

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
