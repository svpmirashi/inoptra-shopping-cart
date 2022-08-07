package com.inoptra.assessment.shoppingcart.product.exceptions.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.inoptra.assessment.shoppingcart.product.exceptions.InvalidProductItemIdException;
import com.inoptra.assessment.shoppingcart.product.exceptions.ProductItemNotFoundException;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Handle exceptions thrown from different layers of application
**/

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationExceptionHandler.class);
	
	
	@ExceptionHandler(value = InvalidProductItemIdException.class)
	public ResponseEntity<String> handleProductException(Exception ex,  WebRequest request){
		
		String message = String.format("Invalid Product ID entered [Request: %s]", request.getContextPath());
		
		logger.info(message);
		
		return new ResponseEntity<>(message , HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(value = ProductItemNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(Exception ex,  WebRequest request){
		
		String message = String.format("Product Not Found [Request: %s]", request.getContextPath());
		
		logger.info(message);
		
		return new ResponseEntity<>(message , HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = StackOverflowError.class)
	public ResponseEntity<String> handleStackOverflowError(Exception ex,  WebRequest request){
		
		String message = String.format("Wrong JPA mapping [Request: %s]", request.getContextPath());

		logger.info(message);

		return new ResponseEntity<>(message, HttpStatus.BAD_GATEWAY);
	}
	
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handleGeneralException(Exception ex,  WebRequest request){
		
		String message = String.format("Something went wrong [Request: %s]", request.getContextPath());
		
		logger.info(message);
		
		return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		
	}
	
}
