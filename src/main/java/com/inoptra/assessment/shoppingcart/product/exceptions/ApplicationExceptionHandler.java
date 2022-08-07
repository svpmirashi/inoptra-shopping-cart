package com.inoptra.assessment.shoppingcart.product.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
//	@ExceptionHandler(value = StackOverflowError.class)
//	public ResponseEntity<String> handleStackOverflowError(){
//		return new ResponseEntity<String>("Wrong JPA mapping", HttpStatus.BAD_GATEWAY);
//	}
	
//	@ExceptionHandler(value = Exception.class)
//	public ResponseEntity<String> handleGeneralException(){
//		return new ResponseEntity<String>("Invalid inputs..", HttpStatus.BAD_REQUEST);
//	}
}
