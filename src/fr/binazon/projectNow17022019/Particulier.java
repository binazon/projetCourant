package fr.binazon.projectNow17022019;

public class Particulier extends Client {
	private String prenom;

	public Particulier(String nom, String adresse, String prenom) {
		super(nom, adresse);
		this.prenom = prenom;
	}

	/**
	 * 
	 */
	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param adresse
	 */
	public Particulier(String nom, String adresse) {
		super(nom, adresse);
		// TODO Auto-generated constructor stub
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
