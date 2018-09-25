package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.LigneFacture;
import service.ArticleService;
import entities.LigneFacture;
import utils.HibernateUtility;

public class LigneFactureDao {
	
	public void save(LigneFacture ligneFacture) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(ligneFacture);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void delete(LigneFacture ligneFacture) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(ligneFacture);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public List<LigneFacture> findAll() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		Query queryHql = s.createQuery("from LigneFacture") ;

			List<LigneFacture> liste = queryHql.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	
	public LigneFacture findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from LigneFacture where id=:x");

			q.setParameter("x", id);
			LigneFacture mo = (LigneFacture) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return mo;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}

	public void supprimerLigne (Long id) {
		
		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("delete from LigneFacture where facture_id=:x ");

			q.setParameter("x", id);
			q.executeUpdate();

			s.getTransaction().commit();
			s.close();

	
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

	
		}

}
		
		
	
}
