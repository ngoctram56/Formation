package inti.formation;

public class DoubleTableau {

	public static void main(String[] args) {
		int [] [] tab2D = {{5,7,9,11}, {2,4,6,8}, {6,10,14,19}};
		
		for (int i = 0; i < tab2D.length; i++) {
			
			for (int j = 0; j < tab2D[i].length; j++) {
				
				System.out.println(tab2D[i][j]);
			}
			
			System.out.println();
			
		}

	}

}
