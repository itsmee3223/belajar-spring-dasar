package belajar.spring.dasar.core;

import belajar.spring.dasar.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "belajar.spring.dasar.core.service",
        "belajar.spring.dasar.core.repository",
        "belajar.spring.dasar.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
