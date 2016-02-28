package demo.ddd.application;

import javax.xml.ws.Endpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boot {
	
	private final static  	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:**/app-context.xml");
	private final static    Application APP =  (Application)applicationContext .getBean("application");

	public static Application getApp(){
		return  Boot.APP;
	}
	
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/ws/serviceCB",getApp());
	}
}
