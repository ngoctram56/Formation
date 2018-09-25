package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Role {
	
	@Id
	@GeneratedValue
	private Long id ;
	
	private String Designation ;
	
	@OneToMany (mappedBy="role")
	List<RoleUtilisateur> liste = new ArrayList<>() ;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String designation) {
		super();
		Designation = designation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", Designation=" + Designation + "]";
	}
	
	
	

}
