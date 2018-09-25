package modele;

import java.util.Arrays;

import interfaces.IEquipe;

public class Equipe implements IEquipe {

	private String nom;
	private Joueur[] joueurs;
	private Joueur capitaine;
	public int nbPoints = 0;
	public int totalButsMarques = 0;
	public int totalButsEncaisses = 0;

	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipe(String nom, Joueur[] joueurs, Joueur capitaine, int nbPoints, int totalButsMarques,
			int totalButsEncaisses) {
		super();
		this.nom = nom;
		this.joueurs = joueurs;
		this.capitaine = capitaine;
		this.nbPoints = nbPoints;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Joueur[] getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(Joueur[] joueurs) {
		this.joueurs = joueurs;
	}

	public Joueur getCapitaine() {
		return capitaine;
	}

	public void setCapitaine(Joueur capitaine) {
		this.capitaine = capitaine;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public int getTotalButsMarques() {
		return totalButsMarques;
	}

	public void setTotalButsMarques(int totalButsMarques) {
		this.totalButsMarques = totalButsMarques;
	}

	public int getTotalButsEncaisses() {
		return totalButsEncaisses;
	}

	public void setTotalButsEncaisses(int totalButsEncaisses) {
		this.totalButsEncaisses = totalButsEncaisses;
	}

	@Override
	public Double calculerSalaireJoueur() {

		double somme = 0;

		for (int i = 0; i < joueurs.length; i++) {

			somme += joueurs[i].getSalaire();
		}
		return somme;
	}

	@Override
	public Double calculerMoyennedAge() {

		double somme = 0;

		for (int i = 0; i < joueurs.length; i++) {

			somme += joueurs[i].getAge();

		}
		return somme / joueurs.length;
	}

	@Override
	public  void ajouterPoint (int a) {
		
		nbPoints += a ;

	//	System.out.println("L'équipe  " +nom + " " +a +"points" ); 


	}
	
	

	@Override
	public void majButsMarques(int a) {
		
		totalButsMarques += a ;


		//System.out.println("L'équipe  " +nom + " " +a +"buts marques" );
		
	}

	@Override
	public void  majButsEncaisses(int a) {
		
		totalButsEncaisses += a ;
		 
		//System.out.println("L'équipe  " +nom + " " +a +" buts encaissés" );
		
	}

	@Override
	public String toString() {
		return "Equipe [nom=" + nom + ", joueurs=" + Arrays.toString(joueurs) + ", capitaine=" + capitaine
				+ ", nbPoints=" + nbPoints + ", totalButsMarques=" + totalButsMarques + ", totalButsEncaisses="
				+ totalButsEncaisses + "]";
	}

}
