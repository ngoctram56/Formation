package modele;

public class Client {

	// Attributs
	protected Integer id;
	protected String adresse;

	// Constructeur
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Integer id, String adresse) {
		super();
		this.id = id;
		this.adresse = adresse;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	// Methodes
	// toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", adresse=" + adresse + "]";
	}

}
