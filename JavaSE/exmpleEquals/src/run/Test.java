package run;

import modele.Personne;

public class Test {
public static void main(String[] args) {
	Personne p1=new Personne(1l, "nom", "prenom");
	Personne p2=new Personne(1l, "nom", "prenom");
	
	
	if (p1.equals(p2)) {
		System.out.println("Même personne");
	}
	else {
		System.out.println("equalssssssss !!!!!!!!!!!!!");
	}
	
	
}
}
