package com.inoptra.assessment.shoppingcart.controllers;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inoptra.assessment.shoppingcart.exceptions.InvalidProductItemIdException;
import com.inoptra.assessment.shoppingcart.models.ProductItem;
import com.inoptra.assessment.shoppingcart.services.ProductService;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
//	@Autowired
    private ProductService productService;
    
    public ProductController(@Autowired ProductService productService) {
    	this.productService = productService;
    }

    @RequestMapping(path = "/all")
    public List<ProductItem> getAProductItemsByName(
                                        @RequestParam(name = "name", required = false) String name,
                                        @RequestParam(name = "title", required = false) String title
                                    ) {
        if(!Objects.isNull(name) && !name.isEmpty()) return productService.findByName(name);

        if(!Objects.isNull(title) && !title.isEmpty()) return productService.findByTitle(title);

        return productService.findAll();

    }

    @RequestMapping(path = "/{id}")
    public ResponseEntity<ProductItem> getProductItemsById(@PathVariable(name = "id", required = true) Long id){
        if(Objects.isNull(id) || id <= 0) throw new InvalidProductItemIdException();

        return ResponseEntity.ok(productService.findById(id).orElse(null));
    }
}
