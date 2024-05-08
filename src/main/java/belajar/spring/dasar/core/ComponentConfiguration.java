package belajar.spring.dasar.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajar.spring.dasar.core.service"
})
public class ComponentConfiguration {
}
