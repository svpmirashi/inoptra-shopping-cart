package com.inoptra.assessment.shoppingcart.controllers;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RestController;

import com.inoptra.assessment.shoppingcart.exceptions.ShoppingCartNotFoundException;
import com.inoptra.assessment.shoppingcart.models.entities.ShoppingCart;
import com.inoptra.assessment.shoppingcart.services.ShoppingCartService;

/**
* @Author: Shrikrishna Prabhumirashi
* @Description:
* ShoppingCartController provides different REST API Endpoints for ShoppingCart
**/


@RestController
@RequestMapping(value = "/shopping-carts")
public class ShoppingCartController {
	final static Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@GetMapping(value = {"/", ""})
	public ResponseEntity<List<ShoppingCart>> getAllShoppingCarts(){
		return new ResponseEntity<>(shoppingCartService.findAll(), HttpStatus.FOUND);
	}
	
	
	@GetMapping(value = {"/{id}", "/{id}/"})
	public ResponseEntity<ShoppingCart> getShoppingCart(@PathVariable(value = "id", required = true) Long sid){
		ShoppingCart shoppingCart = shoppingCartService
																.findById(sid)
																.orElseThrow(ShoppingCartNotFoundException :: new);
		
		return new ResponseEntity<> (shoppingCart, HttpStatus.FOUND);
	}
	
	
	@PutMapping(value = {"/{id}", "/{id}/"})
	public ResponseEntity<ShoppingCart> update(@PathVariable(value = "id", required = true) Long sid, @RequestBody ShoppingCart shoppingCart) {
		Optional<ShoppingCart> shoppingCartOpt = shoppingCartService.findById(sid);
		
		if(!shoppingCartOpt.isPresent()) { 
			return new ResponseEntity<> ( shoppingCartService.saveOrUpdate(shoppingCart), HttpStatus.CREATED);
		}
		
		return new ResponseEntity<> ( shoppingCartService.saveOrUpdate(shoppingCart), HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping(value = { "/add", "/add/"})
	public ResponseEntity<ShoppingCart> save(@RequestBody ShoppingCart shoppingCart) {
		return new ResponseEntity<> ( shoppingCartService.saveOrUpdate(shoppingCart), HttpStatus.CREATED);
	}
}
