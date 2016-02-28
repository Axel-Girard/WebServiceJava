package demo.ddd.domaine.ec.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import demo.ddd.domaine.ec.exceptions.DomaineException;

import demo.ddd.domaine.ec.valuesobject.ICritere;
import demo.ddd.domaine.ec.valuesobject.IData;
import demo.ddd.domaine.ec.valuesobject.IEvent;
import demo.ddd.domaine.ec.valuesobject.ILog;

public interface Repository<T extends ILog,TechnicalException extends  DomaineException, FunctionalException extends DomaineException> {

	void sendEvent(IEvent<IData> event);

	BigDecimal getIndicateur(ICritere critere)  throws TechnicalException, FunctionalException;
	void put(T data, String tableName) throws TechnicalException, FunctionalException;

	IData getData(String name, String idCompte, String typeMouvement, String montant, String commentaire,
			String identifiantUniqueLignemouvement, String source) throws TechnicalException, FunctionalException;

	 List<Map<String, String>> getData(String tableName,String familly, List<String> qualifers) throws TechnicalException, FunctionalException;

	



}
