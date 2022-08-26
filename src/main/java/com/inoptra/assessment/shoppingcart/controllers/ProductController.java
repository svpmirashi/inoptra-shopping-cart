package com.inoptra.assessment.shoppingcart.controllers;


import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inoptra.assessment.shoppingcart.exceptions.InvalidProductItemIdException;
import com.inoptra.assessment.shoppingcart.exceptions.ProductItemNotFoundException;
import com.inoptra.assessment.shoppingcart.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.services.ProductService;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ProductController provides different REST API Endpoints for products
**/

@RestController
@RequestMapping(path = "/products")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
   @Autowired
    private ProductService productService;

   
    @GetMapping(value = { "/"})
    public ResponseEntity<List<ProductItem>> getProductItemsAllOrByKeyword(
                                        @RequestParam(name = "keyword", required = false) String keyword
                                    ) {
    	List<ProductItem> result = null;
    	
    	// Valid keyword
        result = (!Objects.isNull(keyword) && !keyword.isEmpty()) ? 
        					productService.findByKeyword(keyword) : productService.findAll();
        
        // Valid result
        if(Objects.isNull(result) || result.isEmpty()) 
        	throw new ProductItemNotFoundException();
        
        return new ResponseEntity<> (result, HttpStatus.FOUND);

    }
    
    
    @GetMapping(path = {"/{id}"})
    public ResponseEntity<ProductItem> getProductItemsById(@PathVariable(name = "id", required = true) Long id){
        
    	if(Objects.isNull(id) || id <= 0) throw new InvalidProductItemIdException();
        
        ProductItem item = productService
        									.findById(id)
        									.orElseThrow(InvalidProductItemIdException::new);
        
        return new ResponseEntity<>(item, null, HttpStatus.FOUND) ;
    }
    
    
    @PostMapping(path = { "/add" })
    public ResponseEntity<ProductItem> addProductItem(@RequestBody ProductItem productItem){

    	return  new ResponseEntity<>(productService.saveOrUpdate(productItem), HttpStatus.CREATED);
    }
    
    
    @PutMapping(path =  {"/{id}"})
    public ResponseEntity<ProductItem> updateProductItem(@RequestBody ProductItem productItem){

    	return  new ResponseEntity<>(productService.saveOrUpdate(productItem), HttpStatus.NO_CONTENT);
    }
    
}
