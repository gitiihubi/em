package ir.freeland.spring.bean;

import static org.junit.Assert.assertEquals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SpringBean {

	@SuppressWarnings({"resource"})
	public static void main(String[] args) {

		//Another example of no need to have xml. use of lombok		
        ApplicationContext appCtx = new AnnotationConfigApplicationContext( Config.class);        
        Company company = appCtx.getBean("company", Company.class);
        assertEquals("High Street", company.getAddress().getStreet());
        assertEquals(1000, company.getAddress().getNumber());

	}

}
