package com.app.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.repository.EmployeeRepository;

@Service
public class EmployeeService implements UserDetailsService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	Map<String,Object> map=new HashMap<>();
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    return(UserDetails)employeeRepository.findByEmpEmail(username);
	}   
	

	public Map<String,Object> saveEmployee(Employee employee) {
		Employee employee2=new Employee();
		employee2.setEmpEmail(employee.getEmpEmail());
		employee2.setEmpName(employee.getEmpName());
		employee2.setEmpPassword(passwordEncoder.encode(employee.getEmpPassword()));
		employee2.setEmpRole(employee.getEmpRole());
		employeeRepository.save(employee2);
		map.put("status", HttpStatus.CREATED.value());
		map.put("message", "successfully inserted");
		map.put("result", employee2);
		return  map;
	}

}
