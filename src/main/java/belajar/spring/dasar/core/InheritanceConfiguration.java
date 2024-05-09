package belajar.spring.dasar.core;

import belajar.spring.dasar.core.service.MerchanServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchanServiceImpl.class)
public class InheritanceConfiguration {
}
