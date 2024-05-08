package belajar.spring.dasar.core.configuration;

import belajar.spring.dasar.core.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CustomerConfiguration {
    @Bean
    @Primary
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }
}
