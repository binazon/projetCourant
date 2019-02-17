package fr.binazon.projectNow17022019;

// il ya un couplage fort entre TypeProduit et Produit, donc faufdrai songer à appliquer le principe d'inversion de dépendances
// Produit est ouvert au modification, pourtant il ne devrait pas l'etre.
public class Produit {
	private String code;
	private String libelle;
	private float prixHT;
	// "typeProduit" n'est instancié null part, donc y aura sans doute un NullPointerException à l'éxecution
	private TypeProduit typeProduit;
	/**
	 * 
	 */
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
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
	
	// revoir cette méthode
	// si le tauxTVA est uniforme pour n'importe quel produit, alors on n'aura pas besoin de "TypeProduit" dans cette classe
	// La classe qui definira la tauxTva lira dans un fichier de config et devra etre un Singleton
	public float prixTTC() {
		return prixHT+typeProduit.getTauxTVA();
	}
}
