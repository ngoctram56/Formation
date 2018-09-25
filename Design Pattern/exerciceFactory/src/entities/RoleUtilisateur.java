package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Adaming
 *
 */
@Entity
@Table(name="roleUti")
public class RoleUtilisateur {
	
	
	@Id
	@GeneratedValue
	private Long id ;
	
	@ManyToOne
	private Role role ;
	
	@ManyToOne
	private Utilisateur utilisateur ;
	
	
	@Temporal(value = TemporalType.DATE)
	private Date dateAffectation ;


	public RoleUtilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RoleUtilisateur(Role role, Utilisateur utilisateur, Date dateAffectation) {
		super();
		this.role = role;
		this.utilisateur = utilisateur;
		this.dateAffectation = dateAffectation;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Date getDateAffectation() {
		return dateAffectation;
	}


	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}


	@Override
	public String toString() {
		return "RoleUtilisateur [id=" + id + ", role=" + role + ", utilisateur=" + utilisateur + ", dateAffectation="
				+ dateAffectation + "]";
	}
	
	
	
	

}
