package first_poo;

public class Lycee {
	
	String designation;
	String ville ;
	static int nbLycee =0; //valeur static
	
	
	public Lycee() {
		super();
		nbLycee++;
	
	}


	public Lycee(String designation, String ville) {
		super();
		this.designation = designation;
		this.ville = ville;
		nbLycee ++; //static
	}


	@Override
	public String toString() {
		return "Lycee [designation=" + designation + ", ville=" + ville + "]";
	}
	
	
	
	
	

}
