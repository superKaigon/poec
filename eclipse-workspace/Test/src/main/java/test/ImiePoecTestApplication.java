/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author ludov
 *
 */
public class ImiePoecTestApplication { //  -> algorithme

	// ";" instruction de fin de ligne
	
	// Algo : déclaration variable entière
	// ENTIER : nomVar => int nomVar
	// Si fonction "static" mettre les varibles dans la fonction
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { // -> DEBUT
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Tapez votre message");
		String Message = in.nextLine(); 
		System.out.println("Choissisez votre patern");
		int choix = in.nextInt();
		int position = 0;
		
        switch (choix) {
			
	        case 1 : 
		        	String Ascii1 = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### \r\n" + 
				        			"# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # \r\n" + 
				        			"### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## \r\n" + 
				        			"# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       \r\n" + 
				        			"# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
					
					int [] codeascii = new int [Message.length()];
					String [] Row = Ascii1.split("\\r\\n"); 
					int L = Row[0].length()/27;
			        int H = Row.length;
					for (int i = 0; i < H; i++) {
		               for (int j = 0; j < Message.length(); j++){
		
		                   codeascii[j] = (int)Message.toUpperCase().charAt(j);
		                   position = (codeascii[j] - 65) * L;
		                   if ((codeascii[j]<65) || (codeascii[j]>122) || (( codeascii[j]>90)&&(codeascii[j]<97))){
		                       codeascii[j] = 63;
		                       position = (26) * L;
		                   }
		                   System.out.print(Row[i].substring(position, (position + L)));
		
		                   
		                }
		                System.out.println();
	                
	               
	            }
			 break;
				
	         case 2 : 
		        	String Ascii2 = "   _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _      _     _   \r\n" + 
		        			"  (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)  \r\n" + 
		        			"   / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\      / ._. \\   \r\n" + 
		        			" __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__  __\\( Y )/__ \r\n" + 
		        			"(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)(_.-/'-'\\-._)\r\n" + 
		        			"   || A ||      || B ||      || C ||      || D ||      || E ||      || F ||      || G ||      || H ||      || I ||      || J ||      || K ||      || L ||      || M ||      || N ||      || O ||      || P ||      || Q ||      || R ||      || S ||      || T ||      || U ||      || V ||      || W ||      || X ||      || Y ||      || Z ||      || ? ||   \r\n" + 
		        			" _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._ \r\n" + 
		        			"(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-`\\.-.)(.-./`-`\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)(.-./`-'\\.-.)\r\n" + 
		        			" `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-' ";
			
					codeascii = new int [Message.length()];
					Row = Ascii2.split("\\r\\n"); 
					L = Row[0].length()/27;
			        H = Row.length;
					for (int i = 0; i < H; i++) {
				       for (int j = 0; j < Message.length(); j++){
				
				           codeascii[j] = (int)Message.toUpperCase().charAt(j);
				           position = (codeascii[j] - 65) * L;
				           if ((codeascii[j]<65) || (codeascii[j]>122) || (( codeascii[j]>90)&&(codeascii[j]<97))){
				               codeascii[j] = 63;
				               position = (26) * L;
				           }
				           System.out.print(Row[i].substring(position, (position + L)));
				
				           
				        }
				        System.out.println();
				     }
			 break;
			
	         case 3 :
		        	codeascii = new int [Message.length()];
		        	L = (int)Math.floor(((Math.random()*4)%4) + 1);
			        H = (int)Math.floor(((Math.random()*5)%5) + 1);
					String [][] Row2 = new String [H][L*27];
					int x = 0;
					while (x < Message.length()) {	
						for (int i = 0; i < H; i++) {
						       for (int j = 0; j < L; j++){
						    	  int k = (int)Math.floor(((Math.random()*2)%2) + 1);
						    	  if (k == 1) {
						    		  Row2[i][j] = "@";
						    	  }else {
						    		  Row2[i][j] = " ";  
						    	  }
						    	 System.out.print(Row2[i][j]);
						       }
						} x++;
						System.out.println();
					}
					
	         break;
        }
          
	}
		//System.out.println(Message);
}// -> FIN

//}
