package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Adresse implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id ;
	
	private Integer num ;
	private String rue ;
	private String ville ;
	
	@OneToOne (mappedBy="adresse")
	private Client client ;

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

public Adresse(Integer num, String rue, String ville) {
	super();
	this.num = num;
	this.rue = rue;
	this.ville = ville;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Integer getNum() {
	return num;
}

public void setNum(Integer num) {
	this.num = num;
}

public String getRue() {
	return rue;
}

public void setRue(String rue) {
	this.rue = rue;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

@Override
public String toString() {
	return "Adresse [id=" + id + ", num=" + num + ", rue=" + rue + ", ville=" + ville + "]";
}




	
	

}
