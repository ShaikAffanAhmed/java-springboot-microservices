package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.globalResponseEntity.GlobalResponseEntity;
import com.app.repository.StudentRepository;
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;

	public String saveStudent(Student student) {
		student = repo.save(student);
		if (student.getStdId() != null)
			return "Create Success...";
		else
			return "Failed to create";
	}

	public List<Student> getAll() {
		return repo.findAll();
	}

	public Student getById(Integer id) {
		Optional<Student> student = repo.findById(id);
		if (student.isPresent())
			return student.get();
		else
			return null;
	}

	public String updateStudent(Student std) {
		if (repo.existsById(std.getStdId())) {
			repo.save(std);
			return "Update Successfully";
		} else
			return "Failed to update";
	}

	public String deleteById(Integer id) {
		if (repo.existsById(id)) {
			repo.deleteById(id);
			return "Deleted Successfully";
		} else
			return "Failed to Delete";
	}

	// Create
	@Override
	public ResponseEntity<GlobalResponseEntity<Student>> createStudent(Student student) {

		GlobalResponseEntity<Student> entity = new GlobalResponseEntity<>();
		entity.setStatusCode(HttpStatus.CREATED.value());
		entity.setMessage("Inserted");
		entity.setData(repo.save(student));

		return new ResponseEntity<GlobalResponseEntity<Student>>(entity, HttpStatus.CREATED);

	}

	// delete

	public ResponseEntity<GlobalResponseEntity<Student>> deleteStudent(int id) {
		GlobalResponseEntity<Student> entity = new GlobalResponseEntity<>();
		entity.setStatusCode(HttpStatus.OK.value());
		entity.setMessage("Deleted ");
		entity.setData(repo.deleteById(id));

		return new ResponseEntity<GlobalResponseEntity<Student>>(entity, HttpStatus.OK);

	}

}
