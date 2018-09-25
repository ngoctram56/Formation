package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Moto;
import utils.HibernateUtility;

public class Motodao implements Serializable {

	public void create(Moto mo) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(mo);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}

	public void modifier(Moto mo) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.merge(mo);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}


	public void delete(Moto mo) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(mo);

			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public List<Moto> findAll() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery("from Moto");

			List<Moto> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}

	}

	public Moto findOne(Long matricule) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Moto where matricule=:x");

			q.setParameter("x", matricule);
			Moto mo = (Moto) q.uniqueResult();

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

