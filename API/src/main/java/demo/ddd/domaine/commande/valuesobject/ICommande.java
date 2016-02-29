package demo.ddd.domaine.commande.valuesobject;

import java.util.List;

public interface ICommande {

	public List<IProduit> getProduits();

	public void setProduits(List<IProduit> produits);

	public void ajouterProduit(IProduit p);

	public void retirerProduit(IProduit p);
}
