package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_moto")
public class Moto extends MoyenTransport implements Serializable {

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(Long matricule, String couleur, Integer nbCV) {
		super(matricule, couleur, nbCV);
		// TODO Auto-generated constructor stub

	}

}
