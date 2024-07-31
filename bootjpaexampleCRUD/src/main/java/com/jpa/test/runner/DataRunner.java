package com.jpa.test.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@Component
public class DataRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
//		User user = new User();
//		user.setName("Bob");
//		user.setCity("Vizag");
//		user.setStatus("Java Developer");
//		repository.save(user); // saving the data into db
	}

}
