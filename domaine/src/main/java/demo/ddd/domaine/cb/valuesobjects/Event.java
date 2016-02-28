package demo.ddd.domaine.cb.valuesobjects;

import javax.validation.constraints.NotNull;

import demo.ddd.domaine.ec.valuesobject.IData;
import demo.ddd.domaine.ec.valuesobject.IEvent;
import demo.ddd.domaine.ec.valuesobject.NumEventType;

public class Event implements IEvent<IData> {


	NumEventType eventType = null;
	IData data = null;
	
	
	public  Event(IData donneeEvenement,  @NotNull NumEventType eventType) {
		this.data = donneeEvenement;
		this.eventType = eventType;
	}
	
	
	public IData getData() {
		// TODO Auto-generated method stub
		return this.data;
	}


	public NumEventType getEventType() {
		return this.eventType;
	}

	
}
