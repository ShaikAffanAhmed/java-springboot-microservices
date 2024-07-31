package com.app.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.globalResponseEntity.GlobalResponseEntity;
import com.app.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentServiceImpl service;
	
	@PostMapping("/create")
	public String  saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@GetMapping("/fetch")
	public List<Student> getAll() {
		return service.getAll();
	}

	@GetMapping("/fetch/{id}")
	public Student getById(@PathVariable Integer id) {
		return service.getById(id);
		
	}

	@PutMapping("/update")
	public String updateStudent(@RequestBody Student std) {
		return service.updateStudent(std);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Integer id) {
		return service.deleteById(id);
	}

	@PostMapping("/insert")
	public ResponseEntity<GlobalResponseEntity<Student>> createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<GlobalResponseEntity<Student>> deleteStudent(int id){
		
		return service.deleteStudent(id);
		
	}
}
