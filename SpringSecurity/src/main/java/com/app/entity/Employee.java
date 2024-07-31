package com.app.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee implements UserDetails{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empEmail;
	private String empPassword;
	private String empRole;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority(empRole)) ;
	}
	
	@Override
	public String getPassword() {
		return empPassword;
	}
	
	
	@Override
	public String getUsername() {
		return empEmail;
	}
	
}
