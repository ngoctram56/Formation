package entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;




@Entity
@Table(name="t_transport")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="grade",discriminatorType=DiscriminatorType.STRING)
public class MoyenDeTransport {
	

	@Id
	protected Long matricule ;
	protected String couleur ;
	protected Integer nbCV ;
	
	
	public MoyenDeTransport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MoyenDeTransport(Long matricule, String couleur, Integer nbCV) {
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
