package modele;

public class Dog extends Animal {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}


	
	
	public void eat() {
	
		System.out.println("Croquettes");

	}

	@Override
	public void afficherDescription() {
		System.out.println("Le nom d'un chat est "+nom );
		
	}

	@Override
	public String toString() {
		return "Dog [getNom()=" + getNom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	


	
	
}
