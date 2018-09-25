package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class ProjetConsultatnt implements Serializable{
	
	
	@Id
	@GeneratedValue
	private Long id ;
	@ManyToOne
	private Projet projet;
	@ManyToOne
	private Consultant consultant;
	
	@Temporal(value = TemporalType.DATE)
	private Date date ;
	
	
	public ProjetConsultatnt() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public ProjetConsultatnt(Long id, Projet projet, Consultant consultant, Date date) {
		super();
		this.id = id;
		this.projet = projet;
		this.consultant = consultant;
		this.date = date;
	}
	
	





	public ProjetConsultatnt(Projet projet, Consultant consultant, Date date) {
		super();
		this.projet = projet;
		this.consultant = consultant;
		this.date = date;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Projet getProjet() {
		return projet;
	}


	public void setProjet(Projet projet) {
		this.projet = projet;
	}


	public Consultant getConsultant() {
		return consultant;
	}


	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}





	@Override
	public String toString() {
		return "ProjetConsultatnt [id=" + id + ", projet=" + projet + ", consultant=" + consultant + ", date=" + date
				+ "]";
	}



	
	
	
	
	

}
