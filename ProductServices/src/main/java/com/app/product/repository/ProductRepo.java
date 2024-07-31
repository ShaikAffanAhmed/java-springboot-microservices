package com.app.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.product.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	
}
