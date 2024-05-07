package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Bar;
import belajar.spring.dasar.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Bean
//    gunakan decorator depends on untuk menandakan bahwa bean ini dibuat depend kepada been lain
//    bean bar akan dibuat terlebih dahulu sebelum bean foo
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("create new Bar");
        return new Bar();
    }
}
