package demo.ddd.domaine.cb.valuesobjects;

import java.sql.Timestamp;

public class Leg {

	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getVhost() {
		return vhost;
	}
	public void setVhost(String vhost) {
		this.vhost = vhost;
	}
	public String getWafStatus() {
		return wafStatus;
	}
	public void setWafStatus(String wafStatus) {
		this.wafStatus = wafStatus;
	}
	public String getRemoteName() {
		return remoteName;
	}
	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}
	public String getRemoteAddr() {
		return remoteAddr;
	}
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}
	public String getRemotePort() {
		return remotePort;
	}
	public void setRemotePort(String remotePort) {
		this.remotePort = remotePort;
	}
	public String getLocalPort() {
		return localPort;
	}
	public void setLocalPort(String localPort) {
		this.localPort = localPort;
	}
	public String getSslSubject() {
		return sslSubject;
	}
	public void setSslSubject(String sslSubject) {
		this.sslSubject = sslSubject;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getBytesSent() {
		return bytesSent;
	}
	public void setBytesSent(String bytesSent) {
		this.bytesSent = bytesSent;
	}
	public String getBytesReceived() {
		return bytesReceived;
	}
	public void setBytesReceived(String bytesReceived) {
		this.bytesReceived = bytesReceived;
	}
	public String getLeg() {
		return leg;
	}
	public void setLeg(String leg) {
		this.leg = leg;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	String uri, status, statusText, method, vhost, wafStatus, remoteName, remoteAddr, remotePort, localPort, sslSubject,
			serviceName, subject, operation, type, finalStatus;
	String bytesSent, bytesReceived, leg, duration;
	String timestamp;

}
