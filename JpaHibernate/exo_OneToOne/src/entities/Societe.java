package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Societe implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer id ;
	private String designation ;
	@OneToMany(mappedBy = "societe", fetch=FetchType.LAZY)
	List<Employe> list = new ArrayList<>() ;
	
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Societe(Integer id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}

	public Societe(String designation) {
		super();
		this.designation = designation;
	}
	
	
	

	public Societe(Integer id, String designation, List<Employe> list) {
		super();
		this.id = id;
		this.designation = designation;
		this.list = list;
	}

	public Societe(String designation, List<Employe> list) {
		super();
		this.designation = designation;
		this.list = list;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	
	

}
