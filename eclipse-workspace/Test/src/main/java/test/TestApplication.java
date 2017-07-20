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
		
		int jasmine = 7;
		int aladin = 5;
		int panierCommun = jasmine + aladin;
		
		Scanner lire = new Scanner(System.in);
		System.out.print("nombre de pomme pour Jasmine ");
		jasmine = lire.nextInt();
		System.out.print("nombre de pomme pour Aladin ");
		aladin = lire.nextInt();
		panierCommun = jasmine + aladin;
		lire.close();
		
		// Algo : Ecrire()
		System.out.print("Le total est " + panierCommun);

	}
}// -> FIN