package fr.binazon.projectNow17022019;

public class Entreprise extends Client {
	private int numSIRET;
	public Entreprise(String nom, String adresse, int numSIRET) {
		super(nom, adresse);
		this.numSIRET = numSIRET;
	}

	public Entreprise() {
		super();
	}

	public Entreprise(String nom, String adresse) {
		super(nom, adresse);
	}

	public int getNumSIRET() {
		return numSIRET;
	}

	public void setNumSIRET(int numSIRET) {
		this.numSIRET = numSIRET;
	}
	
	
}
