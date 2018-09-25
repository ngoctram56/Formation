package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	public static SessionFactory factory;

	/**
	 * Constructeur red�fini comme �tant priv� pour interdire son appel et forcer �
	 * passer par la m�thode getSessionFactory
	 */
	private HibernateUtility() {
	}

	// maling the Hibernate SessionFactory object as singleton
	// snchronized = pas de 2 ex�cution simultann�e du code de la m�thode
	public static synchronized SessionFactory getSessionFactory() {

		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}
