package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Employe;
import utils.HibernateUtility;

public class EmployeDao {
	// static SessionFactory sf = new
	// Configuration().configure().buildSessionFactory();
	// static Session s = sf.openSession();
	static Session s = HibernateUtility.getSessionFactory().openSession();

	public void saveOrUpdate(Employe emp) {
		try {

			s.getTransaction().begin();
			s.save(emp);
			s.getTransaction().commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Employe findOne(Long id) {

		s.getTransaction().begin();

		Employe e = (Employe) s.get(Employe.class, id);
		s.getTransaction().commit();

		return e;
	}

	public List<Employe> findAll() {

		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Employe");

		List<Employe> liste = queryHql.list();
		s.getTransaction().commit();

		return liste;
	}

	public void remove(Employe emp) {
		try {

			s.getTransaction().begin();

			s.delete(emp);
			s.getTransaction().commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
