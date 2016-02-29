package demo.ddd.domaine.client.entities;

import demo.ddd.domaine.client.valuesobject.IClient;
import demo.ddd.domaine.commande.entities.IDCommande;

public class Client implements IClient {

	private String nom;
	private IDCommande idcommande;

	public Client(){
		super();
		idcommande = new IDCommande();
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
	public IDCommande getIDCommande() {
		return idcommande;
	}
	@Override
	public void setIDCommande(IDCommande idcommande) {
		this.idcommande = idcommande;
	}
}
