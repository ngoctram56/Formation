package entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
@Table(name="t_transport")
public class MoyenTransport {
	
	@Id
	protected Long matricule ;
	protected String couleur ;
	protected Integer nbCV ;
	
	
	public MoyenTransport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MoyenTransport(Long matricule, String couleur, Integer nbCV) {
		super();
		this.matricule = matricule;
		this.couleur = couleur;
		this.nbCV = nbCV;
	}


	public Long getMatricule() {
		return matricule;
	}


	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public Integer getNbCV() {
		return nbCV;
	}


	public void setNbCV(Integer nbCV) {
		this.nbCV = nbCV;
	}


	@Override
	public String toString() {
		return "MoyenTransport [matricule=" + matricule + ", couleur=" + couleur + ", nbCV=" + nbCV + "]";
	}
	
	
	
	
	

}
