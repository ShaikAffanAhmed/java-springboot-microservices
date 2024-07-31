package com.app.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.product.entity.Product;
import com.app.product.repository.ProductRepo;

public interface IProductService {
	
	//Get all products
	public List<Product> getAllProduct();
	
	//Get product by Id
	public Product getById(Integer id);
	
	//Delete product by id
	public String deleteProductById(Integer id);
}
