package demo.ddd.domaine.commande.services;

import java.util.List;

import demo.ddd.domaine.client.entities.Client;
import demo.ddd.domaine.commande.valuesobject.IProduit;

public interface ICommandeService {

	void ajouterProduit(Client c, IProduit p);

	void retirerProduit(Client c, IProduit p);
	
	void passerCommande(Client c);
	
	List<IProduit> afficherPagner(Client c);
}
