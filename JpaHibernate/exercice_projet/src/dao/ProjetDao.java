package dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import entities.Projet;
import utils.HibernateUtility;

public class ProjetDao  {

	public void create(Projet pro) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(pro);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}

	public void modifier(Projet pro) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.merge(pro);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public void delete(Projet pro) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(pro);

			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public List<Projet> findAll() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery("from Projet");

			List<Projet> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (HibernateException e) {
			s.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}

	}

	public Projet findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Projet where id=:x");

			q.setParameter("x", id);
			Projet emp = (Projet) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return emp;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}

	public Long nbProjet() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("select count(*) from Projet");

			Long pro = (Long) q.uniqueResult();
			//Long e = (BigInteger) querySQL.uniqueResult().longValue() ; cast bigInteger puis par longValue

			s.getTransaction().commit();
			s.close();

			return pro;

		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;

		}

	}

	public Double coutTotal() {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("select sum(cout) from Projet");

			Double pro = (Double) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return pro;

		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;

		}

	}

	public List<Projet> listeClient(String client) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("select designation from Projet where client= :x");

			q.setString("x", client);
			List<Projet> liste = q.list();

			s.getTransaction().commit();
			s.close();

			return liste;

		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;

		}

	}

	public List<Projet> listeIntervalle(Double cout1, Double cout2) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery(" from Projet where cout between :x and :y ");

			q.setDouble("x", cout1);
			q.setDouble("y", cout2);

			List<Projet> liste = q.list();

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



