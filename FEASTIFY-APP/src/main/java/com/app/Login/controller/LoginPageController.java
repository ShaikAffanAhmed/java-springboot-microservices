package com.app.Login.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Login.entity.LoginPage;
import com.app.Login.service.ILoginService;
import com.app.Login.service.impl.LoginPageServiceImpl;

@RestController
@RequestMapping("/api/loginpage")
@CrossOrigin("*")
public class LoginPageController {

	@Autowired
	private LoginPageServiceImpl serviceImpl;

	@PostMapping("/create")
	public String saveData(@RequestBody LoginPage loginPage) {
		return serviceImpl.saveData(loginPage);
	}

	@GetMapping("/fetchByUserName/{userName}")
	public Map<String, Object> getById(@PathVariable String userName) {
		Map<String, Object> map = serviceImpl.getByUserName(userName);
		return map;
	}
 
	 
}
