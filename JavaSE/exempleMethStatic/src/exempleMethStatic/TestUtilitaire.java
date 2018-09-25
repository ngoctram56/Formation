package exempleMethStatic;

public class TestUtilitaire {

	public static void main(String[] args) {

		int[] tab1 = { 1, 9 };

		int result = Utilitaire.sommeTab(tab1);
	
		
		String[] result2 = {"Un, Deux, Trois"};
		
		
		System.out.println(result);
		
		Utilitaire.afficher(result2);
		


	}

}
