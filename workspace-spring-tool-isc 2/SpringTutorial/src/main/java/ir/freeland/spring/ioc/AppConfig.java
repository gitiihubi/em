package ir.freeland.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    Item table() {
        return new ItemImpl1(); //This returns an object
    }

    @Bean
    Store digikala() {
        return new Store(table()); //This returns an object
    }

    @Bean
    Store okala() {
        Store store = new Store();
        store.setItem(table());
        return store;   //This returns an object
    }
}
