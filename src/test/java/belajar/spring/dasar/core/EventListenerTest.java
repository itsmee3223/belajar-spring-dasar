package belajar.spring.dasar.core;

import belajar.spring.dasar.core.listener.LoginAgainListener;
import belajar.spring.dasar.core.listener.LoginSuccessListener;
import belajar.spring.dasar.core.listener.UserListener;
import belajar.spring.dasar.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {
    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainListener.class,
            UserListener.class
    })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        this.applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent(){
        UserService userService = applicationContext.getBean(UserService.class);
//        user password betul
        userService.login("ramanda", "ramanda");
//        user password salah
        userService.login("ramanda1", "ramanda1");
        userService.login("ramanda2", "ramanda2");
    }
}
