package belajar.spring.dasar.core.service;

import belajar.spring.dasar.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
}
