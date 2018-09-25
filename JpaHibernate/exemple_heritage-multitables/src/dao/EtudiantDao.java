package dao;

import org.hibernate.Session;


import entities.Etudiant;
import utils.HibernateUtility;

public class EtudiantDao {
	
	public void create(Etudiant etu) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(etu);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}

}
