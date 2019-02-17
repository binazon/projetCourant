package fr.binazon.projectNow17022019;

// Y a t'il un tauxTVA pour des catégories de produits ?
// Si l'idée était de prévoir un changement de ce taux, alors il serait necessaire de mettre cette propriété dans un fichier de configuration
public class TypeProduit {
	private String libelle;
	private float tauxTVA;
	/**
	 * @param libelle
	 * @param tauxTVA
	 */
	public TypeProduit(String libelle, float tauxTVA) {
		super();
		this.libelle = libelle;
		this.tauxTVA = tauxTVA;
	}
	/**
	 * 
	 */
	public TypeProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public float getTauxTVA() {
		return tauxTVA;
	}
	public void setTauxTVA(float tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
}
