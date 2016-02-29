package demo.ddd.domaine.commande.entities;

import java.util.List;

import demo.ddd.domaine.commande.valuesobject.ICatalogue;
import demo.ddd.domaine.commande.valuesobject.IProduit;

public class Catalogue implements ICatalogue {

	private List<IProduit> produits;
	private String nom;

	public Catalogue() {
		super();
	}

	public Catalogue(List<IProduit> produits, String nom, int annee) {
		super();
		this.produits = produits;
		this.nom = nom;
	}

	@Override
	public List<IProduit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(IProduit p){
		produits.add(p);
	}

	@Override
	public void addQuantite(int qte, IProduit p){
		int index = produits.indexOf(p);
		IProduit prod = produits.get(index);
		prod.setQte(prod.getQte() + qte);
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Catalogue : produits=" + produits + "\nnom=" + nom;
	}

}
