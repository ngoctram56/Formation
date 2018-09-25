package  dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Adresse;
import utils.HibernateUtility;

public class AdresseDao    {
	static SessionFactory sf = new Configuration().configure().buildSessionFactory();
	static Session s = sf.openSession();
//	static Session s = HibernateUtility.getSessionFactory().openSession();

	public void saveOrUpdate(Adresse emp) {
		try {

			s.getTransaction().begin();
			s.save(emp);
			s.getTransaction().commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 

	public List<Adresse> findAll() {

		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Adresse");

		List<Adresse> liste = queryHql.list();
		s.getTransaction().commit();

		return liste;
	}

	 
}
