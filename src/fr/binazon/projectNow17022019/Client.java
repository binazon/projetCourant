package fr.binazon.projectNow17022019;

public class Client {
	private String nom;
	private String adresse;
	public Client(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
