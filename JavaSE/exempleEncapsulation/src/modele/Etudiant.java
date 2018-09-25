package modele;

import java.util.Arrays;

public class Etudiant {

	private String matricule;
	private int age;
	private Boolean majeur;
	private double[] notes;
	private Boolean admis;

	public Etudiant() {
		super();

	}

	public Etudiant(String matricule, int age, double[] notes) {
		super();
		this.matricule = matricule;
		this.age = age;
		this.notes = notes;

	}

	// Constructeurs

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getMajeur() {
		return majeur;
	}

	public void setMajeur(Boolean majeur) {
		this.majeur = majeur;
	}

	public double[] getNotes() {
		return notes;
	}

	public void setNotes(double[] notes) {
		this.notes = notes;
	}

	public Boolean getAdmis() {
		return admis;
	}

	public void setAdmis(Boolean admis) {
		this.admis = admis;
	}

	// Moyenne
	public double moyenne() {

		double somme = 0;

		for (int i = 0; i < notes.length; i++) {

			somme += notes[i];

		}

		return somme / notes.length;

	}

	// Tableau etudiant

	public static void afficher(Etudiant[] etudiant) {

		for (int i = 0; i < etudiant.length; i++) {

			System.out.println(etudiant[i]);

		}
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", age=" + age + ", majeur=" + majeur + ", notes="
				+ Arrays.toString(notes) + ", admis=" + admis + "]";
	}

}
