package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	public static SessionFactory sf = new Configuration().configure().buildSessionFactory();

}
