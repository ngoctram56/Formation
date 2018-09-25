package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Facture;
import entities.Facture;
import utils.HibernateUtility;

public class FactureDao {

	public void save(Facture facture) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(facture);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public void delete(Facture facture) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(facture);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public List<Facture> findAll() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery("from Facture");

			List<Facture> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}

	}

	public Facture findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Facture where id=:x");

			q.setParameter("x", id);
			Facture mo = (Facture) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return mo;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}

	public void supprimerFacture (Long id) {
		
		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("delete from Facture where id=:x");

			q.setParameter("x", id);
			q.executeUpdate();

			s.getTransaction().commit();
			s.close();

	
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

	
		}

}

}
