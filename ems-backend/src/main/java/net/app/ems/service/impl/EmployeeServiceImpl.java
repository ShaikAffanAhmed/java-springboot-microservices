package net.app.ems.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.app.ems.dto.EmployeeDto;
import net.app.ems.entity.Employee;
import net.app.ems.exception.ResourceNotFoundException;
import net.app.ems.mapper.EmployeeMapper;
import net.app.ems.repository.EmployeeRepository;
import net.app.ems.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).get();
		return EmployeeMapper.mapToEmployeeDto(employee);
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		List<Employee> employees = employeeRepository.findAll();
		//System.out.println(employees);
//		List<EmployeeDto> finalemp=new ArrayList<>();
//		for(int i=0; i<employees.size();i++)
//		{
//			finalemp.add(EmployeeMapper.mapToEmployeeDto(employees.get(i)));
//		}
			
	      return employees.stream().map((employee) ->
	    	 EmployeeMapper.mapToEmployeeDto(employee)).collect(Collectors.toList());
		 
//		return finalemp;
		 	 
	}
	 
	@Override
	public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
				() -> new ResourceNotFoundException("Employee is not exists with given id : " + employeeId));

		employee.setFirstName(updatedEmployee.getFirstName());
		employee.setLastName(updatedEmployee.getLastName());
		employee.setEmail(updatedEmployee.getEmail());

		Employee updatedEmployeeObj = employeeRepository.save(employee);

		return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
				() -> new ResourceNotFoundException("Employee is not exists with given id : " + employeeId));
		employeeRepository.deleteById(employeeId);

	}
	
	
//	 public List<Employee> searchEmployees(String query) {
//	        return employeeRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(query, query, query);
//	 }
	 
	 
//   Map<String, Object> map=new HashMap<>();
//   @Override
//	public Map<String, Object> getEMployeeDatabyId(Long id) {
//		Employee employee=this.employeeRepository.findById(id).orElse(null);
//		map.put("Message", "EMployee Data has been successfully fetched.");
//		map.put("Status", HttpStatus.FOUND);
//		map.put("data", employee);
//		return map;
//	}

}
