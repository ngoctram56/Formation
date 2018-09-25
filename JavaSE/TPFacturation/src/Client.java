
public class Client {
	
	int rs ;
	Adresse adresse;
	
	
	
	public Client() {
		super();
	
	}



	public Client(int rs, Adresse adresse) {
		super();
		this.rs = rs;
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		return "Client [rs=" + rs + ", adresse=" + adresse + "]";
	}
	
	
	
	

}
