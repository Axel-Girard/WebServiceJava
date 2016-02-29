package demo.ddd.domaine.commande.valuesobject;

import java.util.List;


public interface ICatalogue {

	public List<IProduit> getProduits();

	public void addProduit(IProduit p);

	public void addQuantite(int qte, IProduit p);
	
	public String getNom();

	public void setNom(String nom);

	public String toString();

}
