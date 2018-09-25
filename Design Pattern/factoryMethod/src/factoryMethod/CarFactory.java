package factoryMethod;

public class CarFactory {
	
	public static Car createCar(String type) {
		
		if (type.equals("lu")) {
			
			return new LuxuryCar() ;
			
		} else if (type.equals("sm")) {
			
			return new SmallCar() ;
			
			
		} else if (type.equals("se")) {
			
			return new SedanCar() ;
			
		}
		return null ;
		
		
	}

}
