package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "t_projet") // si on ne spécifie pas il créé une table avec le nom de la classe
public class Projet implements Serializable {
	@Id // clé primaire
	@GeneratedValue // pour générer automatiquement l'iD
	private Long id;

	@Transient //pour empecher la serialisation
	private String designation;
	@Column(length = 50)
	private String client;
	// @Column(name="prenom_employe",length=50, nullable=false, unique=true)
	// private String prenom;
	@Temporal(value = TemporalType.DATE) // pour définir une colonne de type Date (3 choix différents)
	private Date dateDebut;
	@Temporal(value = TemporalType.TIME)
	private Date heureDebut;
	@Temporal(value = TemporalType.DATE)
	private Date dateFin;
	@Temporal(value = TemporalType.TIME)
	private Date heureFin;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dateCreation;
	@Column
	private Double cout;

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projet(String designation, String client, Date dateDebut, Date heureDebut, Date dateFin, Date heureFin,
			Date dateCreation, Double cout) {
		super();
		this.designation = designation;
		this.client = client;
		this.dateDebut = dateDebut;
		this.heureDebut = heureDebut;
		this.dateFin = dateFin;
		this.heureFin = heureFin;
		this.dateCreation = dateCreation;
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Double getCout() {
		return cout;
	}

	public void setCout(Double cout) {
		this.cout = cout;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Projet [id=" + id + ", designation=" + designation + ", client=" + client + ", dateDebut=" + dateDebut
				+ ", heureDebut=" + heureDebut + ", dateFin=" + dateFin + ", heureFin=" + heureFin + ", dateCreation="
				+ dateCreation + ", cout=" + cout + "]";
	}

}
