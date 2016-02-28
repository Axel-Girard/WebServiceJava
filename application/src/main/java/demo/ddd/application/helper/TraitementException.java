package demo.ddd.application.helper;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import demo.ddd.application.exceptions.ApplicationException;
import demo.ddd.application.exceptions.SecuriteException;
import demo.ddd.domaine.cb.exceptions.DomaineException;

public class TraitementException {
	final static Logger LOG = LoggerFactory.getLogger(TraitementException.class);
	
	public <T extends DomaineException> void traitementException(T e) throws ApplicationException {
		// Traitement de l'excpetion et remonté de l'exception à l'appellant
		ApplicationException appException = new ApplicationException(e);
		LOG.error(appException.getMessageToLog());
		throw appException;
	}

	
	public void traitementException(SecuriteException e) throws ApplicationException {
		// Traitement de l'excpetion et remonté de l'exception à l'appellant

		ApplicationException appException = new ApplicationException(e);
		LOG.error(appException.getMessageToLog());

		throw appException;
	}


	public void traitementException(FileNotFoundException e) throws ApplicationException {
		// Traitement de l'excpetion et remonté de l'exception à l'appellant

				ApplicationException appException = new ApplicationException(e);
				LOG.error(appException.getMessageToLog());

				throw appException;
		
	}


	public void traitementException(IOException e) throws ApplicationException {
		// Traitement de l'excpetion et remonté de l'exception à l'appellant

				ApplicationException appException = new ApplicationException(e);
				LOG.error(appException.getMessageToLog());

				throw appException;
		
	}
}
