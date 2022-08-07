package com.inoptra.assessment.shoppingcart.product.exceptions;

import java.io.Serializable;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Custom Exception to be thrown when Product Item ID is invalid
**/

public class InvalidProductItemIdException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public InvalidProductItemIdException(){
		super("Invalid Product ID");
	}
	
	
	public InvalidProductItemIdException(String message) {
		super(message);
	}
	
	
	public InvalidProductItemIdException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
}
