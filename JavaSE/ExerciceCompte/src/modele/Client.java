package modele;

public class Client {
	
	protected Long id ;
	protected String adresse ;
	
	
	public Client() {
		super();

	}


	public Client(Long id, String adresse) {
		super();
		this.id = id;
		this.adresse = adresse;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", adresse=" + adresse + "]";
	}
	
	
	
	
	

}
