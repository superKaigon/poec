/**
 * @author Minet
 * 
 */
package imiepoecjava2017; // Peut être modifié pour bouger le fichier à une autre adresse.

import imiepoecjava2017.entities.Role;
import imiepoecjava2017.entities.User;

public class ImiePoecApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciate a new User.
		User monUser = new User();
		monUser.setFirstname("Jean-Louieon");
		monUser.getRoles().add(new Role(1, "role1"));
		monUser.getRoles().add(new Role(2, "role2"));
		System.out.println(monUser.getFirstname());
		System.out.println(monUser.toString());
	}

}
