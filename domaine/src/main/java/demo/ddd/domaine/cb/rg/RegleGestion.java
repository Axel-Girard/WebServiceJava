package demo.ddd.domaine.cb.rg;

import demo.ddd.domaine.cb.exceptions.FunctionalException;

public class RegleGestion implements RG {
	public void isCardOk(String numCard, Integer crytogramme, String date)
			throws FunctionalException {
		if (isNumCardValid(numCard) && isDateCardValid(date)) {
			throw new FunctionalException();
		}
	}

	private boolean isDateCardValid(String date) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean isNumCardValid(String numCard) {
		return !numCard.contentEquals("123456");
	}

}
