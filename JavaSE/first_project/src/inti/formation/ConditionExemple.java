package inti.formation;

import java.util.Scanner;

public class ConditionExemple {

	public static void main(String[] args) {
	
		System.out.println("Veuillez saisir votre note");
		Scanner sc=new Scanner (System.in); 
		
		double note ;
		
		note=sc.nextDouble(); 
		System.out.println("La note saisie est " + note);
		
		if ( note >= 0 && note <10) { 
			System.out.println("refusé");
		}
		
		else if (note >=10 && note <=20) {
			System.out.println("admis");
		}
		
		else {
			System.out.println("note non valide");
		}

}
	
}
