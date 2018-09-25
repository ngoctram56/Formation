package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPAReTMENT")
public class Departement {
  
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "DPT_ID")
   private long id;

   @Column(name = "NAME", nullable = false, unique = true)
   private String name;
   
   @OneToMany(mappedBy="department", fetch=FetchType.LAZY)
   private List<Employe> employes=new ArrayList<>();

public Departement() {
	super();
	// TODO Auto-generated constructor stub
}

public Departement(long id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Departement(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "Departement [id=" + id + ", name=" + name + "]";
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Employe> getEmployes() {
	return employes;
}

public void setEmployes(List<Employe> employes) {
	this.employes = employes;
}



}
