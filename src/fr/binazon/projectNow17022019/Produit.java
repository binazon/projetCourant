package fr.binazon.projectNow17022019;


public class Produit {
	private String code;
	private String libelle;
	private float prixHT;
	private TypeProduit typeProduit;
	/**
	 * 
	 */
	public Produit() {
		super();
	}

	/**
	 * @param code
	 * @param libelle
	 * @param prixHT
	 */
	public Produit(String code, String libelle, float prixHT) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prixHT = prixHT;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(float prixHT) {
		this.prixHT = prixHT;
	}
	public TypeProduit getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(TypeProduit typeProduit) {
		this.typeProduit = typeProduit;
	}
	public float prixTTC() {
		return prixHT+typeProduit.getTauxTVA();
	}
}