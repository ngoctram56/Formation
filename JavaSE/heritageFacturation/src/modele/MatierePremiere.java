package modele;

public final class MatierePremiere extends Article {
	private final int MARGE_MP = 7;

	public MatierePremiere() {
		super();

	}

	public MatierePremiere(Long id, String designation, Double prixUnitaire) {
		super(id, designation, prixUnitaire);

	}

	@Override
	public String toString() {
		return "MatierePremiere [MARGE_MP=" + MARGE_MP + ", id=" + id + ", designation=" + designation
				+ ", prixUnitaire=" + prixUnitaire + "]";
	}

	@Override
	public Double calculPrixVente() {
		return prixUnitaire + (prixUnitaire * MARGE_MP / 100);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + MARGE_MP;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatierePremiere other = (MatierePremiere) obj;
		if (MARGE_MP != other.MARGE_MP)
			return false;
		return true;
	}

	 
}
