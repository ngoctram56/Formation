package modele;

import java.util.Arrays;

import interfaces.IEquipe;

public class Equipe implements IEquipe {
	private String nom;
	private Joueur[] joueurs;
	private Joueur capitaine;
	private Integer nbPoints = 0;
	private Integer totalButsMarques = 0;
	private Integer totalButsencaisses = 0;

	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipe(String nom, Joueur[] joueurs, Joueur capitaine) {
		super();
		this.nom = nom;
		this.joueurs = joueurs;
		this.capitaine = capitaine;
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

	public Integer getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(Integer nbPoints) {
		this.nbPoints = nbPoints;
	}

	public Integer getTotalButsMarques() {
		return totalButsMarques;
	}

	public void setTotalButsMarques(Integer totalButsMarques) {
		this.totalButsMarques = totalButsMarques;
	}

	public Integer getTotalButsencaisses() {
		return totalButsencaisses;
	}

	public void setTotalButsencaisses(Integer totalButsencaisses) {
		this.totalButsencaisses = totalButsencaisses;
	}

	@Override
	public String toString() {
		return "Equipe [nom=" + nom + ", joueurs=" + Arrays.toString(joueurs) + ", capitaine=" + capitaine + "]";
	}

	@Override

	public double calculerSalaireJoueurs() {
		double sommeSalaireJoueur = 0;
		for (int i = 0; i < joueurs.length; i++) {
			sommeSalaireJoueur += joueurs[i].getSalaire();
		}
		return sommeSalaireJoueur / joueurs.length;

	}

	public double calculerMoyenneAge() {
		double sommeMoyenneJoueur = 0;
		for (int i = 0; i < joueurs.length; i++) {
			sommeMoyenneJoueur += joueurs[i].getAge();
		}
		return sommeMoyenneJoueur / joueurs.length;

	}

	@Override
	public void ajouterPoints(int a) {
		  nbPoints += a;

	}

	@Override
	public void majButsMarques(int a) {
		  totalButsMarques += a;

	}

	@Override
	public void majButsEncaisses(int a) {
		  totalButsencaisses += a;

	}

}
