package com.inoptra.assessment.shoppingcart.product.exceptions.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.inoptra.assessment.shoppingcart.product.exceptions.InvalidProductItemIdException;
import com.inoptra.assessment.shoppingcart.product.exceptions.ProductItemNotFoundException;

@RestControllerAdvice
public class ProductResponseEntityExceptionHandler {
    @ExceptionHandler(value = {InvalidProductItemIdException.class, ProductItemNotFoundException.class})
    protected ResponseEntity<String> handleProductItemException(RuntimeException ex, WebRequest request){
        if(ex instanceof InvalidProductItemIdException) {
            return ResponseEntity.badRequest().body("Invalid Product_Item_ID provided.");
        } else if (ex instanceof ProductItemNotFoundException) {
            return new ResponseEntity<>("ProductItem not found for given request - " + request.getContextPath(), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.internalServerError().body("Unexpected error occurred while processing request - " + request.getContextPath());
    }

}
