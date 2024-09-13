package ir.freeland.spring.selectbean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import ir.freeland.spring.selectbean.service.BankiranServices;

public class SelectbeanApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_selectbean.xml");
		BankiranServices  bankiranServices = context.getBean(BankiranServices.class);
		bankiranServices.accountTransaction("136-800-384123");
		
	}

}
