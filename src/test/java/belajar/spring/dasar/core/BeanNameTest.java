package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {
    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void getBeanName(){
        Foo foo = applicationContext.getBean(Foo.class);
        Foo firstFoo = applicationContext.getBean("fooFirst", Foo.class);
        Foo secondFoo = applicationContext.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo, firstFoo);
        Assertions.assertNotSame(firstFoo, secondFoo);
    }
}
