package com.inoptra.assessment.shoppingcart.product.controllers;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inoptra.assessment.shoppingcart.product.exceptions.InvalidProductItemIdException;
import com.inoptra.assessment.shoppingcart.product.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.product.services.ProductService;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	
   @Autowired
    private ProductService productService;

    @GetMapping(value = { "/", "" })
    public ResponseEntity<List<ProductItem>> getAProductItemsByKeyword(
                                        @RequestParam(name = "keyword", required = false) String keyword
                                    ) {
    	List<ProductItem> result = null;
    	
        if(!Objects.isNull(keyword) && !keyword.isEmpty()) { 
        	result = productService.findByKeyword(keyword);
        }
        else {
        	result = productService.findAll();
        }
        
        //logger.info(result.toString());
        return new ResponseEntity (result, HttpStatus.FOUND);

    }
    @GetMapping(path = {"/{id}", "/{id}/", "/product/{id}", "/product/{id}/"})
    public ResponseEntity<ProductItem> getProductItemsById(@PathVariable(name = "id", required = true) Long id){
        if(Objects.isNull(id) || id <= 0) throw new InvalidProductItemIdException();
        
        Optional<ProductItem> optProductItem = productService.findById(id);;
        
        ProductItem item = optProductItem.orElseThrow(InvalidProductItemIdException::new);
        
        return new ResponseEntity<ProductItem>(item, null, HttpStatus.FOUND) ;
    }
    
    @PostMapping(path = { "/add", "/add/" })
    public ResponseEntity<ProductItem> addEmployee(@RequestBody ProductItem productItem){
    	
    	//if(logger.isDebugEnabled())
    	logger.info(productItem.toString());
    	
    	return  new ResponseEntity<>(productService.saveOrUpdate(productItem), HttpStatus.CREATED);
    }
}
