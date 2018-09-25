package modele;

public class Joueur {
	
	private Long matriculeFifa ;
	private Integer age ;
	private String poste ;
	private Double salaire ;
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Joueur(Long matriculeFifa, Integer age, String poste, Double salaire) {
		super();
		this.matriculeFifa = matriculeFifa;
		this.age = age;
		this.poste = poste;
		this.salaire = salaire;
	}


	public Long getMatriculeFifa() {
		return matriculeFifa;
	}


	public void setMatriculeFifa(Long matriculeFifa) {
		this.matriculeFifa = matriculeFifa;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}


	public Double getSalaire() {
		return salaire;
	}


	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}


	@Override
	public String toString() {
		return "Joueur [matriculeFifa=" + matriculeFifa + ", age=" + age + ", poste=" + poste + ", salaire=" + salaire
				+ "]";
	}
	
	
	
	
	

}
