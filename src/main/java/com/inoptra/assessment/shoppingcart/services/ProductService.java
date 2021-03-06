package com.inoptra.assessment.shoppingcart.services;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcart.models.ProductItem;
import com.inoptra.assessment.shoppingcart.repositories.ProductRepository;

@Service
public class ProductService {
    
	@Autowired
    private ProductRepository productRepository;
    
//    public ProductService(@Autowired ProductRepository productRepository) {
//    	this.productRepository = productRepository;
//    }
    
    private static final Logger logger = Logger.getLogger(ProductService.class.getName());
    public List<ProductItem> findAll() {
        if(logger.isLoggable(Level.ALL)) {
            logger.fine("ProductService::findAll ==> Searching for all product items");
        }
        return productRepository.findAll();
    }
    public List<ProductItem> findByName(String name){
        if(logger.isLoggable(Level.ALL)) {
            logger.info("ProductService::findByName ==> Searching for name = " + name);
        }
        return productRepository.findByName(name);
    }

    public List<ProductItem> findByTitle(String title){
        if(logger.isLoggable(Level.ALL)) {
            logger.fine("ProductService::findByTitle ==> Searching for title = " + title);
        }
        return productRepository.findByTitle(title);
    }

    public ProductItem saveOrUpdate(ProductItem productItem){
        if(logger.isLoggable(Level.ALL)) {
            logger.fine("ProductService::saveOrUpdate ==> productItem = " + productItem.toString());
        }
        return productRepository.save(productItem);
    }

    public void deleteById(Long id) {
        if(logger.isLoggable(Level.FINE)) {
            logger.fine("ProductService::deleteById ==> id = " + id);
        }
        productRepository.deleteById(id);
    }

    public Optional<ProductItem> findById(Long id) {
        if(logger.isLoggable(Level.FINE)) {
            logger.fine("ProductService::findById ==> id = " + id);
        }
        return productRepository.findById(id);
    }
}
