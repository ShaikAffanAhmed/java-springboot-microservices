package com.app.Login.service;

import com.app.Login.entity.LoginPage;

public interface ILoginService {

	//create 
	public String saveData(LoginPage loginpage );
	
	//get by id
		public LoginPage getById(Integer id);
		
//	//get all 
//	public List<Student> getAll();
	
//	//get by id
//	public Student getById(Integer id);
	
//	//update
//	public String updateStudent(Student std);
//	
//	//delete
//	public String deleteById(Integer id);
}
