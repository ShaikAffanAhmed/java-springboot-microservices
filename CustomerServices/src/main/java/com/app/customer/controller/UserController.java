package com.app.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.customer.entity.Product;
import com.app.customer.entity.User;
import com.app.customer.serviceImpl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl serviceImpl;

	@GetMapping("/fetchUser")
	public List<User> getAllUsers() {
		return serviceImpl.getAllUsers();
	}

	@GetMapping("/fetchUser/{id}")
	public User getById(@PathVariable Integer id) {
		return serviceImpl.getById(id);
	}
	
	@DeleteMapping("/deleteUserById/{id}")
	public String deleteById(@PathVariable Integer id) {
		return serviceImpl.deleteById(id);
	}

	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return serviceImpl.getProductById(id);
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {
		return serviceImpl.getAllProduct();
	}
	
	

}
