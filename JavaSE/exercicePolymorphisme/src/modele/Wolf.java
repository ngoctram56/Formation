package modele;

public class Wolf extends Animal {

	public Wolf() {
	
	}

	public Wolf(String nom) {
		super(nom);
	
	}

	
	
	public void roam () {
		
		System.out.println("loup loup");
		
	}
	
	
	@Override
	public void afficherDescription() {
		
		System.out.println("Le nom d'un loup est "+nom);
		

	}

}
