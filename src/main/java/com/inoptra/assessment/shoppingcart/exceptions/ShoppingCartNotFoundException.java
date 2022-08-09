package com.inoptra.assessment.shoppingcart.exceptions;

import java.io.Serializable;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Custom Exception to be thrown when Vendor not present in the persistence layer
**/

public class ShoppingCartNotFoundException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public ShoppingCartNotFoundException() {
		super("Vendor Not Found");
	}
	
	
	public ShoppingCartNotFoundException(String message) {
		super(message);
	}
	
	
	public ShoppingCartNotFoundException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
	
}
