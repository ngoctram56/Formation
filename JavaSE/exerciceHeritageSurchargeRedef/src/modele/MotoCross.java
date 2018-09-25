package modele;
 
//final pour empecher l'héritage
public final class MotoCross extends Moto {
	
	private String rally ;

	public MotoCross() {
		super();
	
	}

	public MotoCross(Long matricule, String couleur, Boolean assurance, int nbRoues, String rally) {
		super(matricule, couleur, assurance, nbRoues);
		this.rally = rally;
	}

	public String getRally() {
		return rally;
	}

	public void setRally(String rally) {
		this.rally = rally;
	}
	
	
	public double TaxeAPayer(double extra) {
		
		return 1000.0 + extra ;
	}
	
	

	@Override
	public String toString() {
		return "MotoCross [rally=" + rally + ", matricule=" + matricule + ", couleur=" + couleur + ", assurance="
				+ assurance + "]";
	}
	
	
	
	

}
