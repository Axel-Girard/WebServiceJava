package demo.ddd.application.exceptions;

public class SecuriteException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -291592808092915311L;

	String codeErreur;
	String messageMetier;
	
	public SecuriteException(Exception ex,String codeErreur,String messageMetier) {
		super(ex.getCause());
		this.codeErreur = codeErreur;
		this.messageMetier = messageMetier;
	}
	
	
	
	public String getMessageCodeErreur() {
		// TODO Auto-generated method stub
		return this.codeErreur;
	}

	public String getMessageMetier() {
		// TODO Auto-generated method stub
		return this.messageMetier;
	}

}
