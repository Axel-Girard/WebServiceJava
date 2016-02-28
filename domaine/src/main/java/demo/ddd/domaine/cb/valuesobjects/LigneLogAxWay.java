package demo.ddd.domaine.cb.valuesobjects;

import java.util.List;

import demo.ddd.domaine.ec.valuesobject.ILog;

public class LigneLogAxWay implements ILog{
	/**
	 * Warning must have same attribut camel-case than json text
	 * so I use the same definition instead of java style
	 */
	
	String type;
	String duration;
	String status;
	List<ServiceContext> serviceContexts;
	CustomMsgAtts customMsgAtts;
	String correlationId;
	List<Leg> legs;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ServiceContext> getServiceContexts() {
		return serviceContexts;
	}
	public void setServiceContexts(List<ServiceContext> serviceContexts) {
		this.serviceContexts = serviceContexts;
	}
	public CustomMsgAtts getCustomMsgAtts() {
		return customMsgAtts;
	}
	public void setCustomMsgAtts(CustomMsgAtts customMsgAtts) {
		this.customMsgAtts = customMsgAtts;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public List<Leg> getLegs() {
		return legs;
	}
	public void setLegs(List<Leg> legs) {
		this.legs = legs;
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("type : ").append(type).append(" ; " );
		res.append("duration : ").append(duration).append(" ; " );
		res.append("status : ").append(status).append(" ; " );
		res.append("serviceContexts : ").append(serviceContexts).append(" ; " );
		res.append("customMsgAtts : ").append(customMsgAtts);
		res.append("correlationId : ").append(correlationId).append(" ; " );
		return res.toString();
	}
}
