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

	// ";" instruction de fin de ligne
	
	// Algo : déclaration variable entière
	// ENTIER : nomVar => int nomVar
	// Si fonction "static" mettre les varibles dans la fonction
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { // -> DEBUT
			Scanner lire = new Scanner (System.in);
			int chiffre1;
			int chiffre2;
			int result;
			System.out.println("Choississez un entier");
			chiffre1 = lire.nextInt();
			System.out.println("Choississez un entier");
			chiffre2 = lire.nextInt();
			if (chiffre1 == chiffre2 ) {
				result = chiffre1 + chiffre2;
				System.out.println(result);				
			}else if ((chiffre1 < 0) && (chiffre2 >= 0)) {
				result = chiffre1 * chiffre2;
				System.out.println(result);
			}else if (
					((chiffre1 < 0) && (chiffre2 < 0))||((chiffre1 < 0) && (chiffre2 < 0)) && 
					((chiffre1 <= -10)||(chiffre2 <= -10)||(chiffre1 >= 10)||(chiffre2 >= 10))){
				result = chiffre1 / chiffre2;
				System.out.println(result);
		}

	}
}
// -> FIN