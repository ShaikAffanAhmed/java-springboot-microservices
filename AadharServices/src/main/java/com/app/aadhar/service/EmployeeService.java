package com.app.aadhar.service;

import java.util.List;

import com.app.aadhar.model.Employee;


public interface EmployeeService {

  public Integer createEmployee(Employee employee);
  public List<Employee> getAllEmployees();
  public Employee fetchEmployeeAadharNumber(String aadharNumber);
  
}
