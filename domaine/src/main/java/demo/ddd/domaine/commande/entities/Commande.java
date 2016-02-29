package demo.ddd.domaine.commande.entities;

import java.util.List;

import demo.ddd.domaine.commande.valuesobject.ICommande;
import demo.ddd.domaine.commande.valuesobject.IProduit;

public class Commande implements ICommande{

	private List<Produit> produits;

	public Commande(List<Produit> produits) {
		super();
		this.produits = produits;
	}

	@Override
	public List<IProduit> getProduits() {
		return produits;
	}

	@Override
	public void setProduits(List<IProduit> produits) {
		this.produits = produits;
	}

	@Override
	public void ajouterProduit(IProduit p) {
		produits.add(p);
	}

	@Override
	public void retirerProduit(IProduit p) {
		if(produits.contains(p)){
			produits.remove(p);
		}
	}
}
