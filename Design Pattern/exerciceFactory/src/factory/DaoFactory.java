package factory;

import dao.RoleDao;
import dao.RoleUtilisateurDao;
import dao.UtilisateurDao;

public class DaoFactory {
	
	public static Object createInstanceDao (String p) {
		
		if (p.equals("ro")) {
			
			return new RoleDao() ;
			
		} else if (p.equals("ut")) {
			
			return new UtilisateurDao();
			
		} else if (p.equals("ru")) {
			
			return new RoleUtilisateurDao() ;
			
		}
		
		
		return null ;

	
		
	}

}
