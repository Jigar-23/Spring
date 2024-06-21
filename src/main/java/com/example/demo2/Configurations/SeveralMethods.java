package com.example.demo2.Configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


;
;
@Configuration
public class SeveralMethods {
@Bean public String name(){return "Ravi";}
  @Bean  public String age(){return "18";}
    @Bean(name = "printPerson")
    public Person printPerson(String name, String age,  Address address) {
        return new Person(name, age,address);
    }
@Bean(name="address")
    public Address address() {
    return new Address("Ravi", "San Francisco");
}
    @Bean(name="address2")
    public Address address2() {
    return new Address("John Doe", "Baker's Street");
    }

     record Person(String name, String age, Address address) {
    }

     record Address(String city, String street) {
    }
}
