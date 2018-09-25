package entities;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_client")
public class Client implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id ;
	@Embedded
	private Adresse adresse ;
	private Integer raison_sociale ;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(Long id, Adresse adresse, Integer raison_sociale) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.raison_sociale = raison_sociale;
	}


	public Client(Adresse adresse, Integer raison_sociale) {
		super();
		this.adresse = adresse;
		this.raison_sociale = raison_sociale;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public Integer getRaison_sociale() {
		return raison_sociale;
	}


	public void setRaison_sociale(Integer raison_sociale) {
		this.raison_sociale = raison_sociale;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", adresse=" + adresse + ", raison_sociale=" + raison_sociale + "]";
	}
	
	
	
	

}
