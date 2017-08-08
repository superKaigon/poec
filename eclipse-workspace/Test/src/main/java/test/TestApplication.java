/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author ludov
 *
 */
public class TestApplication { // > algorithme

	/**
	 * @param args
	 */
	public static void main(String[] args) { // > DEBUT
		int cle;
		String message;
		char tab[];
		int i;
		Scanner lire = new Scanner(System.in);
		System.out.println("Tapez le message que vous voulez crypté");
		message = lire.nextLine();
		// System.out.println("Tapez votre clé de cryptage");
		cle = CallIntMessage(lire, 0, 90000, "Tapez votre clé de cryptage");
		tab = message.toCharArray();
		int codeMessage[] = new int[message.length()];
		for (i = 0; i < (message.length()); i++) {
			codeMessage[i] = (int) tab[i] * (int) tab[i] - (int) tab[i] + cle;
			System.out.println(codeMessage[i]);
		}
		for (i = 0; i < codeMessage.length; i++) {
			//System.out.println(codeMessage[i]);
			for (int j = 0; j < 128; j++) {				
				if ((j * j - j + cle) == codeMessage[i]) {
					
					System.out.print((char)j);
				}
			}
		}
		//System.out.println(messageDecode[i]);
	}

	public static int CallIntMessage(Scanner scan, int valMin, int valMax, String message) {

		int result;
		do {
			System.out.println(message);
			while (!scan.hasNextInt())
				scan.next();
			while (!scan.hasNextInt())
				scan.next();

			result = scan.nextInt();
		} while (result > valMax || result < valMin);

		return result;
	}

}

// > FIN