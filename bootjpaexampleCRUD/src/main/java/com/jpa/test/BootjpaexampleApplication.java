package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//	User user = new User();
//	user.setName("Ahmed");
//	user.setCity("Bidar");
//	user.setStatus("Java Developer");
//	
//	User user1 = userRepository.save(user);
//	System.out.println(user1);

		// ************ SAVE USER DATA ************* //

		// Create Object of UserD
//	User user1 = new User();
//	user1.setName("Bob");
//	user1.setCity("Vizag");
//	user1.setStatus("Microservice");
//	
//	User user2 = new User();
//	user2.setName("Charty");
//	user2.setCity("Odhisa");
//	user2.setStatus("Java");

		// Saving Single User
		// User resultUser = userRepository.save(user2);

//	List<User> users = List.of(user1,user2);
//	Iterable<User> result = userRepository.saveAll(users);
//	
//	result.forEach(user->{
//		System.out.println(user);
//	});
//	
//	//System.out.println("Saved User" + resultUser);
//	System.out.println("Done");

		// **********UPDATE USER DATA BY ID *************** //

//    Optional<User> optional = userRepository.findById(2);
//    User user = optional.get();
//    user.setName("Praveen");
//    user.setCity("AP");
//    User result = userRepository.save(user);
//    System.out.println(result);

		// ********* FETCH USER DATA ***************** //

//	Iterable<User> itr = userRepository.findAll();
//	itr.forEach(use->{System.out.println(use);});

		// ********** DELETE USER DATA ************** //
		// Deleted Single user by Id
//	userRepository.deleteById(54);
//	System.out.println("DELETED");

		// Deleted All user
//	Iterable<User> allusers = userRepository.findAll();
//	
//	allusers.forEach(user->{System.out.println(user);});
//	
//	userRepository.deleteAll(allusers);

		// This link for Drived Queries
		// https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference

//		List<User> users = userRepository.findByName("Ahmed");
//		users.forEach(e -> System.out.println(e));
//
//		List<User> users1 = userRepository.findByNameAndStatus("Ahmed", "Java Developer");
//		users.forEach(e -> System.out.println(e));
		
//		List<User> getAll = userRepository.getAllUser();
//		getAll.forEach(e->System.out.println(e));
		
		List<User> getByName = userRepository.getUserByName("Bob");
		getByName.forEach(e->System.out.println(e));
	}

}
