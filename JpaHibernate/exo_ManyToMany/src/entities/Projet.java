package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Projet implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id ;
	private String designation ;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable (name="affectation_projet_consultant",
	joinColumns = @JoinColumn(name="projet"), inverseJoinColumns = @JoinColumn(name="consultant"))
	List<Consultant>consultants = new ArrayList<>() ;
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Projet(Long id, String designation, List<Consultant> consultants) {
		super();
		this.id = id;
		this.designation = designation;
		this.consultants = consultants;
	}


	public Projet(String designation, List<Consultant> consultants) {
		super();
		this.designation = designation;
		this.consultants = consultants;
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


	public List<Consultant> getConsultants() {
		return consultants;
	}


	public void setConsultants(List<Consultant> consultants) {
		this.consultants = consultants;
	}


	@Override
	public String toString() {
		return "Projet [id=" + id + ", designation=" + designation + ", consultants=" + consultants + "]";
	}
	
	
	
	
	
	
	

}
