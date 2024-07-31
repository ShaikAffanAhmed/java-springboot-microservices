package com.app.employee.service;

import com.app.employee.entity.Employee;

import reactor.core.publisher.Mono;

public interface EmployeeService {

  public Mono<Employee> getEmployeeByAadharNumber(String adrNo,Employee employee);
  public Employee saveEmployee(Employee employee);
}
