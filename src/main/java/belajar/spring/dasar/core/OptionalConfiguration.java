package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Bar;
import belajar.spring.dasar.core.data.Foo;
import belajar.spring.dasar.core.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {
    @Bean
    @Primary
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
