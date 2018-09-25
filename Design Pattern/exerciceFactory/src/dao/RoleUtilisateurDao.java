package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import entities.RoleUtilisateur;
import util.HibernateUtility;

public class RoleUtilisateurDao implements IRoleUtilisateurDao {
	
public void saveOrUpdate(RoleUtilisateur uti) {
		
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



	public RoleUtilisateur findOneByID(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from RoleUtilisateur where id= :id");
		queryHql.setParameter("id", id);
		RoleUtilisateur emp = (RoleUtilisateur) queryHql.uniqueResult();
		s.getTransaction().commit();
		s.close();

		return emp;
		
		
	}

	public void deleteRoleUti(Long id) {
		
		try {

			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			String hql = "delete from RoleUtilisateur where id = :id";
			Query q = s.createQuery(hql).setParameter("id", id);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<RoleUtilisateur> findAllRoleUtilisateur() {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from RoleUtilisateur");

		List<RoleUtilisateur> liste = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return liste;
		
		
	}
	
	public List<String> getListRolesByUser(Long idUser){
		Session s = HibernateUtility.getSessionFactory().openSession();
		
		s.beginTransaction();
		SQLQuery q=s.createSQLQuery("select designation from v_role_util where idUser=:idUser");
		q.setParameter("idUser", idUser);
		List<String> a=q.list();
		s.getTransaction().commit();
		s.close();
		return a;
		
	}

}
