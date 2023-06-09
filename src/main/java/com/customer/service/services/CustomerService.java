package com.customer.service.services;

import java.util.List;

import com.customer.service.requestDto.CustomerRequestDto;
import com.customer.service.responseDto.CustomerResponseDto;

public interface CustomerService {

	// CREATE
	CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto);
	
	// UPDATE
	CustomerResponseDto updateCustomer(Integer customerId ,CustomerRequestDto customerRequestDto);
	
	// DELETE
	CustomerResponseDto deleteCustomer(Integer customerId);
	
	// GET ALL
	List<CustomerResponseDto> getAllCustomers();
	
	// GET BY ID
	CustomerResponseDto getCustomerById(Integer customerId);
	
	// GET BY EMPLOYEE
	List<CustomerResponseDto> getCustomerByEmployeeId(Integer employeeId);
	
}
