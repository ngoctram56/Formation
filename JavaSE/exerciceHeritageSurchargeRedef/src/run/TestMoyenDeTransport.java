package run;
import modele.Voiture ;
import modele.Moto;
import modele.MoyenDeTransport;
import modele.VoitureDeLuxe;
import modele.MotoCross;


public class TestMoyenDeTransport {

	public static void main(String[] args) {
		
		
		Voiture v1 = new Voiture (123l, "rouge", true, 5, "renault", "modele1") ;
		VoitureDeLuxe v2 = new VoitureDeLuxe(123l, "gris", true, 10000, "marque 2", "modele2", 5,  12d) ;
		
		
		Moto m1 = new Moto (2l, "gris", true, 2) ;
		MotoCross m2 = new MotoCross(5l, "noire", false, 2, "rally4") ; 
		
		System.out.println(v1.TaxeApayer());
		
		System.out.println(v2.TaxeApayer());
		
		System.out.println(m1.TaxeApayer());
		
		System.out.println(m2.TaxeApayer());

	}

}
