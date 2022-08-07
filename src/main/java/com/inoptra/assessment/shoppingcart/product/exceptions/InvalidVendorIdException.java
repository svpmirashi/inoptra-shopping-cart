package com.inoptra.assessment.shoppingcart.product.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidVendorIdException extends RuntimeException implements Serializable{
	private static final long serialVersionUID = 1L;
}
