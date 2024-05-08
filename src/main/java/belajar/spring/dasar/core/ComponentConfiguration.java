package belajar.spring.dasar.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajar.spring.dasar.core.service",
        "belajar.spring.dasar.core.repository",
        "belajar.spring.dasar.core.configuration"
})
public class ComponentConfiguration {
}
