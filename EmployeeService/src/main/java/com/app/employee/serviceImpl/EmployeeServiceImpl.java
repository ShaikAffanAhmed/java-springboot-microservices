package com.app.employee.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.employee.entity.Employee;
import com.app.employee.repository.EmployeeRepository;
import com.app.employee.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private WebClient webClient;
	
	public EmployeeServiceImpl() {
        this.webClient = WebClient.create("http://localhost:8082");
    }

	 private List<String> fetchedData = new ArrayList<>();
	 
	@Override
    public Mono<Employee> getEmployeeByAadharNumber(String adrNo,Employee employee)  
	{
		String adharNo=employee.getAadharNumber();
		System.out.println("adharnumber: "+adharNo);
		Mono<Employee> address =  webClient.get().uri("/get"+"?aadharNumber="+adrNo).retrieve().bodyToMono(Employee.class);
		System.out.println("Employee API response"+address.block());
		
		String addressValue = address.map(emp -> employee.getAddress()).block();

		System.out.println("Employee Address: " + addressValue);
		if(addressValue.equals(employee.getAddress()))
		{
			employee.setAadharNumber(employee.getAadharNumber());
			saveEmployee(employee);
		}
		return address;
    }
	
	@Override
	public Employee saveEmployee(Employee employee) 
	{
		System.out.println("saveEmployee");
		return employeeRepository.save(employee);
	}
 
}