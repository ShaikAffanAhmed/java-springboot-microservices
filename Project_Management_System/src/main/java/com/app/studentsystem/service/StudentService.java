package com.app.studentsystem.service;

import java.util.List;

import com.app.studentsystem.Model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudents(); 

}
