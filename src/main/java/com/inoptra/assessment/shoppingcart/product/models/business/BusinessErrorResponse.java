package com.inoptra.assessment.shoppingcart.product.models.business;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class BusinessErrorResponse<T> extends BusinessResponse<T> {

	public BusinessErrorResponse(T body, HttpStatus status) {
		super(body, status);
	}

}
