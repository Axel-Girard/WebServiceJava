package demo.ddd.domaine.fournir.services;

import java.util.List;

import demo.ddd.domaine.commande.valuesobject.IProduit;

public interface IFournirService {

	void commanderProduit(IProduit p, int qte);

	List<IProduit> afficherListe();

}
