package com.app.aadhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.aadhar.model.Employee;
import com.app.aadhar.repo.AadharRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private AadharRepo adAadharRepo;
	
	private WebClient webClient;
	
	@Override
		public Integer createEmployee(Employee employee) {
			employee = adAadharRepo.save(employee);
			return employee.getId();
		}

	@Override
	public List<Employee> getAllEmployees() {
			List<Employee> list = adAadharRepo.findAll();
			return list;
		}
	Employee data = null;
	public Employee fetchEmployeeAadharNumber(String aadharNumber) 
	{
		 data =  adAadharRepo.findByAadharNumber(aadharNumber);
		System.out.println("Data"+data);
		return data;
	}

	}
