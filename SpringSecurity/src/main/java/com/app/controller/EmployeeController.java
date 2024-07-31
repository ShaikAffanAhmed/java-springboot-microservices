package com.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginDto;
import com.app.entity.Employee;
import com.app.service.EmployeeService;
import com.app.service.JwtServiceImpl;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeService impl;
	@Autowired
	private JwtServiceImpl serviceImpl;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody LoginDto loginDto) throws Exception {
		try {
			this.authenticate(loginDto.getEmpEmail(), loginDto.getEmpPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		UserDetails userDetails = this.impl.loadUserByUsername(loginDto.getEmpEmail());
		if (userDetails == null) {
			throw new UsernameNotFoundException("user doesn't exists" + userDetails.getUsername());
		} else {
			String token = this.serviceImpl.generateToken(userDetails.getUsername());
			Map<String, Object> map = new HashMap<>();
			map.put("token", token);
			map.put("token expiration time", this.serviceImpl.getExpirationDateFromToken(token).toString());
			map.put("token expiration time in milli seconds",
					this.serviceImpl.getExpirationDateFromToken(token).getTime());
			map.put("message", "success");
			map.put("status", "success");
			map.put("username", userDetails.getUsername());
			map.put("user-role", userDetails.getAuthorities().stream().map(auth -> auth.getAuthority()));

			return ResponseEntity.ok().body(map);
		}

	}

	private void authenticate(String username, String password) throws Exception {
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,
				password);
		try {
			this.authenticationManager.authenticate(authenticationToken);
		} catch (DisabledException e) {
			throw new DisabledException("user is disabled");
		} catch (BadCredentialsException e) {
			throw new BadCredentialsException("bad credentials");
		}
	}

	@PostMapping("/save")
	public ResponseEntity<Map<String, Object>> saveEmployee(@RequestBody Employee employee) {
		Map<String, Object> map = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(map);
	}
}
