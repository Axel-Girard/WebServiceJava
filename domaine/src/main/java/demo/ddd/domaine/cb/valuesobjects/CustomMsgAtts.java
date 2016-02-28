package demo.ddd.domaine.cb.valuesobjects;

import java.util.List;

public class CustomMsgAtts {
	public String getUserInfo() {
		return UserInfo;
	}

	public void setUserInfo(String userInfo) {
		this.UserInfo = userInfo;
	}

	public String getTotalProcessingTimeInMS() {
		return totalProcessingTimeInMS;
	}

	public void setTotalProcessingTimeInMS(String totalProcessingTimeInMS) {
		this.totalProcessingTimeInMS = totalProcessingTimeInMS;
	}

	public String getAPIGatewayProcessingTimeInMS() {
		return APIGatewayProcessingTimeInMS;
	}

	public void setAPIGatewayProcessingTimeInMS(String aPIGatewayProcessingTimeInMS) {
		APIGatewayProcessingTimeInMS = aPIGatewayProcessingTimeInMS;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getJTI() {
		return JTI;
	}

	public void setJTI(String jTI) {
		JTI = jTI;
	}

	String UserInfo;
	String totalProcessingTimeInMS,APIGatewayProcessingTimeInMS;
	String transactionDate;

	String JTI;
	@Override
	public String toString() {
	StringBuilder res = new StringBuilder();
		

		
		
	res.append("UserInfo : ").append(UserInfo).append(" ; " );
	res.append("totalProcessingTimeInMS : ").append(totalProcessingTimeInMS).append(" ; " );
	res.append("APIGatewayProcessingTimeInMS : ").append(APIGatewayProcessingTimeInMS).append(" ; " );
	res.append("transactionDate : ").append(transactionDate).append(" ; " );
	res.append("JTI : ").append(JTI).append(" ; " );

		
		
		return res.toString();
	}
}
