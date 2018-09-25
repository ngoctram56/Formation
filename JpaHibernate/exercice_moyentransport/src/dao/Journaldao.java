package dao;

import java.io.Serializable;

import org.hibernate.Session;

import entities.Journal;
import utils.HibernateUtility;

public class Journaldao implements Serializable {

	public void inserer(Journal j) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}

	}
}