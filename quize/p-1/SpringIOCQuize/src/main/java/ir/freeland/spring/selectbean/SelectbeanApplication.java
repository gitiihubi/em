package ir.freeland.spring.selectbean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import ir.freeland.spring.selectbean.service.BSIBankiranServices;
import ir.freeland.spring.selectbean.service.BankiranServices;
import ir.freeland.spring.selectbean.service.EDBBankiranServices;

public class SelectbeanApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_selectbean.xml");
		
		BankiranServices  bankiranServices = context.getBean(BSIBankiranServices.class);
		bankiranServices.accountTransaction("136-800-384123");

		BankiranServices  bankiranServices2 = context.getBean(EDBBankiranServices.class);
		bankiranServices2.accountTransaction("136-800-384123");
	}

}
