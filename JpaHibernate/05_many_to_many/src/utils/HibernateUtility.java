package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory factory;

	/**
	 * Constructeur redéfini comme étant privé pour interdire son appel et forcer à
	 * passer par la méthode getSessionFactory
	 */
	private HibernateUtility() {
	}

	// maling the Hibernate SessionFactory object as singleton
	// snchronized = pas de 2 exécution simultannée du code de la méthode
	public static synchronized SessionFactory getSessionFactory() {

		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}
