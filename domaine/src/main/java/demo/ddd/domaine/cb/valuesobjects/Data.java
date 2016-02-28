package demo.ddd.domaine.cb.valuesobjects;

import demo.ddd.domaine.ec.valuesobject.IData;

public class Data implements IData {

	String value;
	String metadata;

	public Data(String value,String metaData) {
		this.value = value;
		this.metadata = metaData;
		
	}
	
	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getMetadata() {
		return this.metadata;
	}

}
