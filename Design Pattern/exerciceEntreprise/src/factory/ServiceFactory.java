package factory;



import service.EmployeService;
import service.EntrepriseService;

public class ServiceFactory {
	
	public static Object createInstanceService (String p) {
		
		if (p.equals("em")) {
			
			return new EmployeService() ;
			
		} else if (p.equals("en")) {
			
			return new EntrepriseService() ;
			
		}
		
		
		return null ;

	
		
	}

}
