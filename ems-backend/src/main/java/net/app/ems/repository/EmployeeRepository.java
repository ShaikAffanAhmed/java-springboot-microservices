package net.app.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.app.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(
			String query, String query2, String query3);

}
