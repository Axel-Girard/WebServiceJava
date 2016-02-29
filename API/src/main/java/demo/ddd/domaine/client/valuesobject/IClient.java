package demo.ddd.domaine.client.valuesobject;

import demo.ddd.domaine.commande.valuesobject.IIDCommande;

public interface IClient {

	public String getNom();

	public void setNom(String nom);

	public IIDCommande getIDCommande();

	public void setIDCommande(IIDCommande idcommande);
}
