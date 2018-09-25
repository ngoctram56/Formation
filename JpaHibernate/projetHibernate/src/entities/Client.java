package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Client extends Personne implements Serializable {
	
	
	
	private Integer raisonSociale ;
	
	@OneToOne(cascade= CascadeType.ALL)
	private Adresse adresse ;
	
	@OneToMany (mappedBy ="client")
	List<Facture> liste = new ArrayList<>() ;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Date dateCreation) {
		super(dateCreation);
		// TODO Auto-generated constructor stub
	}

	public Client(Long id, Date dateCreation) {
		super(id, dateCreation);
		// TODO Auto-generated constructor stub
	}




	public Client(Date dateCreation, Integer raisonSociale, Adresse adresse) {
		super(dateCreation);
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
	}

	public Integer getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(Integer raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return "Client [raisonSociale=" + raisonSociale + ", adresse=" + adresse + ", id=" + id + ", dateCreation="
				+ dateCreation + "]";
	}



	
	


	

	

}
