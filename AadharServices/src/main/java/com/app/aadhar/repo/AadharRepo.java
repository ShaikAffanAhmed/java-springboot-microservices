package com.app.aadhar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.aadhar.model.Employee;

public interface AadharRepo extends JpaRepository<Employee, Integer> {

	public Employee findByAadharNumber(String aadharNumber);
}
