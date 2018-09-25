package factory;

import service.RoleService;
import service.RoleUtilisateurService;
import service.UtilisateurService;

public class ServiceFactory {
	
	public static Object createInstanceService (String p) {
		
		if (p.equals("ro")) {
			
			return new RoleService() ;
			
		} else if (p.equals("ut")) {
			
			return new UtilisateurService();
			
		} else if (p.equals("ru")) {
			
			return new RoleUtilisateurService() ;
			
		}
		
		
		return null ;

	
		
	}

}
