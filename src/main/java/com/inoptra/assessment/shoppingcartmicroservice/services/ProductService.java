package com.inoptra.assessment.shoppingcartmicroservice.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.persistence.JoinColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.assessment.shoppingcartmicroservice.models.ProductItem;
import com.inoptra.assessment.shoppingcartmicroservice.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    private static final Logger logger = Logger.getLogger(ProductService.class.getName());
    public List<ProductItem> findAll() {
        if(logger.isLoggable(Level.FINE)) {
            logger.fine("ProductService::findAll ==> Searching for all product items");
        }
        return productRepository.findAll();
    }
    public List<ProductItem> findByName(String name){
        if(logger.isLoggable(Level.FINE)) {
            logger.fine("ProductService::findByName ==> Searching for name = " + name);
        }
        return productRepository.findByName(name);
    }

    public List<ProductItem> findByTitle(String title){
        if(logger.isLoggable(Level.FINE)) {
            logger.fine("ProductService::findByTitle ==> Searching for title = " + title);
        }
        return productRepository.findByTitle(title);
    }

    public ProductItem saveOrUpdate(ProductItem productItem){
        if(logger.isLoggable(Level.FINE)) {
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
