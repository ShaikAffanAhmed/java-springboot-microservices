package com.app.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.studentsystem.Model.Student;
import com.app.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return "New Student Added";
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudents ()
	{
		return studentService.getAllStudents();
	}
}
