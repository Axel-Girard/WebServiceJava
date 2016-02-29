package demo.ddd.domaine.client.valuesobject;

import demo.ddd.domaine.commande.entities.IDCommande;

public interface IClient {

	public String getNom();

	public void setNom(String nom);

	public IDCommande getIDCommande();

	public void setIDCommande(IDCommande idcommande);
}
