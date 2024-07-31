package com.app.customer.service;

import java.util.List;

import com.app.customer.entity.Product;
import com.app.customer.entity.User;

public interface IUserService {

	//Get all users
	public List<User> getAllUsers();
	
	//Get by id
	public User getById(Integer id);
	
	public String deleteById(Integer id);
	
	public Product getProductById(Integer id) ;
	
	List<Product> getAllProduct();
}
