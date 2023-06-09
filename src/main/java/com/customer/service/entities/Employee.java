package com.customer.service.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private LocalDate DateOfBirth;
	private LocalDate DateOfJoining;
	private LocalDate lastWorkingDate;
	private String panCard;
	private String aadharCard;
	private String role;
	private String address;
	private String gender;
//	private String familyDetails;
	private String serviceCategory;
//	private String appoinment;
	private String photo;
//	private Strin1g attendence;
	
}
