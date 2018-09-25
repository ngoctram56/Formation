package inti.formation;

import java.util.Scanner;

public class ExerciceMoisSwitch {

	public static void main(String[] args) {

		System.out.println("Veuillez saisir votre chiffre compris entre 1 et 12");
		Scanner sc = new Scanner(System.in); //n
		int mois =sc.nextInt();
		
		switch (mois) {
		case 1:
			System.out.println("janvier");
			break;
		case 2:
			System.out.println("fevrier");
			break;
		case 3:
			System.out.println("mars");
			break;
		case 4:
			System.out.println("avril");
			break;
		case 5:
			System.out.println("mai");
			break;
		case 6:
			System.out.println("juin");
			break;
		case 7:
			System.out.println("juillet");
			break;
		case 8:
			System.out.println("aout");
			break;
		case 9:
			System.out.println("septembre");
			break;
		case 10:
			System.out.println("octobre");
			break;
		case 11:
			System.out.println("novembre");
			break;
		case 12:
			System.out.println("decembre");
			break;

		default:
			System.out.println("chiffre non valide");
			break;
		}

//		if (mois==1) {System.out.println("janvier");
//		}
//
//		else if (mois==2) {
//
//			System.out.println("fevrier");
//		}
//		else if (mois==3) {
//
//			System.out.println("mars");
//		}
//		
//		else if (mois==4) {
//
//			System.out.println("avril");
//		}
//		else if (mois==5) {
//
//			System.out.println("mai");
//		}
//		else if (mois==6) {
//
//			System.out.println("juin");
//		}
//		else if (mois==7) {
//
//			System.out.println("juillet");
//		}
//		else if (mois==8) {
//
//			System.out.println("aout");
//		}
//		
//		else if (mois==9) {
//
//			System.out.println("septembre");
//		}
//		else if (mois==10) {
//
//			System.out.println("octobre");
//		}
//		else if (mois==11) {
//
//			System.out.println("novembre");
//		}
//		else if (mois==12) {
//
//			System.out.println("decembre");
//		}
//		
//		else { System.out.println("erreur");
//	}
	}
}
