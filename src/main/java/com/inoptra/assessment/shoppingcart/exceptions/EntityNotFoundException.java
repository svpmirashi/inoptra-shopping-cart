package com.inoptra.assessment.shoppingcart.exceptions;

import java.io.Serializable;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Custom Exception to be thrown when Vendor not present in the persistence layer
**/

public class EntityNotFoundException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public EntityNotFoundException() {
		super("Entity Not Found");
	}
	
	
	public EntityNotFoundException(String message) {
		super(message);
	}
	
	
	public EntityNotFoundException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
	
}
