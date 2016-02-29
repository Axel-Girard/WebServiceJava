package demo.ddd.domaine.commande.entities;

import demo.ddd.domaine.commande.valuesobject.IIDCommande;

public class IDCommande implements IIDCommande{

	private double id;
	private Commande commande;

	public IDCommande(){
		super();
		id = Math.random() * 10000;
		commande = new Commande(null);
	}

	@Override
	public double getId() {
		return id;
	}

	@Override
	public Commande getCommande() {
		return commande;
	}

	@Override
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}
