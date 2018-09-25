package modele;

public class Cat extends Animal {

	public Cat() {
		super();
	
	}

	public Cat(String nom) {
		super(nom);
		
	}

	
	public void sleep() {
		System.out.println("je dors");
	}
	
	
	@Override
	public String toString() {
		return "Cat [getNom()=" + getNom() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void afficherDescription() {
		System.out.println("Le nom d'un chat est "+nom);
		
	}

	
	
	
	
}
