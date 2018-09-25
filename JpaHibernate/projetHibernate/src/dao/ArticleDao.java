package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import entities.Article;
import entities.Article;
import utils.HibernateUtility;

public class ArticleDao {
	
	public void save(Article article) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.save(article);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void modifier(Article article) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.merge(article);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public void delete(Article article) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.beginTransaction();
			s.delete(article);
			s.getTransaction().commit();
			s.close();
		} catch (Exception e) {

			e.printStackTrace();
			s.getTransaction().rollback();
		}
		
	}
	
	public List<Article> findAll() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		Query queryHql = s.createQuery("from Article") ;

			List<Article> liste = queryHql.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	public List<Article> findAllCriteria() {
		
		Session s = HibernateUtility.sf.openSession() ;
		
		try {
			s.getTransaction().begin();
		
			Criteria cr = s.createCriteria(Article.class);
			cr.addOrder(Order.asc("code"));
			List<Article> liste =  cr.list();
			s.getTransaction().commit();
			s.close() ;
			return liste ;
		} catch (HibernateException e) {
			s.getTransaction().rollback() ;
			e.printStackTrace();
			return null ;
		}
		
		
	}
	
	public Article findOne(Long id) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Query q = s.createQuery("from Article where id=:x");

			q.setParameter("x", id);
			Article mo = (Article) q.uniqueResult();

			s.getTransaction().commit();
			s.close();

			return mo;
		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}
	public Article findOneCriteria(Long code) {

		Session s = HibernateUtility.sf.openSession();

		try {
			s.getTransaction().begin();

			Criteria cr = s.createCriteria(Article.class);

			cr.add(Restrictions.eq("code", code)) ;
			Article ar = (Article) cr.uniqueResult();
			
		
			s.getTransaction().commit();
			s.close();
			
			return ar;
		

		} catch (HibernateException e) {

			s.getTransaction().rollback();

			e.printStackTrace();

			return null;
		}

	}


}
