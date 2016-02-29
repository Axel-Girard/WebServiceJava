package demo.ddd.domaine.client.entities;

import demo.ddd.domaine.client.valuesobject.IClient;
import demo.ddd.domaine.commande.entities.IDCommande;
import demo.ddd.domaine.commande.valuesobject.IIDCommande;

public class Client implements IClient {

	private String nom;
	private IIDCommande idcommande;

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
	public IIDCommande getIDCommande() {
		return idcommande;
	}
	@Override
	public void setIDCommande(IIDCommande idcommande) {
		this.idcommande = idcommande;
	}
}
