package demo.ddd.domaine.commander.services;

import java.util.List;

import demo.ddd.domaine.client.valuesobject.IClient;
import demo.ddd.domaine.commande.services.ICommandeService;
import demo.ddd.domaine.commande.valuesobject.IProduit;

public class CommandeService implements ICommandeService {

	@Override
	public void ajouterProduit(IClient c, IProduit p) {
		c.getIDCommande().getCommande().ajouterProduit(p);
	}

	@Override
	public void retirerProduit(IClient c, IProduit p) {
		c.getIDCommande().getCommande().retirerProduit(p);
	}

	@Override
	public List<IProduit> afficherPagner(IClient c) {
		return c.getIDCommande().getCommande().getProduits();
	}

}
