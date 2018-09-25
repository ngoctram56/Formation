package dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.Projet;
import utils.HibernateUtility;

public class ProjetDAO {

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

	public void update(Projet pro) {
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
			s.beginTransaction();
			org.hibernate.Query queryHql = s.createQuery("from Projet");
			List<Projet> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

	public Projet findOne(Long id) {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();
			org.hibernate.Query queryHql = s.createQuery("from Projet where id=:x");
			queryHql.setParameter("x", id);
			Projet e = (Projet) queryHql.uniqueResult();
			s.getTransaction().commit();
			s.close();
			return e;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

	public Long nombreProjets() {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();

			SQLQuery querySql = s.createSQLQuery("select count(*) from t_projet");

			Long e = ((BigInteger) querySql.uniqueResult()).longValue();

			s.getTransaction().commit();
			s.close();
			return e;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

	public Long nombreProjetsHQL() {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();

			Query querySql = s.createQuery("select count(*) from Projet");

			Long e = ((Long) querySql.uniqueResult());

			s.getTransaction().commit();
			s.close();
			return e;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

	public Double coutTotal() {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();

			SQLQuery querySql = s.createSQLQuery("select sum(cout) from t_projet");

			Double e = (Double) querySql.uniqueResult();

			s.getTransaction().commit();
			s.close();
			return e;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

	public List<Projet> projetsClient(String designation) {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();

			SQLQuery querySql = s.createSQLQuery("select * from t_projet where Client=:x");
			querySql.setParameter("x", designation);

			List<Projet> liste = querySql.addEntity(Projet.class).list();

			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

	public List<Projet> projetsCouts(double a, double b) {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();

			SQLQuery querySql = s.createSQLQuery("select * from t_projet where cout between :x and :y");
			querySql.setParameter("x", a);
			querySql.setParameter("y", b);

			List<Projet> liste = querySql.addEntity(Projet.class).list();

			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
			return null;
		}
	}

}
