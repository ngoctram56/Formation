package factoryMethod;

public class Test {

	public static void main(String[] args) {
		
		
		SmallCar o1 = (SmallCar) CarFactory.createCar("sm");
		
		LuxuryCar o2 = (LuxuryCar) CarFactory.createCar("lu") ;
		
		SedanCar o3 = (SedanCar) CarFactory.createCar("se") ;

	}

}
