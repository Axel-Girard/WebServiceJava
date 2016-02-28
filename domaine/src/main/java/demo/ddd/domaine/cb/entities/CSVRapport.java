package demo.ddd.domaine.cb.entities;

import demo.ddd.domaine.ec.Rapport;

import java.util.ArrayList;
import java.util.List;

public class CSVRapport implements Rapport {
	List<LigneDeRapport> ligneDeRapports = new ArrayList<LigneDeRapport>();

	public void add(LigneDeRapport ligneDeRapport) {
		this.ligneDeRapports.add(ligneDeRapport);
	}




	@Override
	public List getData() {

		return this.ligneDeRapports;
	}

}
