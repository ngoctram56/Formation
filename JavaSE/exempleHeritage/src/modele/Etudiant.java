package modele;

public class Etudiant extends Personne {
	
	private Double moyenne ;
	private int age ;
	
	
	public Etudiant() {
		super();
		
	}



	public Etudiant(Long matricule, String nom, String prenom, Double moyenne, int age) {
		super(matricule, nom, prenom); // super.matricule=matricule ;
		this.moyenne = moyenne;
		this.age = age;
	}





	public Double getMoyenne() {
		return moyenne;
	}


	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Etudiant [moyenne=" + moyenne + ", age=" + age + ", matricule=" + matricule + ", nom=" + nom
				+ ", prenom=" + prenom + "]";
	}


	

	
	
	
	

}
