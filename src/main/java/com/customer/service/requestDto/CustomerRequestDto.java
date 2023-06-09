package com.customer.service.requestDto;

import com.customer.service.entities.Employee;
import com.customer.service.responseDto.CustomerResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerRequestDto {

	private String customerName;
	private String mobileNumber;
	private String customerEmail;
	private Integer employeeId;
//	private LocalDate appointmentDate;
//	private LocalDate dateOfOrder;
	private Employee employee;
	
}
