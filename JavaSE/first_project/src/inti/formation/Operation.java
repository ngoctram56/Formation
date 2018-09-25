package inti.formation;

public class Operation {

	public static void main(String[] args) {
		String chaine1="ab";
		String chaine2="cd";
		String chaine3 =chaine1;
		chaine1=chaine2 ;
		chaine2=chaine3;
		
		System.out.println("La chaine 1 devient : " + chaine1  + " la chaine 2 devient : " + chaine2);
	}
}
