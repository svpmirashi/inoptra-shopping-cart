package com.inoptra.assessment.shoppingcart.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvalidProductItemIdException extends RuntimeException implements Serializable{
	private static final long serialVersionUID = 1L;
}
