package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.Connection;
import belajar.spring.dasar.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {
    @Bean
    public Connection connection(){
        return new Connection();
    }

//    tidak perlu digunakan karena sudah menggunakan @PostContract dan @PreDestroy
//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}
