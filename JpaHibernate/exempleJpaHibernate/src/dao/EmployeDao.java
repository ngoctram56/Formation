package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;


import entities.Employe;
import utils.HibernateUtility;

public class EmployeDao {

	public void create(Employe emp) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(emp);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public void modifier(Employe emp) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.merge(emp);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public void delete(Employe emp) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(emp);
			;
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}

	public List<Employe> findAll() {
			
			Session s = HibernateUtility.sf.openSession() ;
			
			try {
				s.getTransaction().begin();
			Query queryHql = s.createQuery("from Employe") ;

				List<Employe> liste = queryHql.list();
				s.getTransaction().commit();
				s.close() ;
				return liste ;
			} catch (HibernateException e) {
				s.getTransaction().rollback() ;
				e.printStackTrace();
				return null ;
			}
			
			
		}
	
	public Employe findOne (Long id) {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
			
			Query q = s.createQuery("from Employe where id=:x") ;
			
			q.setParameter("x", id) ;
			Employe emp = (Employe)q.uniqueResult() ;
			
			s.getTransaction().commit();
			s.close() ;
			
			return emp ;
		} catch (HibernateException e) {
			
			s.getTransaction().rollback() ;
		
			e.printStackTrace();
			
			return null ;
		}
		
		
	}
	
	public List<Employe> findAll2() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		SQLQuery querysql = s.createSQLQuery("select * from t_employe") ;

			List<Employe> liste = querysql.addEntity(Employe.class).list() ;
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}

}
