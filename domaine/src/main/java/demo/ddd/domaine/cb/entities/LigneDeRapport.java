package demo.ddd.domaine.cb.entities;

public class LigneDeRapport {

	String idBanque = null;
	Integer nbUtilisationAppEC = 0;
	boolean CRE = false;

	public LigneDeRapport(String idBanque, Integer nbUtilisationAppEC, boolean CRE) {
		this.idBanque = idBanque;
		this.nbUtilisationAppEC = nbUtilisationAppEC;
		this.CRE = CRE;
	}

	public String getIdBanque() {
		return idBanque;
	}

	public Integer getNbUtilisationAppEC() {
		return this.nbUtilisationAppEC;
	}

	public boolean getCRE() {
		return this.CRE;
	}

}
