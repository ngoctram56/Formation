package college;

import java.util.Date;

public class Enseignant extends Personne {
	private Date datePriseFonction;
	private int indice;
	private Matiere matiere;
	private Departement departement;

	public Enseignant() {
		super();
	}

	public Enseignant(String nom, String prenom, String tel, String mail, Date datePriseFonction, int indice,
			Matiere matiere, Departement departement) {
		super(nom, prenom, tel, mail);
		this.datePriseFonction = datePriseFonction;
		this.indice = indice;
		this.matiere = matiere;
		this.departement = departement;

		departement.getEnseignant().add(this);

	}

	public Date getDatePriseFonction() {
		return datePriseFonction;
	}

	public void setDatePriseFonction(Date datePriseFonction) {
		this.datePriseFonction = datePriseFonction;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Enseignant [datePriseFonction=" + datePriseFonction + ", indice=" + indice + ", nom=" + nom
				+ ", prenom=" + prenom + ", tel=" + tel + ", mail=" + mail + "]";
	}

}
