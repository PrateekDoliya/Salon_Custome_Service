package com.customer.service.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse <T>{

	private String message;
	private Boolean success;
	private T data;
	
}
