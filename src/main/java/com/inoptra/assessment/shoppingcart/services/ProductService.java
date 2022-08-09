package com.inoptra.assessment.shoppingcart.services;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcart.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.repositories.ProductRepository;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ProductService - Service layer for ProductItem object
**/

@Service
public class ProductService {
    
	@Autowired
    private ProductRepository productRepository;
    
    private static final Logger logger = Logger.getLogger(ProductService.class.getName());
    
    
    public List<ProductItem> findAll() {

        logger.fine("ProductService::findAll ==> Searching for all product items");

        return productRepository.findAll();
    }
    
    
    
    public Optional<ProductItem> findById(Long id) {
        
        logger.fine("ProductService::findById ==> id = " + id);
        
        return productRepository.findById(id);
    }
    
    
    public List<ProductItem> findByName(String name){

         logger.info("ProductService::findByName ==> Searching for ProductItem by name = " + name);

        return productRepository.findByName(name);
    }
    
    
    public List<ProductItem> findByKeyword(String keyword){
       
        logger.info("ProductService::findByKeyword ==> Searching for ProductItem by keyword = " + keyword);
        
        return productRepository.findByKeyword(keyword);
    }
    

//    public List<ProductItem> findByTitle(String title){
//        if(logger.isLoggable(Level.ALL)) {
//            logger.fine("ProductService::findByTitle ==> Searching for title = " + title);
//        }
//        return productRepository.findByTitle(title);
//    }

    
    public ProductItem saveOrUpdate(ProductItem productItem){

        logger.info("ProductService::saveOrUpdate ==> productItem = " + productItem.toString());
        
        return productRepository.save(productItem);
    }

    
    public void deleteById(Long id) {

    	logger.fine("ProductService::deleteById ==> id = " + id);
        
    	productRepository.deleteById(id);
    }
    
}
