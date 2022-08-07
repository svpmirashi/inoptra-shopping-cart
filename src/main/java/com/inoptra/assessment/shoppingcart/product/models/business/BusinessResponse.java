package com.inoptra.assessment.shoppingcart.product.models.business;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;

import lombok.Data;

@Data
public class BusinessResponse<T> extends ResponseEntity<T> {

	public BusinessResponse(@Nullable T body, HttpStatus status) {
		super(body, status);
	}
	
	

}
