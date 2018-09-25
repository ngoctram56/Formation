package exemplesExceptions;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("début ");
		try {
			String[] tab = { "ab", "cd" };
			System.out.println(tab);
			System.out.println(tab[1]);
			
			int a=5;
			int b=0;
			System.out.println(a/b);
			System.out.println("fin try");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("erreur lors du parcours d un tableau");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.err.println("vérifiez vos calculs");
		}
		finally {
			System.out.println("fermer I/O");
		}
		System.out.println("fin");
	}

}
