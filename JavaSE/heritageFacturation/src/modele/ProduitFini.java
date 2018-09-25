package modele;

public final class ProduitFini extends Article {

	private final int MARGE_PF = 15;
	private String emballage;

	public ProduitFini() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProduitFini(Long id, String designation, Double prixUnitaire, String emballage) {
		super(id, designation, prixUnitaire);
		this.emballage = emballage;
	}

	public String getEmballage() {
		return emballage;
	}

	public void setEmballage(String emballage) {
		this.emballage = emballage;
	}

	@Override
	public String toString() {
		return "ProduitFini [MARGE_PF=" + MARGE_PF + ", emballage=" + emballage + ", id=" + id + ", designation="
				+ designation + ", prixUnitaire=" + prixUnitaire + "]";
	}

	@Override
	public Double calculPrixVente() {
		return prixUnitaire + (prixUnitaire * MARGE_PF / 100);
	}

}
