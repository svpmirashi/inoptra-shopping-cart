package com.inoptra.assessment.shoppingcart.exceptions.handlers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.inoptra.assessment.shoppingcart.exceptions.ApiError;
import com.inoptra.assessment.shoppingcart.exceptions.EntityNotFoundException;
import com.inoptra.assessment.shoppingcart.exceptions.InvalidProductItemIdException;
import com.inoptra.assessment.shoppingcart.exceptions.ProductItemNotFoundException;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* Handle exceptions thrown from different layers of application
**/

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationExceptionHandler.class);
	
	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}
	   
	private ResponseEntity<Object> buildResponseEntity(HttpStatus status, String message, Throwable ex) {
		
		 ApiError apiError = new ApiError(status, message, ex);
		 return new ResponseEntity<>(apiError, status);
	 }

	
	@ExceptionHandler(EntityNotFoundException.class)
	protected ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException ex,  WebRequest request) {
		
		String message = String.format("EntityNotFoundException: Invalid ID entered [Request: %s], Detailed Exception: %s", request.getContextPath(), ex.getMessage());
		
		logger.info(message);
		
		return buildResponseEntity(HttpStatus.NOT_FOUND, ex.getMessage(), ex);
	}


	@ExceptionHandler(value = InvalidProductItemIdException.class)
	protected ResponseEntity<Object> handleProductException(Exception ex,  WebRequest request){
		
		String message = String.format("Invalid Product ID entered [Request: %s], Detailed Exception: %s", request.getContextPath(), ex.getMessage());
		
		logger.info(message);
		
		return buildResponseEntity(HttpStatus.BAD_REQUEST, message, ex);
	}
	
	
	@ExceptionHandler(value = ProductItemNotFoundException.class)
	protected ResponseEntity<Object> handleProductNotFoundException(Exception ex,  WebRequest request){
		
		String message = String.format("Product Not Found [Request: %s], Detailed Exception: %s", request.getContextPath(), ex.getMessage());
		
		logger.info(message);
		
		 return buildResponseEntity(HttpStatus.BAD_REQUEST, message, ex);
	}
	
	
	@ExceptionHandler(value = StackOverflowError.class)
	protected ResponseEntity<Object> handleStackOverflowError(Exception ex,  WebRequest request){
		
		String message = String.format("Wrong JPA mapping [Request: %s]", request.getContextPath());

		logger.info(message);

		return buildResponseEntity(HttpStatus.BAD_GATEWAY, message, ex);
	}
	
	
	
	@ExceptionHandler(value = IllegalArgumentException.class)
	protected ResponseEntity<Object> handleIllegalArgumentException(Exception ex,  WebRequest request){
		
		String message = String.format("Given ID does not exist or Entity Not Found [Request: %s]", request.getContextPath());
		
		logger.info(message);
		
		return buildResponseEntity(HttpStatus.BAD_REQUEST, message, ex);
	}
	
	
	@ExceptionHandler(value = Throwable.class)
	protected ResponseEntity<Object> handleGeneralException(Throwable ex,  WebRequest request){
		
		String message = String.format("Something went wrong [Request: %s]", request.getContextPath());
		
		logger.info(message);
		
		return buildResponseEntity(HttpStatus.BAD_REQUEST, message, ex);
	}
	
}
