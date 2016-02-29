package demo.ddd.domaine.commande.valuesobject;

import demo.ddd.domaine.commande.entities.Commande;

public interface IIDCommande {

	public double getId();

	public Commande getCommande();

	public void setCommande(Commande commande);
}
