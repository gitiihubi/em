package ir.freeland.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Company {
	//Does not have any annotation or code which shows the dependency only same type
    private Address address;

    public Company(Address address) {
        this.address = address;
    }
}
