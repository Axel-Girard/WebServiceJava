package demo.ddd.domaine.commande.entities;

import demo.ddd.domaine.commande.valuesobject.IProduit;

public class Produit implements IProduit {

	private String nom;
	private double prix;
	private int qte;

	Produit(){
		super();
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
	public double getPrix() {
		return prix;
	}

	@Override
	public void setPrix(double total) {
		this.prix = total;
	}

	@Override
	public int getQte() {
		return qte;
	}

	@Override
	public void setQte(int qte) {
		this.qte = qte;
	}
}
