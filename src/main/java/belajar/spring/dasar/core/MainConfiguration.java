package belajar.spring.dasar.core;

import belajar.spring.dasar.core.configuration.BarConfiguration;
import belajar.spring.dasar.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class,
})
public class MainConfiguration {
}
