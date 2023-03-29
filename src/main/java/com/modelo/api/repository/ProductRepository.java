package com.modelo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
