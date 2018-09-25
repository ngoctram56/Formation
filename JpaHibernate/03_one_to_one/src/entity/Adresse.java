package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_Adresse")
public class Adresse implements Serializable {

	@Id
	@GeneratedValue
	private long idAdresse;

	private int num;

	private String rue;

	private String codePostal;
	@OneToOne(mappedBy = "adresse"  ) // dans le cas d // une relation bi-directionnelle //
									// bi-directionnelle
	private Employe emp;

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse(int num, String rue, String codePostal) {
		super();
		this.num = num;
		this.rue = rue;
		this.codePostal = codePostal;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public long getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(long idAdresse) {
		this.idAdresse = idAdresse;
	}

	public Employe getEmp() {
		return emp;
	}

	public void setEmp(Employe emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", num=" + num + ", rue=" + rue + ", codePostal=" + codePostal
				+ " ]";
	}

}
