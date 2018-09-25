package com.adaming.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.adaming.entity.Employe;
import com.adaming.utils.HibernateUtility;

public class EmployeDAO {
	// @SuppressWarnings("deprecation")
	// static SessionFactory sf = new
	// Configuration().configure().buildSessionFactory();
	// static Session s = sf.openSession();

	public void save(Employe emp) {
		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			s.persist(emp);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			s.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public void update(Employe emp) {
		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			s.merge(emp);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			s.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public void remove(Employe emp) {
		Session s = HibernateUtility.sf.openSession();
		try {

			s.getTransaction().begin();
			s.delete(emp);
			s.getTransaction().commit();
			s.flush();
			s.close();

		} catch (Exception e) {
			s.getTransaction().rollback();

			e.printStackTrace();
		}
	}

	public List<Employe> findAll() {
		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery(" from Employe");
			List<Employe> liste = queryHql.list();
			s.getTransaction().commit();
			s.close();
			return liste;
		} catch (Exception e) {
			s.getTransaction().rollback();

			e.printStackTrace();
			return null;
		}
	}

	public List<Employe> findAllAvecSQL() {
		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			SQLQuery querysql = s.createSQLQuery("select * from T_Employe");

			List<Employe> liste = querysql.addEntity(Employe.class).list();
			s.getTransaction().commit();
			s.close();

			return liste;
		} catch (Exception e) {
			s.getTransaction().rollback();

			e.printStackTrace();
			return null;
		}
	}

	public Employe findOne(Long idEmp) {
		Session s = HibernateUtility.sf.openSession();

		Employe emp;
		try {
			s.getTransaction().begin();
			Query queryHql = s.createQuery(" from Employe where idEmploye= :id");
			queryHql.setParameter("id", idEmp);
			emp = (Employe) queryHql.uniqueResult();
			s.getTransaction().commit();
			s.close();
			return emp;
		} catch (Exception e) {
			s.getTransaction().rollback();

			e.printStackTrace();
			return null;
		}

	}

	public void removeById(Long idEmp) {
		Session s = HibernateUtility.sf.openSession();
		try {

			s.getTransaction().begin();
			String hql = "delete Employe where idEmploye = :id";
			Query q = s.createQuery(hql).setParameter("id", idEmp);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			s.getTransaction().rollback();

			e.printStackTrace();
		}
	}
}
