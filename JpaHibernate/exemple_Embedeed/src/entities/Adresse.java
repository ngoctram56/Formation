package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private Integer num ;
	private String rue ;
	private String ville ;
	
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Adresse(Integer num, String rue, String ville) {
		super();
		this.num = num;
		this.rue = rue;
		this.ville = ville;
	}


	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Adresse [num=" + num + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	
	
	

}
