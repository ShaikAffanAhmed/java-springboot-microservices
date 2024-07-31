package com.app.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.customer.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
