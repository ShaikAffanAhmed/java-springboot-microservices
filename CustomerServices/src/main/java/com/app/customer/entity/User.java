package com.app.customer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Customer_Table")
public class User {
	
	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_Id;
	
	@Column(name = "c_name")
	private String cust_Name;
	
	@Column(name = "c_mob")
	private Long cust_Mob;
	
	@Column(name = "c_address")
	private String cust_Address;

}
