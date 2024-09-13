package ir.freeland.lambda;

import ir.freeland.lambda.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student iman() {
        return new Student("imans", "dev", 123, 20);
    }

    @Bean
    public Student hasan() {
        return new Student("hasan", "hasani", 13, 3);
    }

    @Bean
    public Student moji() {
        return new Student("mojtaba", "mojtabaee", 12, 12);
    }

    @Bean
    public Student ali() {
        return new Student("ali", "rabie", 2, 19);
    }
}
