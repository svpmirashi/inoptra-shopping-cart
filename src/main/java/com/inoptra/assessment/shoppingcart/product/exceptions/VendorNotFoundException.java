package com.inoptra.assessment.shoppingcart.product.exceptions;

import java.io.Serializable;

public class VendorNotFoundException extends RuntimeException implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public VendorNotFoundException() {
		super();
	}
	
	public VendorNotFoundException(String message) {
		super(message);
	}
	public VendorNotFoundException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
}
