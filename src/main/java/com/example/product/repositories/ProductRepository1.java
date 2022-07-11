package com.example.product.repositories;

import com.example.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository1 extends JpaRepository<Product, Long> {
}
