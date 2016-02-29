package demo.ddd.domaine.commande.services;

import java.util.List;

import demo.ddd.domaine.client.valuesobject.IClient;
import demo.ddd.domaine.commande.valuesobject.IProduit;

public interface ICommandeService {

	void ajouterProduit(IClient c, IProduit p);

	void retirerProduit(IClient c, IProduit p);

	List<IProduit> afficherPagner(IClient c);

}
