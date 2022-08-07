package com.inoptra.assessment.shoppingcart.product.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler(value = InvalidProductItemIdException.class)
	public ResponseEntity<String> handleProductException(Exception ex){
		return new ResponseEntity<>("Invalid Product ID entered", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = ProductItemNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(Exception ex){
		return new ResponseEntity<>("Product Not Found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = StackOverflowError.class)
	public ResponseEntity<String> handleStackOverflowError(Exception ex){
		return new ResponseEntity<String>("Wrong JPA mapping", HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handleGeneralException(Exception ex){
		return new ResponseEntity<String>("Invalid inputs..", HttpStatus.BAD_REQUEST);
	}
}
