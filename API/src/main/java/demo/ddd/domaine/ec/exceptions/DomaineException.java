package demo.ddd.domaine.ec.exceptions;

public abstract class DomaineException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7953769446432687297L;


	public DomaineException(Throwable cause) {
		super(cause);
	}

	public String getMessageLog() {
		return getMessageCodeErreur() +"\n" + getMessageMetier();
	}

	public abstract String getMessageCodeErreur();
	public abstract String getMessageMetier();

}