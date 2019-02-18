package fr.binazon.projectNow17022019;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import fr.binazon.projectNow17022019.Produit;
import fr.binazon.projectNow17022019.Client;

public class Facture {
	private int numero;
	private Date date;
	private List<Produit> produits;
	private Client client;
	
	
	public Facture() {
		super();
	}
	public Facture(int numero, Date date) {
		super();
		this.numero = numero;
		this.date = date;
		produits = new ArrayList<Produit>();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void addProduit(Produit produit) {
		produits.add(produit);
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public float montantHT() {
		int prixHT =0;
		for(int i=0; i<produits.size(); i++) {
			prixHT+=produits.get(i).getPrixHT();
		}
		return prixHT;
	}
	public float montantTTC() {
		int prixTTC =0;
		for(int i=0; i<produits.size(); i++) {
			prixTTC+=produits.get(i).prixTTC();
		}
		return prixTTC;
	}
	public void ajouter(Produit p) {
		produits.add(p);
	}
	public void supprimer(Produit p) {
		List<Produit> listSecour = new ArrayList<>();
		for(int i=0; i<produits.size();i++) {
			if(produits.get(i).equals(p)) continue;
			else listSecour.add(produits.get(i));
		}
		for(int i=0; i<produits.size();i++) {
			produits.get(i).setCode(listSecour.get(i).getCode());
			produits.get(i).setLibelle(listSecour.get(i).getLibelle());
			produits.get(i).setPrixHT(listSecour.get(i).getPrixHT());
		}
	}
}