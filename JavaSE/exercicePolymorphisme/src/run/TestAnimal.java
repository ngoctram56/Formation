package run;

import modele.*;

public class TestAnimal {

	public static void main(String[] args) {

		Animal d = new Dog("chien"); // Objet Animal crée en instance Dog
		Animal c = new Cat("chat");
		Animal l = new Wolf("loup");

		Animal[] tab = { d, c, l };

		for (int i = 0; i < tab.length; i++) {

			tab[i].afficherDescription();
			if (tab[i] instanceof Dog) {

				((Dog) tab[i]).eat();

			}

			if (tab[i] instanceof Cat) {

				((Cat) tab[i]).sleep();

			}

			if (tab[i] instanceof Wolf) {

				((Wolf) tab[i]).roam();

			}

		}

		// ((Dog) d).eat() ;
		// ((Cat) c).sleep() ;
		// ((Wolf) l).roam() ;
	}

}
