package ir.freeland.spring.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class ScopesConfig {

    @Bean
    @Scope("singleton")
    Person personSingleton() {
        return new Person();
    }

    @Bean
    @Scope("prototype")
    Person personPrototype() {
        return new Person();
    }

    @Bean
    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    HelloMessageGenerator websocketScopedBean() {
        return new HelloMessageGenerator();
    }
}
