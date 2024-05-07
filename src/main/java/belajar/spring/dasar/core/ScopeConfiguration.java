package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {
    @Bean
    @Scope("prototype")
//    decorator scope digunakan untuk memberi tahu bagaimana objek tersebut akan dibuat
//    secara default spring akan membuatnya ke singleton
//    kita dapat mengubahnya dengan menggunakan decorator ini
//    untuk type decator yang diesdiakan oleh spring dapat dilihat pada dokuemntasinya
    public Foo foo(){
        log.info("create new Foo");
        return new Foo();
    }
}
