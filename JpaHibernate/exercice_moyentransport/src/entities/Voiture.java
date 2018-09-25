package entities;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="t_voiture")
public class Voiture extends MoyenTransport implements Serializable {
	
	private String options ;
	@Embedded	
	private FicheInfo fiches ;
	
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voiture(Long matricule, String couleur, Integer nbCV) {
		super(matricule, couleur, nbCV);
		// TODO Auto-generated constructor stub
	}
	public Voiture(Long matricule, String couleur, Integer nbCV, String options, FicheInfo fiches) {
		super(matricule, couleur, nbCV);
		this.options = options;
		this.fiches = fiches;
	}
	public Voiture(String options, FicheInfo fiches) {
		super();
		this.options = options;
		this.fiches = fiches;
	}
	
	
	public String getOptions() {
		return options;
	}
	public void setOptions(String options) {
		this.options = options;
	}
	public FicheInfo getFiches() {
		return fiches;
	}
	public void setFiches(FicheInfo fiches) {
		this.fiches = fiches;
	}
	@Override
	public String toString() {
		return "Voiture [options=" + options + ", fiches=" + fiches + "]";
	}
	
	
	
	
	
	

}
