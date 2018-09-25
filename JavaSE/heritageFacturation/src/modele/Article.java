package modele;

public abstract class Article {
	protected Long id;
	protected String designation;
	protected Double prixUnitaire;

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(Long id, String designation, Double prixUnitaire) {
		super();
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire + "]";
	}

	public abstract Double calculPrixVente();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prixUnitaire == null) ? 0 : prixUnitaire.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (prixUnitaire == null) {
			if (other.prixUnitaire != null)
				return false;
		} else if (!prixUnitaire.equals(other.prixUnitaire))
			return false;
		return true;
	}
	
	
	
}
