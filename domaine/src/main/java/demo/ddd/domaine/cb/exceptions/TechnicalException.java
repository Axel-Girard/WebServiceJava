package demo.ddd.domaine.cb.exceptions;

import demo.ddd.domaine.ec.exceptions.DomaineException;

public class TechnicalException extends DomaineException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3802879856432011217L;
	private String codeErreur = null;
	private String explicationMetier = null;
	

	
	public TechnicalException(Exception ex,String codeErreur,String messageMetier) {
		super(ex.getCause());
		this.codeErreur = codeErreur;
		this.explicationMetier = messageMetier;
	}
	
	
	public String getMessageCodeErreur() {
		// TODO Auto-generated method stub
		return this.codeErreur;
	}

	public String getMessageMetier() {
		// TODO Auto-generated method stub
		return this.explicationMetier;
	}

	

}
