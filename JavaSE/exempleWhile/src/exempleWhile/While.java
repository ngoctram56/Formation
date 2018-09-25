package exempleWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Long notes =null;
		
		do {
		System.out.println("Veuillez saisir votre note ");
		Scanner sc = new Scanner(System.in) ;
		notes = sc.nextLong() ;
		
		
		}
		
		while(notes >20 || notes<0 ) ;
		


	}

}
