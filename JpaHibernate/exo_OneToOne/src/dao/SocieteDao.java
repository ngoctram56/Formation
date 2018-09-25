package dao;

import java.util.List;

import org.hibernate.Session;

import entities.Societe;
import utils.HibernateUtility;

public class SocieteDao {
	
	public void create(Societe societe) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(societe);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}
	
	
	

	public List<Societe> findAll() {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();
			org.hibernate.Query queryHql = s.createQuery("from Societe");
			List<Societe> liste = queryHql.list();
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
