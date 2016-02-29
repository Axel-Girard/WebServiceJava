package demo.ddd.domaine.fournir.services;

import java.util.List;

import demo.ddd.domaine.commande.valuesobject.IProduit;

public class FournirService implements IFournirService {

	@Override
	public void commanderProduit(IProduit p, int qte) {
		// TODO Auto-generated method stub
		// Dire au fournisseur qu'on choisit d'acheter se produit 'qte' fois
	}

	@Override
	public List<IProduit> afficherListe() {
		// TODO Auto-generated method stub
		// Faire appel aux fournisseur pour qu'il nous donne la liste des produits qu'il vend
		return null;
	}

}
