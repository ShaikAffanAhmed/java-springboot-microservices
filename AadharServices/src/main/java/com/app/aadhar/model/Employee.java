package com.app.aadhar.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EmployeeTabData")
public class Employee {

	@jakarta.persistence.Id
//	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer Id;
	
	@Column(name = "first_Name")
	private String firstName;
	
	@Column(name = "last_Name")
	private String lastName;
	
	@Column(name = "email_Id")
	private String emailId;
	
	@Column(name = "Dob")
	private LocalDate dateOfbirth;
	
	@Column(name = "phone_Number")
	private Long phoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "aadhar_Number")
	private String aadharNumber;

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", dateOfbirth=" + dateOfbirth + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", aadharNumber=" + aadharNumber + "]";
	}	
}
