package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn(){
//        Foo foo = applicationContext.getBean(Foo.class);
//        Foo tidak dibuat jika tidak dipanggil
    }
}
