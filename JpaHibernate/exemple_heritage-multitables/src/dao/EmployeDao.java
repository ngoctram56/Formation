package dao;

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

}
