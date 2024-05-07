package belajar.spring.dasar.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {
    @Test
    void testCyclic(){
        Assertions.assertThrows(Throwable.class, ()->{
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }

    @Test
    void mustError(){
        try {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
            Assertions.fail("It must be fail because of cyclic");
        } catch (BeansException exception) {
            exception.printStackTrace();
        }
    }
}
