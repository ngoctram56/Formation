package factory;

import dao.EmployeDao;
import dao.EntrepriseDao;

public class DaoFactory {
	
	public static Object createInstanceDao (String p) {
		
		if (p.equals("em")) {
			
			return new EmployeDao() ;
			
		} else if (p.equals("en")) {
			
			return new EntrepriseDao() ;
			
		}
		
		
		return null ;

	
		
	}

}
