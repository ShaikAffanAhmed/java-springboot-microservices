package com.app.customer.serviceImpl;

import java.util.Arrays;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.customer.entity.Product;
import com.app.customer.entity.User;
import com.app.customer.repository.UserRepo;
import com.app.customer.service.IUserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User getById(Integer id) {
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent())
			return user.get();
		else
			return null;
	}

	@Override
	public String deleteById(Integer id) {
		if (userRepo.existsById(id)) {
			userRepo.deleteById(id);
			return "Delete Successfully";
		} else {
			return "Failed to delete ";
		}
	} 

	public static final String PRODUCT_SERVICE_URI = "http://localhost:8082";

	public Product getProductById(Integer id) {

//		String url = PRODUCT_SERVICE_URI + "/fetchProduct/{id}";

		// by getForEntity()

		// ResponseEntity<Product> forEntity = restTemplate.getForEntity(url,
		// Product.class ,id);
		// return forEntity.getBody();

		// by getForObject()

		Product product = restTemplate.getForObject("/fetchProduct/{id}", Product.class, id);
		return product;

//		Product forObject = restTemplate.getForObject("http://localhost:8082/fetchProduct/{id}", Product.class, id);
//		log.info("product: {}", forObject);
//	    	
//	    	return forObject;
//	    

	}

	@Override
	public List<Product> getAllProduct() {

		String url = PRODUCT_SERVICE_URI + "/fetchProducts";

		Product[] forObject = restTemplate.getForObject(url, Product[].class);

		return Arrays.asList(forObject);
	}

}