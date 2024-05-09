package belajar.spring.dasar.core;

import belajar.spring.dasar.core.service.MerchanService;
import belajar.spring.dasar.core.service.MerchanServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance(){
        MerchanService merchanService = applicationContext.getBean(MerchanService.class);
        MerchanServiceImpl merchanServiceImpl = applicationContext.getBean(MerchanServiceImpl.class);

        Assertions.assertSame(merchanService, merchanServiceImpl);
    }
}
