package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory factory;

	private HibernateUtility() { //privée pour ne pas instancier la classe 
	}

 
	public static   SessionFactory getSessionFactory() {

		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}
