package demo.ddd.domaine.commande.valuesobject;

public interface IIDCommande {

	public double getId();

	public ICommande getCommande();

	public void setCommande(ICommande commande);
}
