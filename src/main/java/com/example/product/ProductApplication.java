package com.example.product;

import com.example.product.entities.Product;
import com.example.product.repositories.ProductRepository1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApplication{

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository1 productRepository1){
        return args -> {
            productRepository1.save(new Product(null, "Computer", 6500, true));
            productRepository1.save(new Product(null, "Smart phone", 8000, false));
            productRepository1.save(new Product(null, "Computer", 7500, true));
            productRepository1.save(new Product(null, "Printer", 2500, true));

        };
    }

}
