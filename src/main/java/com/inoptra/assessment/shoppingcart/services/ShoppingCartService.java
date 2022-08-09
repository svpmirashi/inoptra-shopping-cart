package com.inoptra.assessment.shoppingcart.services;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcart.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.models.entities.ShoppingCart;
import com.inoptra.assessment.shoppingcart.repositories.ProductRepository;
import com.inoptra.assessment.shoppingcart.repositories.ShoppingCartRepository;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ShoppingCartService - Service layer for ShoppingCart object
**/

@Service
public class ShoppingCartService {
    
	@Autowired
    private ShoppingCartRepository shoppingCartRepository;
    
    private static final Logger logger = Logger.getLogger(ShoppingCartService.class.getName());
    
    
    public List<ShoppingCart> findAll() {

    	logger.fine("ShoppingCartService::findAll ==> Searching for all Shopping Carts");

        return shoppingCartRepository.findAll();
    }
    
     
    public Optional<ShoppingCart> findById(Long id) {

        logger.fine("ShoppingCartService::findById ==> id = " + id);

        return shoppingCartRepository.findById(id);
    }
    

    
    public ShoppingCart saveOrUpdate(ShoppingCart shoppingCart){
        
        logger.info("ShoppingCartService::saveOrUpdate ==> ShoppingCart = " + shoppingCart.toString());
        
        return shoppingCartRepository.save(shoppingCart);
    }

    
    public void deleteById(Long id) {

        logger.fine("ShoppingCartService::deleteById ==> id = " + id);

        shoppingCartRepository.deleteById(id);
    }

   
}
