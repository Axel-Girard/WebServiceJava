package demo.ddd.domaine.commander.services;

import java.util.List;

import demo.ddd.domaine.client.entities.Client;
import demo.ddd.domaine.commande.services.ICommandeService;
import demo.ddd.domaine.commande.valuesobject.IProduit;


public class CommandeService implements ICommandeService {

	@Override
	public void ajouterProduit(Client c, IProduit p) {
		c.getIDCommande().getCommande().ajouterProduit(p);
	}

	@Override
	public void retirerProduit(Client c, IProduit p) {
		c.getIDCommande().getCommande().retirerProduit(p);
	}

	@Override
	public void passerCommande(Client c) {
		
	}

	@Override
	public List<IProduit> afficherPagner(Client c) {
		return c.getIDCommande().getCommande().getProduits();
	}

}
