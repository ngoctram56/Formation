
package entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity 
@DiscriminatorValue("mot")
public class Moto extends MoyenDeTransport implements Serializable {
	

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(Long matricule, String couleur, Integer nbCV) {
		super(matricule, couleur, nbCV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [matricule=" + matricule + ", couleur=" + couleur + ", nbCV=" + nbCV + "]";
	}
	
	

}
