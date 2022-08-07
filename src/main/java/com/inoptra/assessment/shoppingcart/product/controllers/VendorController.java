package com.inoptra.assessment.shoppingcart.product.controllers;

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

import com.inoptra.assessment.shoppingcart.product.exceptions.ProductItemNotFoundException;
import com.inoptra.assessment.shoppingcart.product.models.entities.ProductItem;
import com.inoptra.assessment.shoppingcart.product.models.entities.Vendor;
import com.inoptra.assessment.shoppingcart.product.services.VendorService;

@RestController
@RequestMapping(value = "/vendors")
public class VendorController {
	final static Logger logger = LoggerFactory.getLogger(VendorController.class);
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping(value = {"/", ""})
	public ResponseEntity<List<Vendor>> getAllVendors(){
		return new ResponseEntity<>(vendorService.getAllVendors(), HttpStatus.FOUND);
	}
	
	@GetMapping(value = {"/{id}", "/{id}/"})
	public ResponseEntity<Vendor> getVendor(@PathVariable(value = "id", required = true) Long vid){
		Optional<Vendor> vendorOpt = vendorService
					.getVendor(vid);
		
		
		if(!vendorOpt.isPresent()) 
			return ResponseEntity
						.notFound()
						.build();
		
		//vendorOpt.get().getProductItemsForSale().forEach(x -> logger.info( x.toString()));
		return new ResponseEntity<> (vendorOpt.get(), HttpStatus.FOUND);
		
	}
	
	@GetMapping(value = { "/{id}/products", "/{id}/products/"})
	public ResponseEntity<List<ProductItem>> getProductItemsFromVendor(@PathVariable(value = "id", required = true) Long vid){
		Optional<Vendor> vendorOpt = vendorService
																	.getVendor(vid);
		
		
		if(!vendorOpt.isPresent()) 
				throw new ProductItemNotFoundException();
				
		//vendorOpt.get().getProductItemsForSale().forEach(x -> logger.info( x.toString()));
		return new ResponseEntity<> (vendorOpt.get().getAvailableProductItems(), HttpStatus.FOUND);
		
	}
	
	@PutMapping(value = {"/{id}", "/{id}/"})
	public ResponseEntity<Vendor> update(@PathVariable(value = "id", required = true) Long vid, @RequestBody Vendor vendor) {
		Optional<Vendor> vendorOpt = vendorService.getVendor(vid);
		
		if(!vendorOpt.isPresent()) { 
			return new ResponseEntity<> ( vendorService.saveOrUpdate(vendor), HttpStatus.CREATED);
		}
		
		return new ResponseEntity<> ( vendorService.saveOrUpdate(vendor), HttpStatus.ACCEPTED);
	}
	
	@PostMapping(value = { "/add", "/add/"})
	public ResponseEntity<Vendor> save(@RequestBody Vendor vendor) {
		return new ResponseEntity<> ( vendorService.saveOrUpdate(vendor), HttpStatus.CREATED);
	}
}
