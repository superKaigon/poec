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

	// Insertion d'une constante
	public final static int TAILLE_J1 = 10;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { // -> DEBUT
		
		int taillej1 = 10;
		// Tableau à une dimension
		int[] joueur1 = new int[TAILLE_J1];
		// Tableau à une dimension
		int[][] joueur2 = new int[20][10];

		
		//POUR devient for
		for (int i = 0; i < joueur1.length; i++) {
			joueur1[i] = i;
			}
		for (int i = 0; i < joueur1.length; i++) {
			System.out.print(joueur1[i]);		
			}
		
		System.out.println();
		
		for (int i = joueur1.length - 1; i >= 0; i--) {
			System.out.print(joueur1[i]);
			}
		
		System.out.println();
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				joueur2[i][j] = i * j;
				System.out.print(joueur2[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		boolean flag = true;
		int k = 0;
		// boucle TANTQUE
		while(flag) {
			System.out.println("Coucou " + k);
			if (k == 10) {
				flag = false;
			} 
			k = k + 1; // k++
		}
		k = 0;
		flag = true;
		// boucle FAIRE TANTQUE
		do {
			System.out.println("Coucou2 " + k);
		if (k == 10) {
			flag = false;
		}
		k = k + 1;
		}while(flag);
		
		// boucle SELON 
		switch (k) {
		case 10 : 
			System.out.println("k10 = " + k);
			break;
		case 9 : 
			System.out.println("k9 = " + k);
			break;
		default:
			System.out.println("k = " + k);
			break;
		}
	}
}
// -> FIN