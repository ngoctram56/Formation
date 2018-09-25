package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entities.Role;
import util.HibernateUtility;

public class RoleDao implements IRoleDao{
	
public void saveOrUpdate(Role role) {
		
		try {
			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			s.saveOrUpdate(role);
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public Role findOneByID(Long id) {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Role where id= :id");
		queryHql.setParameter("id", id);
		Role emp = (Role) queryHql.uniqueResult();
		s.getTransaction().commit();
		s.close();

		return emp;
		
		
	}

	public void deleteRole(Long id) {
		
		try {

			Session s = HibernateUtility.getSessionFactory().openSession();
			s.getTransaction().begin();
			String hql = "delete Role where id = :id";
			Query q = s.createQuery(hql).setParameter("id", id);
			q.executeUpdate();
			s.getTransaction().commit();
			s.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Role> findAllRole() {
		
		Session s = HibernateUtility.getSessionFactory().openSession();
		s.getTransaction().begin();

		Query queryHql = s.createQuery(" from Role");

		List<Role> liste = queryHql.list();
		s.getTransaction().commit();
		s.close();

		return liste;
		
		
	}

}
