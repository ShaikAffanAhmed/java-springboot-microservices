package com.app.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.studentsystem.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
