/**
 * 
 */
package imiepoecjava2017.entities;

/**
 * @author Minet
 *
 */
public class Role {
	private long id;
	private String name;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Role() {
		
	}

	public Role(long id, String name) {	
		// TODO Auto-generated constructor stub
		this.setId(id);;
		this.setName(name);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
	
	
}
