package dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Client;
import utils.HibernateUtility;

public class ClientDao  {
	
	public void create(Client cli) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(cli);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}

	public void modifier(Client cli) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.merge(cli);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public void delete(Client cli) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(cli);

			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}
	
	public void deleteID(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			Query q = s.createQuery("delete from Client where id=:x");
			q.setParameter("x", id);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public List<Client> findAll() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery("from Client");

			List<Client> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}

	}

	public Client findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Client where id=:x");

			q.setParameter("x", id);
			Client cli = (Client) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return cli;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}
	
	public Client findOne2(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Client c = (Client)s.get(Client.class, id) ;

			s.getTransaction().commit();
			s.close();

			return c;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}

}
