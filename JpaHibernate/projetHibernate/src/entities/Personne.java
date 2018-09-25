package entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Personne {

	@Id
	@GeneratedValue
	protected Long id;
	
	@Temporal(value=TemporalType.DATE)
	protected Date dateCreation  ;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(Long id, Date dateCreation) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
	}

	public Personne(Date dateCreation) {
		super();
		this.dateCreation = dateCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", dateCreation=" + dateCreation + "]";
	}
	
	
	

}
