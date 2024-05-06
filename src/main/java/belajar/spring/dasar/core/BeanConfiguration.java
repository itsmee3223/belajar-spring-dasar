package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }
}
