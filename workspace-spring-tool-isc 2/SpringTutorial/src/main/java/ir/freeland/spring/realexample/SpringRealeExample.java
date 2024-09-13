package ir.freeland.spring.realexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ir.freeland.spring.realexample.config.AppConfiguration;
import ir.freeland.spring.realexample.config.ConstructorBasedInjection;
import ir.freeland.spring.realexample.config.FieldBasedInjection;



public class SpringRealeExample {

	@SuppressWarnings({"resource", "unused"})
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection  fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
		fieldBasedInjection.processMsg("twitter message sending ");

		ConstructorBasedInjection  constructorBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
		fieldBasedInjection.processMsg("twitter message sending ");

	}

}
