package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	UserDetails findByEmpEmail(String username);

}
