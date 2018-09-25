package modele;

import interfaces.IMathch;

public class Match implements IMathch {

	private String stade;
	private Equipe locaux;
	private Equipe visiteurs;
	private int butsLocaux;
	private int butVisiteurs;

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Match(String stade, Equipe locaux, Equipe visiteurs, int butsLocaux, int butVisiteurs) {
		super();
		this.stade = stade;
		this.locaux = locaux;
		this.visiteurs = visiteurs;
		this.butsLocaux = butsLocaux;
		this.butVisiteurs = butVisiteurs;
		
		//On rajoute cette méthode dans le constructeur
		//car il y a une mise a jours automatiquement 
		
		locaux.majButsEncaisses(getButsLocaux());
		locaux.majButsMarques(getButVisiteurs());
		visiteurs.majButsEncaisses(getButVisiteurs());
		visiteurs.majButsMarques(getButsLocaux());

		if (butsLocaux > butVisiteurs) {

			locaux.ajouterPoint(1);
			visiteurs.ajouterPoint(-1);

		}

		else if (butsLocaux == butVisiteurs) {

			locaux.ajouterPoint(0);
			visiteurs.ajouterPoint(0);

		}

		else if (butsLocaux < butVisiteurs) {
			visiteurs.ajouterPoint(1);
			locaux.ajouterPoint(-1);
			
		}
	}




	@Override
	public void afficherResultat() {
		System.out.println("Il y a " + butsLocaux + " buts locaux et " + +butVisiteurs + " buts visiteurs");

	}

	


	public String getStade() {
		return stade;
	}


	public void setStade(String stade) {
		this.stade = stade;
	}


	public Equipe getLocaux() {
		return locaux;
	}


	public void setLocaux(Equipe locaux) {
		this.locaux = locaux;
	}


	public Equipe getVisiteurs() {
		return visiteurs;
	}


	public void setVisiteurs(Equipe visiteurs) {
		this.visiteurs = visiteurs;
	}


	public int getButsLocaux() {
		return butsLocaux;
	}


	public void setButsLocaux(int butsLocaux) {
		this.butsLocaux = butsLocaux;
	}


	public int getButVisiteurs() {
		return butVisiteurs;
	}


	public void setButVisiteurs(int butVisiteurs) {
		this.butVisiteurs = butVisiteurs;
	}


	@Override
	public String toString() {
		return "Match [stade=" + stade + ", locaux=" + locaux + ", visiteurs=" + visiteurs + ", butsLocaux="
				+ butsLocaux + ", butVisiteurs=" + butVisiteurs + "]";
	}
	
	

}
