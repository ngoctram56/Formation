package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Projet implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id ;
	private String designation ;
	@OneToMany (mappedBy="projet")
	List<ProjetConsultatnt> liste= new ArrayList<>() ;
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Projet(Long id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}


	public Projet(String designation) {
		super();
		this.designation = designation;
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


	@Override
	public String toString() {
		return "Projet [id=" + id + ", designation=" + designation + "]";
	}
	
	
	
	
	

}
