package demo.ddd.domaine.commande.entities;

import demo.ddd.domaine.commande.valuesobject.ICommande;
import demo.ddd.domaine.commande.valuesobject.IIDCommande;

public class IDCommande implements IIDCommande{

	private double id;
	private ICommande commande;

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
	public ICommande getCommande() {
		return commande;
	}

	@Override
	public void setCommande(ICommande commande) {
		this.commande = commande;
	}
}
