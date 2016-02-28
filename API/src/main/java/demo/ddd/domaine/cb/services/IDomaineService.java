package demo.ddd.domaine.cb.services;


public interface IDomaineService {

	void validerPaiement(String numCard, Double price, Integer crytogramme, String date) throws Exception;

}
