package com.inoptra.assessment.shoppingcart.product.controllers;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import com.inoptra.assessment.shoppingcart.product.models.ProductItem;
import com.inoptra.assessment.shoppingcart.product.services.ProductService;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	
   @Autowired
    private ProductService productService;
    
    public ProductController(@Autowired ProductService productService) {
    	this.productService = productService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<ProductItem>> getAProductItemsByName(
                                        @RequestParam(name = "name", required = false) String name,
                                        @RequestParam(name = "title", required = false) String title
                                    ) {
    	List<ProductItem> result = null;
    	
        if(!Objects.isNull(name) && !name.isEmpty()) { 
        	result = productService.findByName(name);
        }
        else if(!Objects.isNull(title) && !title.isEmpty()) {
        	result = productService.findByTitle(title);
        }
        else {
        	result = productService.findAll();
        }
        
        logger.info(result.toString());
        return new ResponseEntity (result, HttpStatus.FOUND);

    }

    @GetMapping(path = {"/{id}", "/product/{id}"})
    public ResponseEntity<ProductItem> getProductItemsById(@PathVariable(name = "id", required = true) Long id){
        if(Objects.isNull(id) || id <= 0) throw new InvalidProductItemIdException();
        
        Optional<ProductItem> optProductItem = productService.findById(id);;
        
        ProductItem item = optProductItem.get();
        
        if(optProductItem.isPresent())
        	logger.info(item.toString());
        
        //HttpHeaders headers = new HttpHeaders();
        //headers.add("Content-Type", "application/json");
        
        return new ResponseEntity<ProductItem>(item, null, HttpStatus.FOUND) ;
        //return optProductItem.get();
    }
    
    @PostMapping(path = "/add")
    public ResponseEntity<ProductItem> addEmployee(@RequestBody ProductItem productItem){
    	
    	//if(logger.isDebugEnabled())
    	logger.info(productItem.toString());
    	
    	return  new ResponseEntity<>(productService.saveOrUpdate(productItem), HttpStatus.CREATED);
    }
}
