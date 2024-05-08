package belajar.spring.dasar.core;

import belajar.spring.dasar.core.repository.CategoryRepository;
import belajar.spring.dasar.core.repository.CustomerRepository;
import belajar.spring.dasar.core.repository.ProductRepository;
import belajar.spring.dasar.core.service.CategoryService;
import belajar.spring.dasar.core.service.CustomerService;
import belajar.spring.dasar.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService() {

        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);

    }

    @Test
    void testConstructorDependencyInjection(){
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }

    @Test
    void testFieldDependencyInjection(){
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        Assertions.assertNotNull(customerService);

        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);
        Assertions.assertSame(customerRepository, customerService.getCustomerRepository());
    }
}
