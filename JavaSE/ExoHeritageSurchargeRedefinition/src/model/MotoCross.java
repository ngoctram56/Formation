package model;
//final pour empêcher l héritage
public  final class MotoCross extends Moto {

	private String rally;

	public MotoCross() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotoCross(double matricule, String couleur, Boolean assure, Integer nbRoues, String rally) {
		super(matricule, couleur, assure, nbRoues);
		this.rally = rally;
	}

	public String getRally() {
		return rally;
	}

	public void setRally(String rally) {
		this.rally = rally;
	}

	@Override
	public String toString() {
		return "MotoCross [rally=" + rally + ", matricule=" + matricule + ", couleur=" + couleur + ", assure=" + assure
				+ "]";
	}
	public double taxeAPayer() {
		return 1000 ;
	}
	public double taxeAPayer(double extra) {
		return 1000 + extra;
	}

}
