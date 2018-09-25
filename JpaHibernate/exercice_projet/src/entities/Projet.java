package entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="t_projet")
public class Projet {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id ;
	private String designation ;
	private String client ;
	@Temporal(value=TemporalType.DATE)
	private Date date_debut ;
	@Temporal(value=TemporalType.TIME)
	private Date heure_debut ;
	@Temporal(value=TemporalType.DATE)
	private Date date_fin ;
	@Temporal(value=TemporalType.TIME)
	private Date heure_fin ;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date date_creation ;
	@Column(nullable=false)
	private Double cout ;
	
	
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Projet(Long id, String designation, String client, Date date_debut, Date heure_debut, Date date_fin,
			Date heure_fin, Date date_creation, Double cout) {
		super();
		this.id = id;
		this.designation = designation;
		this.client = client;
		this.date_debut = date_debut;
		this.heure_debut = heure_debut;
		this.date_fin = date_fin;
		this.heure_fin = heure_fin;
		this.date_creation = date_creation;
		this.cout = cout;
	}




	public Projet(String designation, String client, Date date_debut, Date heure_debut, Date date_fin, Date heure_fin,
			Date date_creation, Double cout) {
		super();
		this.designation = designation;
		this.client = client;
		this.date_debut = date_debut;
		this.heure_debut = heure_debut;
		this.date_fin = date_fin;
		this.heure_fin = heure_fin;
		this.date_creation = date_creation;
		this.cout = cout;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public String getClient() {
		return client;
	}




	public void setClient(String client) {
		this.client = client;
	}




	public Date getDate_debut() {
		return date_debut;
	}




	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}




	public Date getHeure_debut() {
		return heure_debut;
	}




	public void setHeure_debut(Date heure_debut) {
		this.heure_debut = heure_debut;
	}




	public Date getDate_fin() {
		return date_fin;
	}




	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}




	public Date getHeure_fin() {
		return heure_fin;
	}




	public void setHeure_fin(Date heure_fin) {
		this.heure_fin = heure_fin;
	}




	public Date getDate_creation() {
		return date_creation;
	}




	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}




	public Double getCout() {
		return cout;
	}




	public void setCout(Double cout) {
		this.cout = cout;
	}




	@Override
	public String toString() {
		return "Projet [id=" + id + ", designation=" + designation + ", client=" + client + ", date_debut=" + date_debut
				+ ", heure_debut=" + heure_debut + ", date_fin=" + date_fin + ", heure_fin=" + heure_fin
				+ ", date_creation=" + date_creation + ", cout=" + cout + "]";
	}
	
	
	
	
	
	
	

}
