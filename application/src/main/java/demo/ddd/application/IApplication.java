package demo.ddd.application;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IApplication {
	@WebMethod
	public boolean validerPaiement(String numCard, Double price,
			Integer crytogramme, String date);
}
