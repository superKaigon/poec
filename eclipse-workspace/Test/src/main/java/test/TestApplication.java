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
				System.out.println("S�lectionnez votre boisson : \n"
						+ "1 : caf� \n"
						+ "2 : caf� long \n"
						+ "3 : caf� vanille \n"
						+ "4 : cappucino \n"
						+ "5 : chocolat \n"
						+ "6 : chococolat caramel \n"
						+ "7 : moca \n"
						+ "8 : th�");
				rep = lire.nextInt();
			}while (rep < 1 || rep >8);
			System.out.println("Votre boisson est en pr�paration");
			switch (rep) {
			case 1 : 
				System.out.println("Bac n� " + bac[0] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[0] + " s�lectionn�");
				System.out.println(grain[0] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre caf� est pr�t");			
				break;
			case 2 : 
				System.out.println("Bac n� " + bac[0] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[0] + " s�lectionn�");
				System.out.println(grain[1] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre caf� long est pr�t");	
				break;
			case 3 : 
				System.out.println("Bac n� " + bac[0] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[0] + " s�lectionn�");
				System.out.println(grain[0] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre caf� vanille est pr�t");	
				break;
			case 4 : 
				System.out.println("Bac n� " + bac[0] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[0] + " s�lectionn�");
				System.out.println(grain[1] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre cappucino est pr�t");	
				break;
			case 5 : 
				System.out.println("Bac n� " + bac[1] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[0] + " s�lectionn�");
				System.out.println(grain[1] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre chocolat est pr�t");	
				break;
			case 6 : 
				System.out.println("Bac n� " + bac[1] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[0] + " s�lectionn�");
				System.out.println(grain[0] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre chocolat caramel est pr�t");
				break;
			case 7 : 
				System.out.println("Bac n� " + bac[2] + " s�lectionn�");
				System.out.println("Concasseur n� " + concasseur[1] + " s�lectionn�");
				System.out.println(grain[1] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre moca est pr�t");
				break;
			case 8 : 
				System.out.println("Bac n� " + bac[3] + " s�lectionn�");
				System.out.println(grain[2] + " unit�s de grain moulu sont utilis�s");
				System.out.println("Votre th� est pr�t");
				break;
			}
		}
	}
}
					

// -> FIN