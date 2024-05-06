package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {
    @Bean(name = "fooFirst")
    @Primary
    public Foo foo1(){
        return new Foo();
    }

    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
