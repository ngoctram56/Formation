package modele;

import interfaces.IPersonne;

public class Personne implements IPersonne {
	
	private String nom ;
	private String prenom ;
	 
	

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}



	@Override
	public void ajouterPersonne() {
		
		System.out.println(nom + " " + prenom + "ajoute" );
		
		
	}

	@Override
	public void supprimerPersonne() {
		
		System.out.println(nom + " " + prenom + "supprime");
		
		
	}
	
	
	

}
