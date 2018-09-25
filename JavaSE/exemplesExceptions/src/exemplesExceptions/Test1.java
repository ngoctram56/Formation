package exemplesExceptions;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("début ");
		try {
			String[] tab = { "ab", "cd" };
			System.out.println(tab);
			System.out.println(tab[2]);
			System.out.println("fin try");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("fin");
	}

}
