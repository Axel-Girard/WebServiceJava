package demo.ddd.domaine.cb.rg;


public interface RG <FunctionalException extends Exception>{
	void isCardOk(String numCard, Integer crytogramme, String date) throws FunctionalException;
}
