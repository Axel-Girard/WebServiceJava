package demo.ddd.application.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

import demo.ddd.domaine.cb.exceptions.DomaineException;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7778577609325573283L;
	String codeErreur;
	String messageMetier;

	public <T extends DomaineException> ApplicationException(T e) {
		super(e.getCause());
		this.codeErreur = e.getMessageCodeErreur();
		this.messageMetier = e.getMessageMetier();
	}
	public  ApplicationException(SecuriteException e) {
		super(e.getCause());
		this.codeErreur = e.getMessageCodeErreur();
		this.messageMetier = e.getMessageMetier();
	}
	public ApplicationException(FileNotFoundException e) {
		super(e.getCause());
		this.codeErreur = "XXXX:fichier non trouvé ou ouvert";
		this.messageMetier = e.getMessage();
	}
	public ApplicationException(IOException e) {
		super(e.getCause());
	}
	public String getMessageToLog() {

		return traitementMessage(this.codeErreur, this.messageMetier);
	}

	private String traitementMessage(String codeErreur, String messageMetier) {
		// TODO Auto-generated method stub
		return codeErreur + " " + messageMetier;
	}

}
