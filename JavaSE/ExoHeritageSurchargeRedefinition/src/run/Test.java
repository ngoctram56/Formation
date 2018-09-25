package run;

import model.Moto;
import model.MotoCross;
import model.MoyenTransport;
import model.Voiture;
import model.VoitureDeLuxe;

public class Test {

	public static void main(String[] args) {

		Voiture v1 = new Voiture(3, "jaune", true, 4, "Audi", "Q2");
		VoitureDeLuxe vl1 = new VoitureDeLuxe(4, "noir", false, 9, "Ferrari", "California", 7, 100000d);

		Moto mo1 = new Moto(2, "gris", true, 2);
		MotoCross motc = new MotoCross(5, "gris", true, 2, "rally Paris-Dakar");
		System.out.println(v1.taxeAPayer());
		System.out.println(vl1.taxeAPayer());

		System.out.println(mo1.taxeAPayer());
		System.out.println(motc.taxeAPayer());
		System.out.println(motc.taxeAPayer(2500));

	}
}
