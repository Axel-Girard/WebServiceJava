package demo.ddd.application;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.ddd.domaine.cb.services.IDomaineService;

/**
 */
@WebService(endpointInterface="demo.ddd.application.IApplication")
public class Application implements IApplication {

	@Resource
	IDomaineService service;

	final static Logger LOG = LoggerFactory.getLogger(Application.class);

	public boolean validerPaiement(String numCard, Double price, Integer crytogramme, String date){
		boolean resultat = false;

		try {
			service.validerPaiement(numCard, price, crytogramme, date);
			resultat =true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultat;
	}

}
