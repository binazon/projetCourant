package fr.binazon.projectNow17022019;

// Il sera preferrable que cette classe soit abstraite car un client c'est soit une entreprise avec son "numSIRET"
// ou un Particulier avec son "prenom"
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
