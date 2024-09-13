package ir.freeland.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIOC {

	@SuppressWarnings({"resource", "unused"})
	public static void main(String[] args) {
		
		//without IOC dependency with setters
		Store okala = new Store();
		Item table = new ItemImpl1();		
		okala.setItem(table);

		//Using ApplicationContext with xml configuration
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("context.xml");        
        Store okala2 = appCtx.getBean("okala", Store.class);
        
        
		//without IOC dependency with constructor
        Item chair = new ItemImpl1();
        Store digikala = new Store(chair);
        //With IOC
        Store digikala2 = appCtx.getBean("digikala", Store.class);
        
        
        //without IOC
        //Assume no constructor or setter you can not do any thing
        Item desk = new ItemImpl1();
        Store basalam = new Store(); 
        Store basalam2 = appCtx.getBean("basalam", Store.class);
        
        
        
        ApplicationContext appCtx2 = new AnnotationConfigApplicationContext(AppConfig.class );
        Store store = appCtx2.getBean("digikala", Store.class);
        
		
	}

}
