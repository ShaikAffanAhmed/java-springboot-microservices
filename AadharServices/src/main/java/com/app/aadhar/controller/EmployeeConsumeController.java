package com.app.aadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.aadhar.model.Employee;
import com.app.aadhar.service.EmployeeService;

@RestController
public class EmployeeConsumeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get")
	public Employee getEmployeeDataByID(@RequestParam String aadharNumber)
	{
		return employeeService.fetchEmployeeAadharNumber(aadharNumber);
	}

	//1. create one Employee
//			@PostMapping("/create") 
//			public ResponseEntity<?> createEmployee(@RequestBody Employee employee){
//				Integer id = employeeService.createEmployee(employee);
//				
//				return new ResponseEntity<>("Employee ID "+ id +" is created!",HttpStatus.CREATED);
//			}
	
	
}
