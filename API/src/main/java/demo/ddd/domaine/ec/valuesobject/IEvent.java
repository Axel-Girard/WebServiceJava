package demo.ddd.domaine.ec.valuesobject;

public interface IEvent<TypeData extends IData> {

	TypeData getData();
	NumEventType getEventType();
}
