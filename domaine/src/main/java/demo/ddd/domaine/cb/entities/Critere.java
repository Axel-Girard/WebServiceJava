package demo.ddd.domaine.cb.entities;

import demo.ddd.domaine.ec.valuesobject.ICritere;

public class Critere implements ICritere {

	private String idBank;
	private String idUser;
	private String cp;
	private boolean isCREDone;

	public Critere(String idBank,String idUser,String CP,boolean creDone) {
		this.idBank = idBank;
		this.idUser=idUser;
		this.cp=CP;
		this.isCREDone=creDone;
	}

	@Override
	public String getBank() {
		return this.idBank;
	}

	@Override
	public String getUser() {
		return this.idUser;
	}

	@Override
	public String getCP() {
		return this.cp;
	}

	@Override
	public boolean isCREDone() {
		return this.isCREDone;
	}

}
