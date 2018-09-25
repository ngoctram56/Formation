package dao;

import java.util.List;

import org.hibernate.Session;

import entities.Employe;
import utils.HibernateUtility;

public class EmployeDao {
	
	public void create(Employe employe) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(employe);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}
	

	public List<Employe> findAll() {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();
			org.hibernate.Query queryHql = s.createQuery("from Employe");
			List<Employe> liste = queryHql.list();
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
