package run;



import entities.Moto;
import entities.Voiture;
import service.MotoService;
import service.VoitureService;

public class TestMain {

	public static void main(String[] args) {

		VoitureService voitureSer = new VoitureService();
		MotoService motoSer= new MotoService();

		Voiture v1 = new Voiture(1234l, "couleur1", 1000, "options1");
		Voiture v2 = new Voiture(5678l, "couleur2", 2000, "options2");

		Moto m1 = new Moto(1122l, "couleur11", 2000);
		Moto m2 = new Moto(2233l, "couleur22", 1000);

		voitureSer.create(v1);
		voitureSer.create(v2);

		System.out.println(voitureSer.findAllHQL());
		System.out.println(voitureSer.findSQL()) ;
		motoSer.create(m1);
		motoSer.create(m2);

		System.out.println(motoSer.findOneHQL(1122l));
		System.out.println(motoSer.findOneSQL(2233l));
		
		

	}

}
