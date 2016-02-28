package demo.ddd.domaine.cb.valuesobjects;

public class UserInfo {
	
	/**
	 * Warning must have same attribut camel-case than json text
	 * so I use the same definition instead of java style
	 */
	
	String UserMatricule;
	public String getUserMatricule() {
		return UserMatricule;
	}
	public void setUserMatricule(String userMatricule) {
		UserMatricule = userMatricule;
	}
	public String getUserEtab() {
		return UserEtab;
	}
	public void setUserEtab(String userEtab) {
		UserEtab = userEtab;
	}
	public String getUserAuthentMethod() {
		return UserAuthentMethod;
	}
	public void setUserAuthentMethod(String userAuthentMethod) {
		UserAuthentMethod = userAuthentMethod;
	}
	public String getUserAuthentInstant() {
		return UserAuthentInstant;
	}
	public void setUserAuthentInstant(String userAuthentInstant) {
		UserAuthentInstant = userAuthentInstant;
	}
	public String getUserCanal() {
		return UserCanal;
	}
	public void setUserCanal(String userCanal) {
		UserCanal = userCanal;
	}
	public String getUserEnv() {
		return UserEnv;
	}
	public void setUserEnv(String userEnv) {
		UserEnv = userEnv;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getCtxtLocalisation() {
		return CtxtLocalisation;
	}
	public void setCtxtLocalisation(String ctxtLocalisation) {
		CtxtLocalisation = ctxtLocalisation;
	}
	public String getAgencyCode() {
		return AgencyCode;
	}
	public void setAgencyCode(String agencyCode) {
		AgencyCode = agencyCode;
	}
	public String getUserProfil() {
		return UserProfil;
	}
	public void setUserProfil(String userProfil) {
		UserProfil = userProfil;
	}
	public String getCtxtDevice() {
		return CtxtDevice;
	}
	public void setCtxtDevice(String ctxtDevice) {
		CtxtDevice = ctxtDevice;
	}
	String UserEtab;
	String UserAuthentMethod;
	String UserAuthentInstant;
	String UserCanal;
	String UserEnv;
	String sub;
	String CtxtLocalisation;
	String AgencyCode;
	String UserProfil;
	String CtxtDevice;

	

}
