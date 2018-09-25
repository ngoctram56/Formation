package exerciceException;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Boolean repeter = true;


		
		while (repeter == true) {

			try {

				
				System.out.println("Entrer un entier : ");
			
				sc = new Scanner(System.in); //reinitialisation du scanner 
				Integer nb = sc.nextInt();
				System.out.println(nb);
				repeter = false;


			} catch (Exception e) {

				e.printStackTrace();

			

				System.out.println("Veuillez saisir un entier ");

			}

			finally {

				if (repeter == false) {

					sc.close();
					System.out.println("fermeture scanner");

				}

			}

		}

	}

}
