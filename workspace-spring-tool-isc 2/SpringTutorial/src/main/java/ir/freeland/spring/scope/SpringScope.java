package ir.freeland.spring.scope;

import static org.junit.Assert.assertEquals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SpringScope {

	public static void main(String[] args) {

        ApplicationContext appCtx = new AnnotationConfigApplicationContext( ScopesConfig.class);        
        Person personSingletonA = (Person) appCtx.getBean("personSingleton");
        Person personSingletonB = (Person) appCtx.getBean("personSingleton");

        personSingletonA.setName("Alireza");
        assertEquals("Alireza", personSingletonB.getName());

        
        
        Person personPrototypeA = (Person) appCtx.getBean("personPrototype");
        Person personPrototypeB = (Person) appCtx.getBean("personPrototype");

        personPrototypeA.setName("Alireza");
        personPrototypeB.setName("Roham");

        assertEquals("Alireza", personPrototypeA.getName());
        assertEquals("Roham", personPrototypeB.getName());
	}

}
