package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Departement;
import utils.HibernateUtility;

public class DepartementDao {
	static Session s = HibernateUtility.getSessionFactory().openSession();

	public void saveOrUpdate(Departement emp) {
		try {

			s.getTransaction().begin();
			s.save(emp);
			s.getTransaction().commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Departement findOne(Long id) {

		s.getTransaction().begin();

		Departement e = (Departement) s.get(Departement.class, id);
		s.getTransaction().commit();

		return e;
	}

	public List<Departement> findAll() {

		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Departement");

		List<Departement> liste = queryHql.list();
		s.getTransaction().commit();

		return liste;
	}

	public void remove(Departement emp) {
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
