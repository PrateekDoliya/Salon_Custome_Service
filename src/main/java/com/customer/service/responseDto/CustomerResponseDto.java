package com.customer.service.responseDto;

import com.customer.service.entities.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerResponseDto {

	private Integer customerId;
	private String customerName;
	private String mobileNumber;
	private String customerEmail;
	private Integer employeeId;
//	private LocalDate appointmentDate;
//	private LocalDate dateOfOrder;
	private Employee employee;
	
}
