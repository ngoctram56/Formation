package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Facture implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Temporal(value = TemporalType.DATE)
	private Date dateFacture;

	@ManyToOne(cascade = CascadeType.ALL)
	Client client;

	@ManyToOne(cascade = CascadeType.ALL)
	Commercial commercial;

	@OneToMany(mappedBy = "facture")
	List<LigneFacture> liste ;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(Long id, Date dateFacture) {
		super();
		this.id = id;
		this.dateFacture = dateFacture;
	}

	public Facture(Date dateFacture) {
		super();
		this.dateFacture = dateFacture;
	}

	public Facture(Date dateFacture, Client client, Commercial commercial) {
		super();
		this.dateFacture = dateFacture;
		this.client = client;
		this.commercial = commercial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	

	public List<LigneFacture> getListe() {
		return liste;
	}

	public void setListe(List<LigneFacture> liste) {
		this.liste = liste;
	}

	@Override
	public String toString() {
		return "Facture [id=" + id + ", dateFacture=" + dateFacture + ", client=" + client + ", commercial="
				+ commercial + "]";
	}

}
