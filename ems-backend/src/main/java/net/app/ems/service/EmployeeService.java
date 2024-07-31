package net.app.ems.service;

import java.util.List;
import java.util.Map;

import net.app.ems.dto.EmployeeDto;
import net.app.ems.entity.Employee;

public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long employeeId);
	
	List<EmployeeDto> getAllEmployee();
	
	EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
	
	void deleteEmployee(Long employeeId);

//	List<Employee> searchEmployees(String query);

//	Map<String, Object> getEMployeeDatabyId(Long id);
}
