package fr.binazon.projectNow17022019.test;


import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import fr.binazon.projectNow17022019.Client;
import fr.binazon.projectNow17022019.Facture;
import fr.binazon.projectNow17022019.Particulier;
import fr.binazon.projectNow17022019.Produit;
import fr.binazon.projectNow17022019.TypeProduit;

class TestApplication1 {
	private Produit produit1;
	private Produit produit2;
	private TypeProduit typeProduit1;
	private TypeProduit typeProduit2;
	private Client client1;
	private Facture facture;
	
	@Before
	void setUp() throws Exception {
		client1 = new Particulier("nzuguem", "kevin");
		produit1 = new Produit();
		produit2 = new Produit();
		typeProduit1 = new TypeProduit();
		typeProduit2 = new TypeProduit();
		facture = new Facture(1, new Date());
		
		
		produit1.setTypeProduit(typeProduit1);
		produit1.setTypeProduit(typeProduit2);
		produit2.setTypeProduit(typeProduit1);
		facture.setClient(client1);
		facture.addProduit(produit1);
		facture.addProduit(produit2);
	}

	@Test
	void Test() {
		
	}

}
