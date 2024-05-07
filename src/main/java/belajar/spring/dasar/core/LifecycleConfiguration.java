package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {
    @Bean
    public Connection connection(){
        return new Connection();
    }
}
