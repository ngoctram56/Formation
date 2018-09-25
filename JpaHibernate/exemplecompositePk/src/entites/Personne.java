package entites;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_personne")
public class Personne implements Serializable{
	
	@EmbeddedId
	private PersonnePK clePersonne ;
	private int age ;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(PersonnePK clePersonne, int age) {
		super();
		this.clePersonne = clePersonne;
		this.age = age;
	}

	public PersonnePK getClePersonne() {
		return clePersonne;
	}

	public void setClePersonne(PersonnePK clePersonne) {
		this.clePersonne = clePersonne;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [clePersonne=" + clePersonne + ", age=" + age + "]";
	}
	
	
	
	
	

}
