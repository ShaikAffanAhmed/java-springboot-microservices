package com.app.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.product.entity.Product;
import com.app.product.serviceImpl.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl serviceImpl;

	@GetMapping("/fetchProducts")
	public List<Product> getAllProducts() {
		return serviceImpl.getAllProduct();
	}

	@GetMapping("/fetchProduct/{id}")
	public Product getById(@PathVariable("id") Integer id) {
		return serviceImpl.getById(id);
	}

	@DeleteMapping("/deletedProductById/{id}")
	public String deleteProductById(Integer id) {
		return serviceImpl.deleteProductById(id);
	}
}
