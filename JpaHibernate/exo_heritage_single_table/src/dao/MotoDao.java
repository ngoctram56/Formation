package dao;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;


import entities.Moto;
import utils.HibernateUtility;

public class MotoDao {
	
	public void create(Moto moto) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.persist(moto);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
	}

	public Moto findOneHQL(Long matricule) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Moto where matricule=:x");

			q.setParameter("x", matricule);
			Moto mo = (Moto) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return mo;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}

	public Moto findOneSQL(Long matricule) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			SQLQuery q = s.createSQLQuery("select * from t_transport where matricule=:x and grade='mot' ");

			q.setParameter("x", matricule);
			
			Moto moto = (Moto) q.addEntity(Moto.class).uniqueResult() ;

			s.getTransaction().commit();
			s.close();

			return moto;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}

}
