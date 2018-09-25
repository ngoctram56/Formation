package modele;

import interfaces.IMatch;

public class Match implements IMatch {
	private String stade;
	private Equipe locaux;
	private Equipe visiteurs;
	private Integer butsLocaux;
	private Integer butsVisiteurs;

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(String stade, Equipe locaux, Equipe visiteurs, Integer butsLocaux, Integer butsVisiteurs) {
		super();
		this.stade = stade;
		this.locaux = locaux;
		this.visiteurs = visiteurs;
		this.butsLocaux = butsLocaux;
		this.butsVisiteurs = butsVisiteurs;

		locaux.majButsMarques(getButsLocaux());
		locaux.majButsEncaisses(getButsVisiteurs());
		visiteurs.majButsMarques(getButsVisiteurs());
		visiteurs.majButsEncaisses(getButsLocaux());

		if (butsLocaux > butsVisiteurs) {
			locaux.ajouterPoints(3);

		} else if (butsLocaux < butsVisiteurs) {

			visiteurs.ajouterPoints(3);

		} else if (butsLocaux == butsVisiteurs) {
			locaux.ajouterPoints(1);
			visiteurs.ajouterPoints(1);

		}

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

	public Integer getButsLocaux() {
		return butsLocaux;
	}

	public void setButsLocaux(Integer butsLocaux) {
		this.butsLocaux = butsLocaux;
	}

	public Integer getButsVisiteurs() {
		return butsVisiteurs;
	}

	public void setButsVisiteurs(Integer butsVisiteurs) {
		this.butsVisiteurs = butsVisiteurs;
	}

	@Override
	public String toString() {
		return "Match [stade=" + stade + ", locaux=" + locaux + ", visiteurs=" + visiteurs + ", butsLocaux="
				+ butsLocaux + ", butsVisiteurs=" + butsVisiteurs + "]";
	}

	@Override
	public void afficherResultas() {
		System.out.println(locaux.getNom() + " " + butsLocaux + " - " + butsVisiteurs + " " + visiteurs.getNom());

	}

}
