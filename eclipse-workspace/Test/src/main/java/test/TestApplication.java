/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author ludov
 *
 */
public class TestApplication { //  -> algorithme


	
	/**
	 * @param args
	 */
	public static void main(String[] args) { // -> DEBUT
		
		Scanner lire = new Scanner (System.in);
		int rep;
		int bac[] = {1, 2, 3, 4};
		int concasseur[] = {1, 2};
		int grain[] = {10, 25, 12};
		while (true) {
			do {
				System.out.println("Sélectionnez votre boisson : \n"
						+ "1 : café \n"
						+ "2 : café long \n"
						+ "3 : café vanille \n"
						+ "4 : cappucino \n"
						+ "5 : chocolat \n"
						+ "6 : chococolat caramel \n"
						+ "7 : moca \n"
						+ "8 : thé");
				rep = lire.nextInt();
			}while (rep < 1 || rep >8);
			System.out.println("Votre boisson est en préparation");
			switch (rep) {
			case 1 : 
				System.out.println("Bac n° " + bac[0] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[0] + " sélectionné");
				System.out.println(grain[0] + " unités de grain moulu sont utilisés");
				System.out.println("Votre café est prêt");			
				break;
			case 2 : 
				System.out.println("Bac n° " + bac[0] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[0] + " sélectionné");
				System.out.println(grain[1] + " unités de grain moulu sont utilisés");
				System.out.println("Votre café long est prêt");	
				break;
			case 3 : 
				System.out.println("Bac n° " + bac[0] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[0] + " sélectionné");
				System.out.println(grain[0] + " unités de grain moulu sont utilisés");
				System.out.println("Votre café vanille est prêt");	
				break;
			case 4 : 
				System.out.println("Bac n° " + bac[0] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[0] + " sélectionné");
				System.out.println(grain[1] + " unités de grain moulu sont utilisés");
				System.out.println("Votre cappucino est prêt");	
				break;
			case 5 : 
				System.out.println("Bac n° " + bac[1] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[0] + " sélectionné");
				System.out.println(grain[1] + " unités de grain moulu sont utilisés");
				System.out.println("Votre chocolat est prêt");	
				break;
			case 6 : 
				System.out.println("Bac n° " + bac[1] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[0] + " sélectionné");
				System.out.println(grain[0] + " unités de grain moulu sont utilisés");
				System.out.println("Votre chocolat caramel est prêt");
				break;
			case 7 : 
				System.out.println("Bac n° " + bac[2] + " sélectionné");
				System.out.println("Concasseur n° " + concasseur[1] + " sélectionné");
				System.out.println(grain[1] + " unités de grain moulu sont utilisés");
				System.out.println("Votre moca est prêt");
				break;
			case 8 : 
				System.out.println("Bac n° " + bac[3] + " sélectionné");
				System.out.println(grain[2] + " unités de grain moulu sont utilisés");
				System.out.println("Votre thé est prêt");
				break;
			}
		}
	}
}
					

// -> FIN