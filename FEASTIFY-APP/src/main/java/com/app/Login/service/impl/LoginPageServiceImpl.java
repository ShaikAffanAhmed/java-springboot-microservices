package com.app.Login.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.app.Login.entity.LoginPage;
import com.app.Login.repo.LoginRepository;


@Service
public class LoginPageServiceImpl{

	@Autowired
	private LoginRepository repo; 
	Map<String,Object> map=new HashMap<>();
	
	public String saveData(LoginPage loginpage) {
		    loginpage = repo.save(loginpage);
		    if(loginpage.getUsername()!= null && !loginpage.getUsername().equals("")) {
		    	System.out.println("Login success");
		    		return "Login Successfull";	
		    }				
				else {
					System.out.println("Login failed");
					return "Login Failed"; 
				}
	}
	
	public Map<String,Object> getByUserName(String userName) {
		if(this.repo.existsById(userName))
		{
			LoginPage user=this.repo.findById(userName).orElse(null);
			System.out.println(user);
			//map.put("password");
			map.put("status", HttpStatus.OK.value());
			map.put("message", "login successfully");
			return map;
			
		}
		else
		{
		return null;
		}
		
//		if(loginpage.isPresent())
//		return loginpage.get();
//		else
//			return null;
	}

}
