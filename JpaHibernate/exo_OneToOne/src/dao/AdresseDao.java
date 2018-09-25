package dao;

import java.util.List;

import org.hibernate.Session;

import entities.Adresse;
import utils.HibernateUtility;

public class AdresseDao {
	
	public void create(Adresse adresse) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(adresse);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}
	
	
	

	public List<Adresse> findAll() {
		Session s = HibernateUtility.sf.openSession();
		try {
			s.beginTransaction();
			org.hibernate.Query queryHql = s.createQuery("from Adresse");
			List<Adresse> liste = queryHql.list();
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
