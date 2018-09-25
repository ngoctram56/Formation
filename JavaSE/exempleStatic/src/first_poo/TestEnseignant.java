package first_poo;

public class TestEnseignant {

	public static void main(String[] args) {
		

		String [] m1 = {"chimie", "physique"} ;
		Lycee l1= new Lycee("aa", "ville1") ;
		Enseignant e1 = new Enseignant("abc", 3500d, "nom1", "prenom1", 45, l1, m1) ;

		System.out.println(e1.nom);
		System.out.println(e1);
		System.out.println(Enseignant.nbEnseignant3000); //acces à un attribut static
	
	}

}
 