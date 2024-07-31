package com.app.employee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.entity.Employee;
import com.app.employee.service.EmployeeService;


import jakarta.validation.Valid;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/api/employee")
public class EmployeeController {

		@Autowired
		private EmployeeService service;
		
		
		 // 3. Get AadharAddress by Aadhar number
	    @PostMapping("/aadhar")
	    public Mono<Employee> getAadharAddress(@RequestParam String adrNo,@RequestBody Employee emp){
	        return service.getEmployeeByAadharNumber(adrNo,emp);
	      
	    }
}
