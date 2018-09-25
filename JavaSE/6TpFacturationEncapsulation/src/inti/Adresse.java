package inti;

public class Adresse {
	private Integer num;
	private String rue;
	private String ville;
	
	
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
	public Adresse() {
		super();
	}
	public Adresse(Integer num, String rue, String ville) {
		super();
		this.num = num;
		this.rue = rue;
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "Adresse [num=" + num + ", rue=" + rue + ", ville=" + ville + "]";
	}

	

}
