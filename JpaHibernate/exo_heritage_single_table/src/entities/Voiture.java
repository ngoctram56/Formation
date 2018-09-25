package entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("voit")
public class Voiture extends MoyenDeTransport implements Serializable {
	
	private String options ;
	

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(Long matricule, String couleur, Integer nbCV) {
		super(matricule, couleur, nbCV);
		// TODO Auto-generated constructor stub
	}

	public Voiture(Long matricule, String couleur, Integer nbCV, String options) {
		super(matricule, couleur, nbCV);
		this.options = options;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "Voiture [options=" + options + ", getMatricule()=" + getMatricule() + ", getCouleur()=" + getCouleur()
				+ ", getNbCV()=" + getNbCV() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	


	
	
	
	
	

}
