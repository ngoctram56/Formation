package first_poo;

import java.util.Arrays;

public class Enseignant {
	
	String matricule ;
	double salaire ;
	String nom ;
	String prenom ;
	int age ;
	static int nbEnseignant ; //valeur de classe
	Lycee lycee ;
	String [] matiere ;
	static int nbEnseignant3000 ;
	
	
	public Enseignant() {
		super();
		nbEnseignant++;

	}


	public Enseignant(String matricule, double salaire, 
			String nom, String prenom, int age
		, Lycee lycee, String[] matiere) {
		super();
		this.matricule = matricule;
		this.salaire = salaire;
		this.nom = nom;
		this.prenom = prenom;
		this.lycee=lycee ;
		this.age = age;
		nbEnseignant ++; //static
		this.matiere = matiere;
		
		nbEnseignant3000 = 0;
		
		if (salaire>3000) {
			
			nbEnseignant3000++ ;
		}
		
		
	}


	@Override
	public String toString() {
		return "Enseignant [matricule=" + matricule + ", salaire=" + salaire + ", nom=" + nom + ", prenom=" + prenom
				+ ", age=" + age + ", nbEnseignant=" + nbEnseignant + ", lycee=" + lycee + ", matiere="
				+ Arrays.toString(matiere) + "]";
	}
	
	
	// Methode pour calculer le nombre d'enseigant 
	
	
	
 

}
