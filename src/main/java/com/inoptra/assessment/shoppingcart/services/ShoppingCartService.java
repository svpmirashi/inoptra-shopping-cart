package com.inoptra.assessment.shoppingcart.services;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcart.models.entities.ShoppingCart;
import com.inoptra.assessment.shoppingcart.repositories.ShoppingCartRepository;
import com.inoptra.assessment.shoppingcart.repositories.ShoppingCartRepositoryImpl;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ShoppingCartService - Service layer for ShoppingCart object
**/

@Service
public class ShoppingCartService {
    
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	@Autowired
    private ShoppingCartRepositoryImpl shoppingCartRepositoryImpl;
    
    private static final Logger logger = Logger.getLogger(ShoppingCartService.class.getName());
    
    
    public List<ShoppingCart> findAll() {

    	logger.info("ShoppingCartService::findAll ==> Searching for all Shopping Carts");

        return shoppingCartRepository.findAll();
    }
    
     
    public Optional<ShoppingCart> findById(Long id) {

        logger.info("ShoppingCartService::findById ==> id = " + id);

        return shoppingCartRepository.findById(id);
    }
    

    
    public ShoppingCart saveOrUpdate(ShoppingCart shoppingCart){
        
        logger.info("ShoppingCartService::saveOrUpdate ==> ShoppingCart = " + shoppingCart.toString());
        
        return shoppingCartRepository.save(shoppingCart);
    }

    
    public void deleteById(Long id) {

        logger.info("ShoppingCartService::deleteById ==> id = " + id);

        shoppingCartRepository.deleteById(id);
    }


	public ShoppingCart addToCart(Long shoppingCartId, List<Long> productIds) {

		logger.info("ShoppingCartService::addToCart ==> shoppingCartId = " + shoppingCartId + ", productIds = " + productIds);
		
		// If given id does not exist, then create a shopping cart
		// if given shopping cart exists, add to existing shopping cart
		
		ShoppingCart shoppingCart = shoppingCartRepositoryImpl.addProductsToCart(shoppingCartId, productIds); // findById(shoppingCartId).get();
															
																	
		//if(!shoppingCartOpt.isPresent()) throw new EntityNotFoundException(String.format("ShoppingCart with id [%s] does not exist", String.valueOf(shoppingCartId)));
		
		
		return shoppingCart;
	}
	
   
}
