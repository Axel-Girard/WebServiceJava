package demo.ddd.domaine.cb.services;

import demo.ddd.domaine.cb.exceptions.FunctionalException;
import demo.ddd.domaine.cb.rg.RegleGestion;
import demo.ddd.domaine.cb.services.IDomaineService;

public class Service implements IDomaineService {
	RegleGestion rg = new RegleGestion();

	@Override
	public void validerPaiement(String numCard, Double price,
			Integer crytogramme, String date) throws Exception {
		try{
			rg.isCardOk(numCard,crytogramme,date);
			treatmentCard(price, numCard );
		}catch(FunctionalException ex){
			throw ex;
		}
	}

	public void treatmentCard(Double price, String numCard) {
		
	}

}
