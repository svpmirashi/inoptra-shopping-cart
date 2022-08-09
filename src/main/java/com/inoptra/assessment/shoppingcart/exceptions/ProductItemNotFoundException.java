package com.inoptra.assessment.shoppingcart.exceptions;

import java.io.Serializable;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Custom Exception to be thrown when Product Item not present in the persistence layer
**/

public class ProductItemNotFoundException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	public ProductItemNotFoundException() {
		super("Product Not Found");
	}
	
	
	public ProductItemNotFoundException(String message) {
		super(message);
	}
	
	
	public ProductItemNotFoundException(String message, Throwable ex) {
		super(message, ex.getCause());
	}
	
}
