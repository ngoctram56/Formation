package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.Entreprise;
import util.HibernateUtility;

public class EntrepriseDao implements IEntrepriseDao {
	
	public void saveOrUpdate(Entreprise ent) {
		
		try {
			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			s.saveOrUpdate(ent);
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Entreprise> findAllEntrepriseByDesignation (String designation) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Entreprise where designation like :x");
		queryHql.setParameter("x", designation);
		List<Entreprise> list = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return list;
		
		
	}

	public Entreprise findOneByID(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Entreprise where id= :id");
		queryHql.setParameter("id", id);
		Entreprise ent = (Entreprise) queryHql.uniqueResult();
		s.getTransaction().commit();
		s.close();

		return ent;
		
		
		
	}

	public void deleteEntreprise(Long id) {
		
		try {

			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			String hql = "delete Entreprise where id = :id";
			Query q = s.createQuery(hql).setParameter("id", id);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<Entreprise> findAllEntreprise() {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Entreprise");

		List<Entreprise> liste = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return liste;
		
		
	}
	public Double calculMasseSalariale(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession() ;
		
		try {
			s.getTransaction().begin();
			SQLQuery q = s.createSQLQuery("select sum(salaireMensuel) from entreprise e left join employe em on em.entreprise_id = e.id  where e.id =:x") ;
			q.setParameter("x", id);
			Double m = (Double) q.uniqueResult() ;
			s.getTransaction().commit();
			s.close() ;
			return m ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
	}

}
