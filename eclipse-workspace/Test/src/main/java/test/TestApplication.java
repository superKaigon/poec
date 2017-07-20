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
		
		Scanner lire = new Scanner (System.in);
		int JOUEUR1 = 0;
		int JOUEUR2 = 5;
		int JOUEUR3 = 10;
		int DEGAT = 0;
		int PAU = 1;
		int ARMURE = 2;
		int PV = 3;
		int PA = 4;
		int EQUIPE = 1;
		int OUT = -1;
		int NBJOUEUR = 3;
		int NBATTRIBUT = 5;


		int[] joueurs = new int [NBATTRIBUT*NBJOUEUR];
		int ii;
		int jj;
		int choix;
		int adversaire;
		int paCourant;
		boolean process = true;

		jj = 0;
		for (ii = 0; ii < NBATTRIBUT*NBJOUEUR; ii += NBATTRIBUT) {
			jj = jj + 1;

			do {
				System.out.println("Choix arme perso " + jj);
				System.out.println("1 concasseur");
				System.out.println("2 pelle");
				System.out.println("3 gatling");
				System.out.println("4 batte de cricket");
				System.out.println("5 blaster");

				choix = lire.nextInt();

			}while(choix < 1 || choix > 5);
			switch (choix ) {
				case 1 :
						joueurs[ii+DEGAT] = 3;
						joueurs[ii+PAU] = 4;
						break;
				case 2 :
						joueurs[ii+DEGAT] = 2;
						joueurs[ii+PAU] = 1;
						break;
				case 3 :
						joueurs[ii+DEGAT] = 10;
						joueurs[ii+PAU] = 6;
						break;
				case 4 :
						joueurs[ii+DEGAT] = 1;
						joueurs[ii+PAU] = 1;
						break;
				case 5 :
						joueurs[ii+DEGAT] = 6;
						joueurs[ii+PAU] = 3;
						break;
			}
			choix = OUT;

			do {
				System.out.println("Choix armure perso " + jj);
				System.out.println("0 aucune armue");
				System.out.println("1 gil&& bleu");
				System.out.println("2 armure de cuir");
				System.out.println("3 armure de plaque");

				choix = lire.nextInt();

			}while(choix < 0 || choix > 3);
			switch (choix) {
				case 0 :
						joueurs[ii+ARMURE] = 0;
						break;
				case 1 :
						joueurs[ii+ARMURE] = 1;
						break;
				case 2 :
						joueurs[ii+ARMURE] = 2;
						break;
				case 3 :
						joueurs[ii+ARMURE] = 4;
						break;
				default :
						break;
			}
			
			
			choix = OUT;

			do {
				System.out.println("Choix PV perso " + jj);

				choix = lire.nextInt();
			} while(choix < 0 || choix > 20);
			joueurs[ii+PV] = choix;
	
			choix = OUT;

			do {
				System.out.println("Choix PA perso " + jj);

				choix = lire.nextInt();
			}

			while(choix < 0 || choix > 20); 
			joueurs[ii+PA] = choix;
			choix = OUT;
		}
			
		

		while (process) {
			for (ii = 0; ii < (NBATTRIBUT*NBJOUEUR); ii += NBATTRIBUT) {
				if (joueurs[ii+PV] > 0) {
					adversaire = OUT;
				
					jj = ii;
					do {
						jj = jj + NBATTRIBUT;
						if(jj > (NBATTRIBUT*NBJOUEUR)) {
							jj = 0;
						}
					}while (joueurs[jj+PV] <= 0 && jj != ii);

					if (jj != ii) {
							adversaire = jj;						
					}
					if (adversaire != OUT) {
						paCourant = joueurs[ii+PA];
						paCourant = paCourant - 1;
						while (((paCourant - joueurs[ii+PAU]) >= 0) && process) {
							if (joueurs[adversaire+PV] > 0) {
								if ((joueurs[adversaire+ARMURE] - joueurs[ii+DEGAT]) < 0 ) {
									joueurs[adversaire+PV] = joueurs[adversaire+PV] + joueurs[adversaire+ARMURE] - joueurs[ii+DEGAT];
								}	
								paCourant = paCourant - joueurs[ii+PAU];
								}else {
									adversaire = OUT;
								}
								
									jj = ii;
									do {
										jj = jj + NBATTRIBUT;
										if(jj >= (NBATTRIBUT*NBJOUEUR)) {
										jj = 0;
										}
									}while (joueurs[jj+PV] >= 0 && jj != ii);
				
									if (jj != ii) {
										adversaire = jj;
												}						
									if (adversaire == OUT) {
										process = false;
									}
						}
					}else {
							System.out.println("Fini !");
							process = false;
					}
				}
			}
		}
	}
}
					

// -> FIN