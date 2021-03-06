/**
 * 
 */
package imiepoecjava2017.entities;

import java.util.ArrayList;

/**
 * This class is an entity that represents a element extract from the real.
 * 
 * Une classe poss�de une liste de fields et de mothods et un fields poss�de un type.
 * 
 * Dans l'arborescence d'un classe, il faut : 
 * Les attributs, 
 * les getters et setters,
 * les constructeurs, 
 * les overides des fonctions, 
 * les methodes
 * @author Minet
 *
 */
public class User {
	private long id;
	private String firstname;
	private String lastname;
	private String login;
	private String password;
	private ArrayList<Role> roles;
	
	/**
	 * Alt+Shift+S generate getters and setters
	 */
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}



	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}



	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}



	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the roles
	 */
	public ArrayList<Role> getRoles() {
		return roles;
	}



	/**
	 * @param roles the roles to set
	 */
	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}



	/**
	 * Empty constructor (created by default if no other describe).
	 */
	public User() {
		this.roles = new ArrayList<Role>();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", login=" + login
				+ ", password=" + password + ", roles=" + roles + "]";
	}




	
}
