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
		int time = (int)Math.floor(((Math.random()*5)%5) + 1);
		int i = -1;
		String rep = "N";
		do {
			time = (int)Math.floor(((Math.random()*5)%5) + 1);
			if (time >= i) {
				switch (time) {
					case 1 :
						System.out.println("Votre viande est bleu, voulez vous la laissez cuire ? O/N");
						rep = lire.nextLine();
						while (rep != "O" || rep != "N") {
							System.out.println("Je n'ai pas compris, Voulez vous lasser cuire votre viande ? O/N");
							rep = lire.nextLine();
							System.out.println(rep);
						}
						i = 1;
						break;
					case 2 :
						System.out.println("Votre viande est saignante, voulez vous la laissez cuire ?O/N");
						rep = lire.nextLine();
						while (rep != "O" || rep != "N") {
							System.out.println("Je n'ai pas compris, Voulez vous lasser cuire votre viande ? O/N");
							rep = lire.nextLine();
							System.out.println(rep);
						}
						i = 2;
						break;
					case 3 :
						System.out.println("Votre viande est cuite, voulez vous la laissez cuire O/N?");
						rep = lire.nextLine();
						while (rep != "O" || rep != "N") {
							System.out.println("Je n'ai pas compris, Voulez vous lasser cuire votre viande ? O/N");
							rep = lire.nextLine();
							System.out.println(rep);
						}
						i = 3;
						break;
					case 4 :
						System.out.println("Votre viande est à point, voulez vous la laissez cuire ?");
						rep = lire.nextLine();
						while (rep != "O" || rep != "N") {
							System.out.println("Je n'ai pas compris, Voulez vous lasser cuire votre viande ? O/N");
							rep = lire.nextLine();
							System.out.println(rep);
						}
						i = 4;
						break;
					case 5 :
						System.out.println("Votre viande est brulée, désolé");
						rep = "N";
						break;
				}
			}
		}while (rep == "O");	
		
		System.out.println("Bon appétit");
	}
}
					

// -> FIN