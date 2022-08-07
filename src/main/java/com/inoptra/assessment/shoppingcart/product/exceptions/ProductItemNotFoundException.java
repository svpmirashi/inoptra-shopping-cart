package com.inoptra.assessment.shoppingcart.product.exceptions;

import java.io.Serializable;

public class ProductItemNotFoundException extends RuntimeException implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public ProductItemNotFoundException() {
		super();
	}
	
	public ProductItemNotFoundException(String message) {
		super(message);
	}
	public ProductItemNotFoundException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
}
