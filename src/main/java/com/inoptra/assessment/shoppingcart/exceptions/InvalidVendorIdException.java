package com.inoptra.assessment.shoppingcart.exceptions;

import java.io.Serializable;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Custom Exception to be thrown when Vendor ID is invalid
**/

public class InvalidVendorIdException extends RuntimeException implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	public InvalidVendorIdException(){
		super("Invalid Vendor ID");
	}
	
	
	public InvalidVendorIdException(String message) {
		super(message);
	}
	
	
	public InvalidVendorIdException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
	
}
