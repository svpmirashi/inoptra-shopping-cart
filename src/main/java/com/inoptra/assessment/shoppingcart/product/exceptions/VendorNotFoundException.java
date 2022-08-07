package com.inoptra.assessment.shoppingcart.product.exceptions;

import java.io.Serializable;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Custom Exception to be thrown when Vendor not present in the persistence layer
**/

public class VendorNotFoundException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public VendorNotFoundException() {
		super("Vendor Not Found");
	}
	
	
	public VendorNotFoundException(String message) {
		super(message);
	}
	
	
	public VendorNotFoundException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
	
}
