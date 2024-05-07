package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Bar;
import belajar.spring.dasar.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Lazy
//    decorator ini digunakan untuk menandai bahwa bean tidak akan dibuat saat pertama kali aplikasi dijalankan
//    bean akan dibuat pada saat ia dipanngil, hal ini bertujuan agar pada start up aplikasi menjadi lebih ringan
//    karena perlu membuat banyak bean
    @Bean
//    gunakan decorator depends on untuk menandakan bahwa bean ini dibuat depend kepada been lain
//    bean bar akan dibuat terlebih dahulu sebelum bean foo
    @DependsOn(value = {"bar"})
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
