package entities;

import java.util.ArrayList;

public class Company extends AppUser {

    private String company_name;
    private String adress;
    private String description;
    private String links;
    private String siret;
    private ArrayList<Post> posts;
	/**
     * Default constructor
     */
    public Company() {
    	this.role_appuser=2;
    }
	/**
	 * @return the company_name
	 */
	public String getCompany_name() {
		return company_name;
	}
	/**
	 * @param company_name the company_name to set
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the links
	 */
	public String getLinks() {
		return links;
	}
	/**
	 * @param links the links to set
	 */
	public void setLinks(String links) {
		this.links = links;
	}
	/**
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}
	/**
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}
	/**
	 * @return the posts
	 */
	public ArrayList<Post> getPosts() {
		return posts;
	}
	/**
	 * @param posts the posts to set
	 */
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}

    



}
