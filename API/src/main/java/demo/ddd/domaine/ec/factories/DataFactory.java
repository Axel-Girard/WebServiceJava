package demo.ddd.domaine.ec.factories;

import java.util.List;

import demo.ddd.domaine.ec.Rapport;
import demo.ddd.domaine.ec.exceptions.DomaineException;
import demo.ddd.domaine.ec.repositories.Repository;
import demo.ddd.domaine.ec.valuesobject.ICritere;
import demo.ddd.domaine.ec.valuesobject.IData;
import demo.ddd.domaine.ec.valuesobject.ILog;


public interface DataFactory <TechnicalException extends DomaineException, FunctionalException  extends DomaineException > {

	IData getData(String eventType,String idCompte, String typeMouvement, String montant, String commentaire, String identifiantUniqueLignemouvement, String source)throws TechnicalException,FunctionalException ;
	Rapport getData(String tableName,String familly, List<String> qualifers)throws TechnicalException,FunctionalException ;
	ILog mkLigneLogAxWay(String line)throws TechnicalException,FunctionalException ;
	Rapport getCsv() throws TechnicalException,FunctionalException ;
	Rapport getCsv(Repository<ILog, TechnicalException, FunctionalException> repo, ICritere critere)
			throws DomaineException, DomaineException;
}
