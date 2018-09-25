package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.Employe;
import util.HibernateUtility;

public class EmployeDao implements IEmployeDao{
	
	public void saveOrUpdate(Employe emp) {
		
		try {
			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			s.saveOrUpdate(emp);
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Employe> findAllEmployeByNom (String nom) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Employe where nom like :x or prenom like :y");
		queryHql.setParameter("x", nom);
		queryHql.setParameter("y", nom);
		List<Employe> list = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return list;
		
		
	}

	public Employe findOneByID(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Employe where id= :id");
		queryHql.setParameter("id", id);
		Employe emp = (Employe) queryHql.uniqueResult();
		s.getTransaction().commit();
		s.close();

		return emp;
		
		
	}

	public void deleteEmploye(Long id) {
		
		try {

			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			String hql = "delete Employe where id = :id";
			Query q = s.createQuery(hql).setParameter("id", id);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Employe> findAllEmploye() {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Employe");

		List<Employe> liste = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return liste;
		
		
	}
	
	public Double salaireAnnuel(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession() ;
		
		try {
			s.getTransaction().begin();
			SQLQuery q = s.createSQLQuery("select (salaireMensuel * 12) from employe where id = :x ") ;
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
