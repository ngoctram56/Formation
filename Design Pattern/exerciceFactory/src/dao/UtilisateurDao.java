package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entities.Utilisateur;
import util.HibernateUtility;

public class UtilisateurDao implements IUtilisateurDao {
	
public void saveOrUpdate(Utilisateur uti) {
		
		try {
			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			s.saveOrUpdate(uti);
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public Utilisateur findOneByID(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Utilisateur where id= :id");
		queryHql.setParameter("id", id);
		Utilisateur emp = (Utilisateur) queryHql.uniqueResult();
		s.getTransaction().commit();
		s.close();

		return emp;
		
		
	}

	public void deleteUtilisateur(Long id) {
		
		try {

			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			String hql = "delete Utilisateur where id = :id";
			Query q = s.createQuery(hql).setParameter("id", id);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Utilisateur> findAllUtilisateur() {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Utilisateur");

		List<Utilisateur> liste = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return liste;
		
		
	}

}
