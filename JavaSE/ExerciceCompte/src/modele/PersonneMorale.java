package modele;

public class PersonneMorale extends Client {
	
	private String rs ;

	public PersonneMorale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonneMorale(Long id, String adresse, String rs) {
		super(id, adresse);
		this.rs = rs;
	}

	public String getRs() {
		return rs;
	}

	public void setRs(String rs) {
		this.rs = rs;
	}

	@Override
	public String toString() {
		return "PersonneMorale [rs=" + rs + ", id=" + id + ", adresse=" + adresse + "]";
	}
	
	
	


	
	
	 

}
